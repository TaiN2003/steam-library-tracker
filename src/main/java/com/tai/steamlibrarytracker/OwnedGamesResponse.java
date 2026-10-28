package com.tai.steamlibrarytracker;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class OwnedGamesResponse {
    @JsonProperty("game_count")
    private int gameCount;
    private List<Game> games;

    public OwnedGamesResponse() {
    }

    public int getGameCount() {
        return gameCount;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGameCount(int gameCount) {
        this.gameCount = gameCount;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}
