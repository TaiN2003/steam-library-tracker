package com.tai.steamlibrarytracker;

import org.junit.jupiter.api.Test;
import tools.jackson.databind.ObjectMapper;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OwnedGamesResponseTest {

    @Test
    void mapesGameCount() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();

        String json = """
            {
                "game_count": 2
            }
            """;
        OwnedGamesResponse response = objectMapper.readValue(json, OwnedGamesResponse.class);
        assertEquals(2, response.getGameCount());
    }
}
