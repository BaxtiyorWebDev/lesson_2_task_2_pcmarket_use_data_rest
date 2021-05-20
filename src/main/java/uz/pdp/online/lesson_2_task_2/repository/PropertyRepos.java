package uz.pdp.online.lesson_2_task_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.lesson_2_task_2.entity.Property;
import uz.pdp.online.lesson_2_task_2.projection.CustomProperty;

@RepositoryRestResource(path = "property", excerptProjection = CustomProperty.class)
public interface PropertyRepos extends JpaRepository<Property, Integer> {
}
