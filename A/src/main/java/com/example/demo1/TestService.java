package com.example.demo1;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {

    public String getValueFromSecondController() {
        RestTemplate restTemplate = new RestTemplate();
        String url
                = "http://localhost:5556/second";
        String value = restTemplate
                .getForObject(url, String.class);
        return value;
    }
}
