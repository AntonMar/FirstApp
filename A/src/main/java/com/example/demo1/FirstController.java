package com.example.demo1;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/first")
public class FirstController {

    TestService testService;

    public FirstController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping()
    public String getValue() {
        return testService.getValueFromSecondController();
    }
}
