package com.pscych.game.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "question")
public class Question extends Auditable {

    @NotNull @Getter @Setter
    private String question;

    @NonNull @Getter @Setter
    private String correctAnswer;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "question")
    @Getter @Setter
    private Set<EllenAnswer> ellenAnswers = new HashSet<>();

    @Enumerated(EnumType.STRING)
    @Getter @Setter
    private GameMode gameMode;

    public Question(@NotNull String question, @NonNull String correctAnswer, Set<EllenAnswer> ellenAnswers, GameMode gameMode) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.ellenAnswers = ellenAnswers;
        this.gameMode = gameMode;
    }
}
