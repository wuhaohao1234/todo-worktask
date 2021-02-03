package com.todo.task.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HelloController {
    @RequestMapping("hello")
    String hello() {
        return "hello 阿布";
    }
}
