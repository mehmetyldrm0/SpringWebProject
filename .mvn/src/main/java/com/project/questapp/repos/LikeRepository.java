package com.project.questapp.repos;

import com.project.questapp.entities.Like;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import java.util.List;

public interface LikeRepository extends JpaRepositoryImplementation<Like,Long> {

    List<Like> findByUserId(Long userId);

    List<Like> findByUserIdAndPostId(Long userId, Long postId);

    List<Like> findByPostId(Long postId);
}
