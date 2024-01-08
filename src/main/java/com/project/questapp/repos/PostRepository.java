package com.project.questapp.repos;
import java.util.List;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import com.project.questapp.entities.Post;
// jpa repository select , delete save gibi metodları barındırıyor
public interface PostRepository extends JpaRepositoryImplementation<Post, Long>{

	List<Post> findByUserId(Long userId);

}
