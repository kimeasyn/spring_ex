package com.example.helloworld.controller;

import com.example.demo.dto.PostDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostController {

    @PostMapping("/post1")
    public void post(@RequestBody PostDto requestData) {
        System.out.println(requestData.toString());
    }
}
