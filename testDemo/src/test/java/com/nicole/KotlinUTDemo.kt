package com.nicole

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.web.context.WebApplicationContext

@RunWith(SpringRunner::class)
@SpringBootTest
class KotlinUTDemo {

    @Autowired
    lateinit var wac: WebApplicationContext;
    lateinit var mockMvc: MockMvc;

    @Test
    fun testDemoController() {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();

        var pathRes = mockMvc.perform(
                MockMvcRequestBuilders
                        .get("/aa"))
                .andExpect(MockMvcResultMatchers.status().isOk)
                .andReturn()
        println(pathRes.response.contentAsString);
    }

}