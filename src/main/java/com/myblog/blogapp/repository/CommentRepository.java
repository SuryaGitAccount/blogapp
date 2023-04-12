package com.myblog.blogapp.repository;

import com.myblog.blogapp.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long> {//DAO OR REPOSITORY LAYER

    List<Comment> findByPostId(long postId);


}
