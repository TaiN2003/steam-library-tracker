package com.tai.steamlibrarytracker;

public class Game {
    private String name;
    private int steamId;

    public Game(String name, int steamId) {
        this.name = name;
        this.steamId = steamId;
    }

    public String getName() {
        return name;
    }

    public int getSteamId() {
        return steamId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setsteamId(int steamId) {
        this.steamId = steamId;
    }
}
