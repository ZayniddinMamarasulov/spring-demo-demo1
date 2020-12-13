package com.example.demo1;

import com.example.demo1.dto.MessageDemo2Dto;
import com.example.demo1.dto.MessageDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {

    private final Demo2Service demo2Service;

    public TestController(Demo2Service demo2Service) {
        this.demo2Service = demo2Service;
    }

    @GetMapping
    public String hello() {
        return "Hello from Demo1" + demo2Service.hello();
    }

    @GetMapping("message")
    public MessageDto message(Long id) {
        MessageDemo2Dto responseFromDemo2 = demo2Service.message(id);
        return new MessageDto(
                responseFromDemo2.getId(),
                responseFromDemo2.getMessage(),
                new Date().getTime()
        );
    }
}
