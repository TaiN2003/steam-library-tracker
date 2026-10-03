package com.tai.steamlibrarytracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SteamController {
    
    private final SteamService steamService;

    public SteamController(SteamService steamService) {
        this.steamService = steamService;
    }

    @GetMapping("/test/api")
    public String getSteamCall() {
        return steamService.getApiConfirmation();
    }
}
