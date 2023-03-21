package com.cicd.cicdactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdActionsApplication {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to CI/CD";
    }

    public static void main(String[] args) {
        SpringApplication.run(CicdActionsApplication.class, args);
    }

}

/* echo "# github-cicd" >> README.md
        git init
        git add README.md
        git commit -m "first commit"
        git branch -M main
        git remote add origin https://github.com/JanetKalu/github-cicd.git
        git push -u origin main

 */