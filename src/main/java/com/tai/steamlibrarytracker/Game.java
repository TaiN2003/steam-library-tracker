package com.tai.steamlibrarytracker;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Game {
    private String name;
    @JsonProperty("appid")
    private int appId;
    @JsonProperty("playtime_forever")
    private int playtimeForever;

    public Game() {    
    }
    
    public Game(String name, int appId, int playtimeForever) {
        this.name = name;
        this.appId = appId;
        this.playtimeForever = playtimeForever;
    }

    public String getName() {
        return name;
    }

    public int getAppId() {
        return appId;
    }

    public int getPlaytimeForever() {
        return playtimeForever;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    public void setPlaytimeForever(int playtimeForever) {
        this.playtimeForever = playtimeForever;
    }
}
