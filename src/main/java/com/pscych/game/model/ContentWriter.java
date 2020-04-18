package com.pscych.game.model;

import org.aspectj.weaver.IClassFileProvider;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "content_writer")
public class ContentWriter extends Employee{
}
