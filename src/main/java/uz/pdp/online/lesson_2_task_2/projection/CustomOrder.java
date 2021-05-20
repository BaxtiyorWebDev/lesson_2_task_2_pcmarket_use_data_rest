package uz.pdp.online.lesson_2_task_2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_2_task_2.entity.Order;

import java.sql.Date;

@Projection(types = Order.class)
public interface CustomOrder {

    Integer getId();

    Date getDate();

    Integer getBasket();

    boolean isActive();

    String getCommentText();

    String getDetail();


}
