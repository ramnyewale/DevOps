package com.java.sprin.cicd.jenkins.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/jenkins-application")
    public String getResponse(){
        System.out.println("Product controller api triggered...!!");
        return "Welcome to first Jenkins CICD project...!!!!";
    }

    public void printmMessage(){
        System.out.println("THis code is added with git reset, rebase, and revert pupose.");
    }
}
