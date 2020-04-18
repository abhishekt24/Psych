package com.pscych.game.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name="player")
public class Player extends User {

    @NotBlank
    @Getter
    @Setter
    private String alias;

    @Getter
    @Setter
    private String psychFaceUrl;

    @Getter
    @Setter
    private String picUrl;

    @OneToOne(cascade = CascadeType.ALL)
    @Getter
    @Setter
    private Stats stats = new Stats();

    @ManyToMany(mappedBy = "players")
    @Setter
    @Getter
    private Set<Game> games = new HashSet<>();

    public Player(@NotBlank String alias, String psychFaceUrl, String picUrl) {
        this.alias = alias;
        this.psychFaceUrl = psychFaceUrl;
        this.picUrl = picUrl;
    }
}
