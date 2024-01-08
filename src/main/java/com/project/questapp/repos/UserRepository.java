package com.project.questapp.repos;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import com.project.questapp.entities.User;

public interface UserRepository extends JpaRepositoryImplementation<User, Long>{
	// jpa repository select , delete save gibi metodları barındırıyor

}
