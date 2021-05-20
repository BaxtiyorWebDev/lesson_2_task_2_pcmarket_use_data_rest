package uz.pdp.online.lesson_2_task_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.lesson_2_task_2.entity.Comment;
import uz.pdp.online.lesson_2_task_2.projection.CustomComment;

@RepositoryRestResource(path = "comment", excerptProjection = CustomComment.class)
public interface CommentRepos extends JpaRepository<Comment, Integer> {
}
