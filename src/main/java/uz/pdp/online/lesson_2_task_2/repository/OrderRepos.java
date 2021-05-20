package uz.pdp.online.lesson_2_task_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.lesson_2_task_2.entity.Order;
import uz.pdp.online.lesson_2_task_2.projection.CustomOrder;

@RepositoryRestResource(path = "order", excerptProjection = CustomOrder.class)
public interface OrderRepos extends JpaRepository<Order, Integer> {
}
