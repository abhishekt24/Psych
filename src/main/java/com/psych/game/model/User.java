package com.psych.game.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
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
        this.saltedHashedPassword = user.saltedHashedPassword;
    }

    @Column(unique = true)
    @Getter
    @Setter
    private String email;

    @NotBlank
    @Getter
    private String saltedHashedPassword;

    public void setSaltedHashedPassword(String value) {
        this.saltedHashedPassword = new BCryptPasswordEncoder(5).encode(value);
    }

    @ManyToMany
    @Getter
    @Setter
    private Set<Role> roles = new HashSet<>();

}
