package com.pscych.game.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.pl.NIP;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "admin")
public class Admin extends Employee{


}
