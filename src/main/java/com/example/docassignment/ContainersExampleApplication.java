package com.example.docassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ContainersExampleApplication {

    @RequestMapping("/")
    public String index() {
        return "<body><h1> Containerization and orchestration </h1>" +
                "<h2>Dockerizing Springboot backend app</h2>" +
                "<p> With docker, we can containerize SEP4 BE and FE apps</p></body>";
    }
    public static void main(String[] args) {


        SpringApplication.run(ContainersExampleApplication.class,args);
}

}