package com.nicole.test.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
public class DemoController {

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Integer add(@RequestBody Map<String, Integer> data) {
        Integer a = data.get("a");
        Integer b = data.get("b");
        return a + b;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(Integer a, Integer b) {
        return a + b;
    }
}
