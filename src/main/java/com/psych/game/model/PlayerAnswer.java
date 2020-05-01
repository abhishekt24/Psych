package com.psych.game.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "playeranswer")
public class PlayerAnswer extends Auditable{

    @ManyToOne
    @NonNull @Getter @Setter
    private Round round;

    @ManyToOne
    @NonNull @Getter @Setter
    private Player player;

    @NonNull @Getter @Setter
    private String answer;

}
