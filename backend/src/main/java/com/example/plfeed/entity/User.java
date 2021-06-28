package com.example.plfeed.entity;

import java.util.List;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import lombok.AccessLevel;

@Setter(AccessLevel.PUBLIC)
@Getter(AccessLevel.PUBLIC)
@Entity
public class User extends Auditable<String> {

	@Id
    private String userId = UUID.randomUUID().toString();

    private String name;

    private String username;

    private String email;
 
    private String password;
    
    private String password2;

    // @OneToMany(mappedBy = "user",fetch = FetchType.LAZY)
	// private List<Post> post;
}