package uz.pdp.online.lesson_2_task_2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_2_task_2.entity.Supplier;

@Projection(types = Supplier.class)
public interface CustomSupplier {

    Integer getId();

    String getName();

    String getEmail();

}
