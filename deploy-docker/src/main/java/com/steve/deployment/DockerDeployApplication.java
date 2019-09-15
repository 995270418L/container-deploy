package com.steve.deployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DockerDeployApplication {

    @GetMapping("/home")
    public String home(){
        return "Hello, docker world";
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerDeployApplication.class, args);
    }

}
