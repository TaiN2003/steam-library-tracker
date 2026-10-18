package com.tai.steamlibrarytracker;

public class Game {
    private String name;
    private int appId;
    private int playtimeForever;

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

    public void setappId(int appId) {
        this.appId = appId;
    }

    public void setPlaytimeForever(int playtimeForever) {
        this.playtimeForever = playtimeForever;
    }
}
