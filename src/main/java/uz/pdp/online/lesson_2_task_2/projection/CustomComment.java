package uz.pdp.online.lesson_2_task_2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_2_task_2.entity.Comment;

@Projection(types = Comment.class)
public interface CustomComment {

    Integer getId();

    Integer getUser();

    Integer getProduct();

    String getText();


}
