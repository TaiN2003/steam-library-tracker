package com.tai.steamlibrarytracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class SteamService {
    
    @Value("${steam.api-key}")
    private String apiKey;

    @GetMapping("/test/api")
    public String getApiConfirmation() {
        if (apiKey != null && !apiKey.isBlank()) {
            return "api has value";
        }
        else {
            return "api has no value";
        }
    }
}
