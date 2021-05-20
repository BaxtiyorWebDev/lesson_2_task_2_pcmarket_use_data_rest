package uz.pdp.online.lesson_2_task_2.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_2_task_2.entity.InputProduct;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {

    Integer getId();

    Integer getSupplier();

    Integer getProductList();

    Integer getQuantity();

    Integer getAmount();
}
