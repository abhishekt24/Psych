package com.psych.game.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name = "round")
public class Round extends Auditable{

    @ManyToOne
    @Getter @Setter
    private Game game;

    @NonNull
    @Getter @Setter
    private int numRound;

    @ManyToOne
    @Getter @Setter
    @NonNull
    private Question question;

    @ManyToMany(cascade = CascadeType.ALL )
    @Getter @Setter
    private Map<Player,PlayerAnswer> playerAnswers = new HashMap<>();

    @ManyToMany(cascade = CascadeType.ALL )
    @Getter @Setter
    private Map<Player, PlayerAnswer> selectedAnswers = new HashMap<>();

    @ManyToOne
    @Getter @Setter
    private EllenAnswer ellenAnswer;
}
