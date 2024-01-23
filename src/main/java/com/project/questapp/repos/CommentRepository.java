package com.project.questapp.repos;

import com.project.questapp.entities.Comment;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import java.util.List;

public interface CommentRepository extends JpaRepositoryImplementation<Comment,Long> {


    List<Comment> findByUserIdAndPostId(Long userId, Long postId);

    List<Comment> findByUserId(Long userId);

    List<Comment> findByPostId(Long postId);
}
