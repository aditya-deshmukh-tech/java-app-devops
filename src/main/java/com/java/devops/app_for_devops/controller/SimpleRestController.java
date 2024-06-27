package com.java.devops.app_for_devops.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
public class SimpleRestController {

    @GetMapping("/current/time")
    public ResponseEntity<?> getCurrentTimeDetails() {
        Map<String, String> dateMap = new HashMap<>();
        dateMap.put("date" , LocalDateTime.now().toString());
        return ResponseEntity.ok(dateMap);
    }
}
