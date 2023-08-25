package com.example.demo

// jakarta.* instead of javax since Spring Boot 3
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size

data class ExampleDTO(
    // Why is field: needed: https://kotlinlang.org/docs/annotations.html#annotation-use-site-targets
    @field:NotBlank(message = "Name is required")
    @field:Size(min = 2, message = "Name must have at least 2 characters")
    val name: String,

    @field:Min(value = 0, message = "Age must be at least 0")
    @field:Max(value = 99, message = "Age must be below 100")
    val age: Int
)