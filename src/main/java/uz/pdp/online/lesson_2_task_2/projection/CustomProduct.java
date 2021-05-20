package uz.pdp.online.lesson_2_task_2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_2_task_2.entity.Attachment;
import uz.pdp.online.lesson_2_task_2.entity.Category;
import uz.pdp.online.lesson_2_task_2.entity.Product;

@Projection(types = Product.class)
public interface CustomProduct {

    Integer getId();

    String getName();

    boolean isActive();

    double getPrice();

    Integer getGuaranty();

    String getInfo();

    Category getCategory();

    Attachment getAttachment();

    boolean isSale();

}
