package uz.pdp.online.lesson_2_task_2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_2_task_2.entity.OutputProduct;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {

    Integer getId();

    Integer  getBasket();
}
