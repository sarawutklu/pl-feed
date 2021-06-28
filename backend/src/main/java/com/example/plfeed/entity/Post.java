package com.example.plfeed.entity;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Setter(AccessLevel.PUBLIC)
@Getter(AccessLevel.PUBLIC)
@Entity
public class Post extends Auditable<String>  {

    @Id
    private String id = UUID.randomUUID().toString();

    private String text; 

    @Column(columnDefinition = "VARCHAR(36)")
    private String userId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId", referencedColumnName = "userId", columnDefinition = "VARCHAR(36)",
            nullable = true, unique = false, insertable = false, updatable = false)
    private User user;
}
