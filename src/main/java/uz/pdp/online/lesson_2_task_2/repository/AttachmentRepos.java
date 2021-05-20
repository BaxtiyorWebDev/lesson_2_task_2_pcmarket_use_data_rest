package uz.pdp.online.lesson_2_task_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.online.lesson_2_task_2.entity.Attachment;

public interface AttachmentRepos extends JpaRepository<Attachment, Integer> {
}
