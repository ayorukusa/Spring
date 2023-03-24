package com.yoruk.service;

import com.yoruk.model.Comment;
import com.yoruk.proxy.CommentNotificationProxy;
import com.yoruk.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CommentService {

//    @Value("${name}")
//    private String x;
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;
public CommentService(CommentRepository commentRepository, @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }
    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
