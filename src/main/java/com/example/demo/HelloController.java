package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	public final String TEST = "This is a test";

    @RequestMapping("/HelloController")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
