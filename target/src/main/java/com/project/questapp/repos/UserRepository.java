package com.project.questapp.repos;

import com.project.questapp.entities.User;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface UserRepository extends JpaRepositoryImplementation<User,Long> {
}
