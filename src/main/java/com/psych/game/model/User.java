package com.psych.game.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User extends Auditable {

    public User(){

    }

    public User(User user) {
        this.email = user.email;
        this.roles = user.roles;
        this.saltedHashedPassword =
    }

    @Column(unique = true)
    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private String saltedHashedPassword;

    @ManyToMany
    @Getter
    @Setter
    private Set<Role> roles = new HashSet<>();

}
