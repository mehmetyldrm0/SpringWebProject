package com.project.questapp.repos;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import com.project.questapp.entities.Like;
// jpa repository select , delete save gibi metodları barındırıyor
public interface LikeRepository extends JpaRepositoryImplementation<Like, Long>{
	
	

}
