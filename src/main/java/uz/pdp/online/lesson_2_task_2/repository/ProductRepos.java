package uz.pdp.online.lesson_2_task_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.lesson_2_task_2.entity.Product;
import uz.pdp.online.lesson_2_task_2.projection.CustomProduct;

@RepositoryRestResource(path = "product", excerptProjection = CustomProduct.class)
public interface ProductRepos extends JpaRepository<Product, Integer> {
}
