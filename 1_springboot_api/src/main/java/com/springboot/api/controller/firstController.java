package com.springboot.api.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.HashMap;

@RestController // Controller + ResponseBody 합친 어노테이션 json객체 return
@RequestMapping("/users")
public class firstController {

    @GetMapping // API 메서드 지정으로 GET 방식
    public Map<String, Object> getUser() {
        Map<String, Object> result = new HashMap<>();
        result.put("status", 200);
        result.put("message", "GET 요청 성공");
        return result;
    }

    @PostMapping // API 메서드 지정으로 POST 방식
    public Map<String, Object> postUser() {
        Map<String, Object> result = new HashMap<>();
        result.put("status", 200);
        result.put("message", "POST 요청 성공");
        return result;
    }

    @PutMapping // API 메서드 지정으로 PUT 방식
    public Map<String, Object> putUser() {
        Map<String, Object> result = new HashMap<>();
        result.put("status", 200);
        result.put("message", "PUT 요청 성공");
        return result;
    }

    @DeleteMapping // API 메서드 지정으로 DELETE 방식
    public Map<String, Object> deleteUser() {
        Map<String, Object> result = new HashMap<>();
        result.put("status", 200);
        result.put("message", "DELETE 요청 성공");
        return result;
    }

}
