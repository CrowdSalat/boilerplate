package de.weyrich.example.springsecurity.restendpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleRestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

}
