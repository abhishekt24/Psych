package com.pscych.game.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.annotation.Generated;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class Auditable implements Serializable {

    @Id
    @GeneratedValue(generator = "sequence" , strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "sequence" , allocationSize = 10)
    @Getter
    @Setter
    private Long id;

    @Column(nullable = false , updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    @Setter
    @Getter
    private Date createdDate = new Date();

    @Column(nullable = false)
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Setter
    @Getter
    private Date updatedDate;
}
