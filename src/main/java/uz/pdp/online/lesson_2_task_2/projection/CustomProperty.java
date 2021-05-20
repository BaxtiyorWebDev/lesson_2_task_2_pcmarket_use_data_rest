package uz.pdp.online.lesson_2_task_2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_2_task_2.entity.Property;

@Projection(types = Property.class)
public interface CustomProperty {

    Integer getId();

    String getName();

    Integer getCharacteristics();

}
