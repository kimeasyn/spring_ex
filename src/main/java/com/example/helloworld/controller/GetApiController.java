package com.example.helloworld.controller;

import com.example.helloworld.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello")
    public String getHello(){
        return "get hello";
    }


    @GetMapping(path = "/path-variable/{id}")
    public String pathVariable(@PathVariable(name = "id") String pathname){
        System.out.println(pathname);
        return pathname;
    }


    @GetMapping(path = "/query-param")
    public String queryParam(@RequestParam Map<String, String> query_param) {
        StringBuilder sb = new StringBuilder();
        query_param.entrySet().forEach(entry -> {
            System.out.println("entry.getKey() = " + entry.getKey());
            System.out.println("entry.getKey() = " + entry.getValue());
            System.out.println("\n");
            sb.append(entry.getKey() + " = " + entry.getValue());
        });
        return sb.toString();
    }

    @GetMapping(path = "/query-param2")
    public String queryParam2(
            @RequestParam String name,
            @RequestParam int age) {
        System.out.println(name);

        return name + " " + age;
    }

    @GetMapping(path = "/query-param3")
    public String queryParam3(UserRequest ur) {
        System.out.println(ur.getName());
        System.out.println(ur.getAge());

        return ur.toString();
    }
}
