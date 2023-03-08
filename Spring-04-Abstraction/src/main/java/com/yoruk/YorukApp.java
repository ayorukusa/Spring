package com.yoruk;

import com.yoruk.config.ProjectConfig;
import com.yoruk.model.Comment;
import com.yoruk.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class YorukApp {
    public static void main(String[] args) {
        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService commentService =context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
