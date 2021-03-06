package com.example.demo2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/second")
public class SecondController {

    @GetMapping()
    public String getValue() {
        return "return-value";
    }
}
