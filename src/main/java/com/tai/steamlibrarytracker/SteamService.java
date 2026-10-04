package com.tai.steamlibrarytracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class SteamService {
    
    @Value("${steam.api-key}")
    private String apiKey;

    @Value("${steam.steam-id}")
    private String steamId;

    public String getApiConfirmation() {
        if (apiKey != null && !apiKey.isBlank()) {
            return "api has value";
        }
        else {
            return "api has no value";
        }
    }

    RestClient steamClient = RestClient.create();

    public String getOwnedGames() {
        return steamClient
            .get()
            .uri("https://api.steampowered.com/IPlayerService/GetOwnedGames/v1/?key=" + apiKey + "&steamid=" + steamId + "&include_appinfo=true")
            .retrieve()
            .body(String.class);
    }
}
