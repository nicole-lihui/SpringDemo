package com.maxwit.demo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.maxwit.demo.Model.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoControllerTests {

    @Autowired
    WebApplicationContext wac;
    MockMvc mockMvc;

    @Test
    public void testDemo() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();

        MvcResult pathRes = mockMvc.perform(
                MockMvcRequestBuilders
                .get("/user/nicole/access"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andReturn();
        System.out.println(pathRes.getResponse().getContentAsString());

        MvcResult fromRes = mockMvc.perform(
                MockMvcRequestBuilders
                .get("/user")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("name", "Nicole"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andDo(MockMvcResultHandlers.print())
            .andReturn();
        System.out.println(fromRes.getResponse().getContentAsString());

        ObjectMapper om = new ObjectMapper();
        User u = new User(1, "Nicole");
        String uStr = om.writeValueAsString(u);
        MvcResult jsonRes = mockMvc.perform(MockMvcRequestBuilders
                .post("/user")
                .contentType(MediaType.APPLICATION_JSON)
                .content(uStr))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andReturn();
        System.out.println(jsonRes.getResponse().getContentAsString());
    }
}
