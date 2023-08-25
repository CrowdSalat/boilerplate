package com.example.demo

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import com.example.demo.RestController
import com.google.gson.Gson

@WebMvcTest(RestController::class)
@AutoConfigureMockMvc
// to deactivate Security for test
//@AutoConfigureMockMvc (addFilters = false)
class RestControllerTest {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun `test sayHello endpoint`() {
        val expectedResponse = "Hello, Kotlin!"

        mockMvc.perform(MockMvcRequestBuilders.get("/api/hello")
            .accept(MediaType.APPLICATION_JSON))
            .andExpect(MockMvcResultMatchers.status().isOk)
            .andExpect(MockMvcResultMatchers.content().string(expectedResponse))
    }

    @Test
    fun `test processExample endpoint`() {

        val exampleDto = ExampleDTO(name = "Alice", age = 28)
        val gson = Gson()
        val exampleDtoJson = gson.toJson(exampleDto)

        val expectedResponse = "Received example data: Name=Alice, Age=28"

        mockMvc.perform(MockMvcRequestBuilders.post("/api/example")
            .contentType(MediaType.APPLICATION_JSON)
            .content(exampleDtoJson))
            .andExpect(MockMvcResultMatchers.status().isOk)
            .andExpect(MockMvcResultMatchers.content().string(expectedResponse))
    }

    @Test
    fun `test processExample with validation error`() {
        val invalidExampleDto = ExampleDTO(name = "Bob", age = 101)
        val gson = Gson()
        val invalidExampleDtoJson = gson.toJson(invalidExampleDto)

        mockMvc.perform(MockMvcRequestBuilders.post("/api/example")
            .contentType(MediaType.APPLICATION_JSON)
            .content(invalidExampleDtoJson))
            .andExpect(MockMvcResultMatchers.status().isBadRequest())
    }

}
