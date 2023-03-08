package com.yoruk.proxy;

import com.yoruk.model.Comment;

public class EmailNotificationProxy implements CommentNotificationProxy{

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment : "+comment.getText());
    }
}