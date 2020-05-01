package com.pscych.game;

import com.pscych.game.model.*;
import com.pscych.game.repository.GameRepository;
import com.pscych.game.repository.PlayerRepository;
import com.pscych.game.repository.QuestionRepository;
import com.pscych.game.repository.RoleRepository;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api")

public class GameController {

    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    GameRepository gameRepository;

    @GetMapping("/hello")
    String hello(){
        return "hello world";
    }

    @GetMapping("/populate")
    void populate(){

        Player player = new Player("abhi","psychface","pic");
        Question question = new Question("what is the name of statue","liberty", GameMode.IS_THIS_A_FACT);
        playerRepository.save(player);
        questionRepository.save(question);
        Set<Player> players = new HashSet<>();
        players.add(player);
        Game game = new Game();
        game.setPlayers(players);
        game.setLeader(player);
        gameRepository.save(game);

        Role role = new Role();
        role.setName("ROLE1");
        role.setDescription("yes");
        roleRepository.save(role);
    }



    @GetMapping("/players")
    List<Player> getPlayers(){

        return playerRepository.findAll();
    }

    @GetMapping("/player/{id}")
    Player getPlayer(@PathVariable(name = "id") Long id){

        return playerRepository.findById(id).orElseThrow(ArithmeticException::new);
    }


    @GetMapping("/questions")
    List<Question> getQuestions(){

        return questionRepository.findAll();
    }

    @GetMapping("/question/{id}")
    Optional getQuestion(@PathVariable(name = "id") Long id){

        return questionRepository.findById(id);
    }

    @GetMapping("/games")
    List<Game> getGames(){

        return gameRepository.findAll();
    }

    @GetMapping("/game/{id}")
    Optional getGame(@PathVariable(name = "id") Long id){

        return gameRepository.findById(id);
    }

}
