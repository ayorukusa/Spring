package com.yoruk;

import com.yoruk.model.Comment;
import com.yoruk.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class YorukApplication {

    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        ApplicationContext context = SpringApplication.run(YorukApplication.class, args);

        CommentService cs = context.getBean(CommentService.class);

        cs.publishComment(comment);
    }

}
