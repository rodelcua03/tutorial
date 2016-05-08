package com.achilles.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by rodel on 5/8/16.
 */
@Entity
@Table(name = "user")
public class User {

    private long id;
    private String username;
    private String password;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
