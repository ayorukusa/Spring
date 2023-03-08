package com.yoruk.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.yoruk")
@ComponentScan(basePackages = {"com.yoruk.proxy","com.yoruk.service","com.yoruk.repository"})
public class ProjectConfig {
}
