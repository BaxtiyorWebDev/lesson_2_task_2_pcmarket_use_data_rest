package uz.pdp.online.lesson_2_task_2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_2_task_2.entity.Characteristics;

@Projection(types = Characteristics.class)
public interface CustomCharacteristics {

    Integer getId();

    String getName();

    Integer getProduct();

}
