package com.project.questapp.repos;
import com.project.questapp.entities.Post;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import java.util.List;

public interface PostRepository extends JpaRepositoryImplementation<Post,Long> {
    List<Post> findByUserId(Long userId);
}
