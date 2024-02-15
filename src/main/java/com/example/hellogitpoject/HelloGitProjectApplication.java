package com.example.hellogitpoject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class HelloGitProjectApplication {

    @GetMapping("/hi")
    public String hello() {
        return "Hello, Team!";
    }

    public static void main(String[] args) {

        SpringApplication.run(HelloGitProjectApplication.class, args);
    }
}
