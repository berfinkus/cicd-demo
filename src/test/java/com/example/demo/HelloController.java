package com.example.cicddemo;

import org.springframework.web.bind.annotation.getMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "<h1>🚀 CI/CD Basariyla Calisiyor!</h1><p>Jenkins, Docker ve GitHub el ele verdi.</p>";
    }
}
