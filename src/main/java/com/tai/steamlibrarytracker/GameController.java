package com.tai.steamlibrarytracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {
    
    @GetMapping("/test/{name}/{steamId}")
    public Game getGame(@PathVariable String name, @PathVariable int steamId) {
        Game testGame = new Game(name, steamId);
        
        return testGame;
    }
}
