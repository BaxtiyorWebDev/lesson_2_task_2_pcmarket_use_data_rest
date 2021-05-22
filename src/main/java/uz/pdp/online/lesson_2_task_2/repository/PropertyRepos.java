package uz.pdp.online.lesson_2_task_2.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pdp.online.lesson_2_task_2.entity.Product;
import uz.pdp.online.lesson_2_task_2.entity.Property;
import uz.pdp.online.lesson_2_task_2.projection.CustomProperty;

@RepositoryRestResource(path = "property", excerptProjection = CustomProperty.class)
public interface PropertyRepos extends JpaRepository<Property, Integer> {

    @RestResource(path = "sort")
    public Page<Product> findAllByCharacteristicsId(@Param("charId") Integer characteristics_id, Pageable pageable);

}
    