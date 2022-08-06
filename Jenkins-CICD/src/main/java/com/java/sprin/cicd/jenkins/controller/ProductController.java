package com.java.sprin.cicd.jenkins.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/jenkins-application")
    public String getResponse(){
        System.out.println("Product controller api triggered");
        System.out.println("This line is added just for testing the git reset commandl");
        return "Welcome to first Jenkins CICD project.";

    }


}
