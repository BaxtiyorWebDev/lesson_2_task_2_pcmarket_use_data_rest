package uz.pdp.online.lesson_2_task_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.lesson_2_task_2.entity.Characteristics;
import uz.pdp.online.lesson_2_task_2.projection.CustomCharacteristics;

@RepositoryRestResource(path = "characteristics", excerptProjection = CustomCharacteristics.class)
public interface CharacteristicsRepos extends JpaRepository<Characteristics, Integer> {
}
