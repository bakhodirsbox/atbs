package com.atbs.base;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "created_at")
    private Date createdAt = new Date();

    @Setter
    @Column(name = "modified_at")
    private Date modifiedAt;

    public void setId(Long id){
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
