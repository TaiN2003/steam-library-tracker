package com.tai.steamlibrarytracker;

import org.junit.jupiter.api.Test;
import tools.jackson.databind.ObjectMapper;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OwnedGamesResponseTest {

    @Test
    void mapsGameCount() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();

        String json = """
            {
                "game_count": 2
            }
            """;
        OwnedGamesResponse response = objectMapper.readValue(json, OwnedGamesResponse.class);
        assertEquals(2, response.getGameCount());
    }

    @Test
    void mapsOwnedGamesResponse() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();

        String json = """
            {
                "games_count": 1,
                "games": [
                    {
                        "appid": 105600,
                        "name": "Terraria",
                        "playtime_forever": 120
                    }
                ]
            }
            """;

        OwnedGamesResponse response = objectMapper.readValue(json, OwnedGamesResponse.class);

        Game game = response.getGames().get(0);

        assertEquals("Terraria", game.getName());
        assertEquals(105600, game.getAppId());
        assertEquals(120, game.getPlaytimeForever());
    }
}
