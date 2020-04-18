package com.pscych.game;

import com.pscych.game.model.Question;
import com.pscych.game.repository.PlayerRepository;
import com.pscych.game.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class GameController {

    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    QuestionRepository questionRepository;

    @GetMapping("/hello")
    String hello(){
        return "hello world";
    }

    @GetMapping("/populate")
    void populate(){

        
    }
}
