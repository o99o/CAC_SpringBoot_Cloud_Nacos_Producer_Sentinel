package com.zit.sentinel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

@RestController
@RequestMapping("webservice/sentinel")
public class SentinelController {
	@GetMapping("/hello")
    @SentinelResource(value="hello")// 添加注解
    public String hi(@RequestParam(value = "name", defaultValue = "nacos", required = false) String name) {
        return "hello" + name;
    }
}
