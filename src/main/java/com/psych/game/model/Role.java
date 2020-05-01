package com.psych.game.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "role")
public class Role extends Auditable{

    @Setter
    @Getter
    @NotBlank
    @Column(unique = true)
    private String name;
    @Setter
    @Getter
    @NotBlank
    private String description;
}
