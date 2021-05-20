package uz.pdp.online.lesson_2_task_2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_2_task_2.entity.Basket;

@Projection(types = Basket.class)
public interface CustomBasket {

    Integer getId();

    Integer getUser();

    Integer getProductList();

}
