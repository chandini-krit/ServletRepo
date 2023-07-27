package com.example;

import lombok.Getter;
import lombok.Setter;

public class User {
    @Getter@Setter
    private String name;
    @Getter@Setter
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}

