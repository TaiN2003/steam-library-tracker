package com.tai.steamlibrarytracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SteamService {
    
    @Value("${steam.api-key}")
    private String apiKey;

    public String getApiConfirmation() {
        if (apiKey != null && !apiKey.isBlank()) {
            return "api has value";
        }
        else {
            return "api has no value";
        }
    }
}
