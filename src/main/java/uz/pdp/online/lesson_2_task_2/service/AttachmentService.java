package uz.pdp.online.lesson_2_task_2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.pdp.online.lesson_2_task_2.entity.Attachment;
import uz.pdp.online.lesson_2_task_2.payload.Result;
import uz.pdp.online.lesson_2_task_2.repository.AttachmentRepos;

import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.Optional;
import java.util.UUID;

@Service
public class AttachmentService {
    @Autowired
    AttachmentRepos attachmentRepos; // beanni chaqirish uchun

    private static final String UPLOADDIRECTORY = "yuklanganlar";



    public Result uploadFileToFileSystem(MultipartHttpServletRequest request) throws IOException {
//        System.out.println(System.currentTimeMillis());

        Iterator<String> fileNames = request.getFileNames();
        MultipartFile file = request.getFile(fileNames.next()); // 1 ta faylni oldik
        if (file != null) {
            String originalFilename = file.getOriginalFilename();
            Attachment attachment = new Attachment();
            attachment.setOriginalName(originalFilename);
            attachment.setOriginalSize(file.getSize());
            attachment.setContentType(file.getContentType());

            //uyga.borish.jpg
            String[] split = originalFilename.split("\\.");

            // a45170ca-a2e1-4e41-a8b4-f4fce1a4cc7c.jpg
            String name = UUID.randomUUID().toString()+"."+split[split.length-1];
            attachment.setName(name);
            attachmentRepos.save(attachment);
            Path path = Paths.get(UPLOADDIRECTORY+"/"+name);// qaysi papkada saqlash ko'rsatilyapti
            Files.copy(file.getInputStream(),path);// yuborilgan fayl saqlanadigan joy

//            System.out.println(System.currentTimeMillis());
            return new Result("Fayl saqlandi. ID si: "+attachment.getId(),true);
        }
        return new Result("Fayl saqlanmadi", false);
    }



    public void getFileFromSystem(Integer id, HttpServletResponse response) throws IOException {
        System.out.println(System.currentTimeMillis());

        Optional<Attachment> optionalAttachment = attachmentRepos.findById(id);
        if (optionalAttachment.isPresent()) {
            Attachment attachment = optionalAttachment.get();
            response.setHeader("Content-Disposition",
                    "attachment; filename=\"" + attachment.getOriginalName() + "\""); // faylni nomini berdik
            response.setContentType(attachment.getContentType());// faylni content-typeni berdik
            FileInputStream fileInputStream = new FileInputStream(UPLOADDIRECTORY+"/"+attachment.getName());// faylni olish
            FileCopyUtils.copy(fileInputStream, response.getOutputStream()); // faylni asosiy baytini berish uchun MO dan olib responsega stream qilib beryapmiz
            System.out.println(System.currentTimeMillis());
        }
    }
}
