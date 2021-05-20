package uz.pdp.online.lesson_2_task_2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_2_task_2.entity.User;

@Projection(types = User.class)
public interface CustomUser {

    Integer getId();

    String getName();

    String getAddress();

    String getPhoneNumber();

    String getEmail();

}
