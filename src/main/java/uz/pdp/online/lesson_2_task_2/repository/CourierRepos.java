package uz.pdp.online.lesson_2_task_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.lesson_2_task_2.entity.Courier;
import uz.pdp.online.lesson_2_task_2.projection.CustomCourier;

@RepositoryRestResource(path = "courier", excerptProjection = CustomCourier.class)
public interface CourierRepos extends JpaRepository<Courier, Integer> {
}
