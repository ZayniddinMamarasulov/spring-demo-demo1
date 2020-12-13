package com.example.demo1;

import com.example.demo1.dto.MessageDemo2Dto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("demo2")
interface Demo2Service {

    @GetMapping
    String hello();

    @PostMapping("message/{id}")
    MessageDemo2Dto message(@PathVariable Long id);
}
