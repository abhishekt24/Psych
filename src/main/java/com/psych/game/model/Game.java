package com.psych.game.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.*;

@Entity
@Table(name = "game")
public class Game extends Auditable{


    public Game(){

    }

    @ManyToMany
    @Getter
    @Setter
    private Set<Player> players = new HashSet<>();

    @Enumerated(EnumType.STRING)
    @Getter
    @Setter
    private GameMode gameMode;

    @OneToMany(mappedBy = "game")
    private List<Round> rounds = new ArrayList<>();

    private int numRounds = 10;

    @Getter @Setter
    private Boolean hasEllen = false;

    @Getter @Setter
    @NotNull
    @ManyToOne
    private Player leader;

    @ManyToMany
    @Getter @Setter
    Map<Player,Stats> playerStats = new HashMap<>();

    @Enumerated(EnumType.STRING)
    @Getter @Setter
    private GameStatus gameStatus;

    @ManyToMany
    @Getter @Setter
    private Set<Player> readyPlayers;


}
