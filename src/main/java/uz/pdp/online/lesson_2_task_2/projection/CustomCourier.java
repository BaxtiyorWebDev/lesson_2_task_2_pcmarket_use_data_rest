package uz.pdp.online.lesson_2_task_2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_2_task_2.entity.Courier;

@Projection(types = Courier.class)
public interface CustomCourier {

    Integer getId();

    String getFullName();

    String getEmail();

    String getMessage();
}
