package com.yoruk.proxy;

import com.yoruk.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
