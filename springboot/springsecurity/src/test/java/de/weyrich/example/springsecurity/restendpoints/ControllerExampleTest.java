package de.weyrich.example.springsecurity.restendpoints;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class ControllerExampleTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHello() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello")
                .header("Authorization", "Bearer " + "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwOi8vZm9vYmFyLmNvbSIsInN1YiI6ImZvbyIsImF1ZCI6ImZvb2JhciIsIm5hbWUiOiJNciBGb28gQmFyIiwic2NvcGUiOiJyZWFkIiwiaWF0IjoxNTE2MjM5MDIyLCJleHAiOjI1MDAwMDAwMDB9.Oz2NDpN5-Ypq-a-cbjE-JH9E6S1Sya2ZsnuW9qRbFwNcCrqln3uGGyly6rWc6JKMD0ZHbf-kshuI1-ka4b2TPdFcYNCtOIgA4m_EiR3EecJMmjiINNGmRP8J7Mh83PRoKKVQOOKMhbAvB2J6jexB-kEGKlea92Ls6BgY0fuTgszkji8N12dZ4DsWNWBN2-0AFJAK7w9yogQOTFieWmP6NMmB8PPbR0WJqLFvkSjhaq2RR9-vxaSd2YyMAyGMDFrOV72-XbEenaKdzNY-kkknZvADRilta5T4EaaRnI2oI5GPX-UvIXiO_bqhgvXdy_2JRE9Zo3s55SVpE2JKWGHkZxDoKegdpSyaBaTvdvh_31kuQ6MbqD_XCemaUfXRCQlerNqk6OekG_aZWptd--jCUYNKhDCBiHuzifRE7TFECciJFlV7QyRPFcfV_an-UB0Cfm5CUfS1eXkLAFgvWNkOfIKt4kWHU0CsDnXLAPvnhqoqy4dbp4pBQuy5rnyktcE0dEGagwzGxccY1tAbuvvmikQU6axo7oid9Emu7kwll30yhE-C01gvAsbmFeaYKtgk3SgdtYztJY9dRKMrVeEE-Lb9I34XjnoBOutKgKHtSE5vPq99zDPHm7NkQuD6zibzKtCDlnQpx18SPKid-3lvOr9Im0zj04jusGmC8_kiTcI")
                )
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hello, World!"));
    }

}
