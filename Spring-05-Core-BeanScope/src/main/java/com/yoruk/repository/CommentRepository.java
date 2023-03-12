package com.yoruk.repository;

import com.yoruk.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
