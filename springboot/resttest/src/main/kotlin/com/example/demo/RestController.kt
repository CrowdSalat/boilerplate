package com.example.demo

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
// jakarta.* instead of javax since Spring Boot 3
import jakarta.validation.Valid 

import com.example.demo.ExampleDTO

@RestController
@RequestMapping("/api")
class RestController {

    @GetMapping("/hello")
    fun sayHello(): ResponseEntity<String> {
        val message = "Hello, Kotlin!"
        return ResponseEntity(message, HttpStatus.OK)
    }

    @PostMapping("/example")
    // @Valid is needed so the validation annotations in ExampleDTO work (@Min, @Max, @NotBlank)
    fun processExample(@Valid @RequestBody exampleDto: ExampleDTO): ResponseEntity<String> {
        val responseMessage = "Received example data: Name=${exampleDto.name}, Age=${exampleDto.age}"
        return ResponseEntity(responseMessage, HttpStatus.OK)
    }
}
