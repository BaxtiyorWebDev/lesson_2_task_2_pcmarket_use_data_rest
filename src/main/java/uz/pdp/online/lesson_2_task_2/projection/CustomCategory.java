package uz.pdp.online.lesson_2_task_2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_2_task_2.entity.Category;

@Projection(types = Category.class)
public interface CustomCategory {

    Integer getId();

    String getName();

    Integer parentCategoryId();



}
