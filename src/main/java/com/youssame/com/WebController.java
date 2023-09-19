package com.youssame.com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @GetMapping("/api")
    public String endpoint() {
        return "endpoint";
    }
}
