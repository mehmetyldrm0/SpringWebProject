package com.project.questapp.repos;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import com.project.questapp.entities.Comment;
// jpa repository select , delete save gibi metodları barındırıyor
public interface CommentRepository extends JpaRepositoryImplementation<Comment, Long>{

}
