package com.nicole.controller;

import org.springframework.web.bind.annotation.*;


@RestController
public class VueController {
    private static Integer count = 0;

    @RequestMapping("/aa")
    public String test() {
        System.out.println(count);
        return "Hello, the click count is" + (count++);
    }
}
