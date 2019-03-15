package com.tcc.transportcharge.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
public class AccountCredentials implements Serializable {

    private static final long serialVersionUID = 1943584345911056087L;

    @Id
    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private String username;
    @Getter
    @Setter
    private String password;

    @JsonCreator
    public AccountCredentials() {
    }

    @JsonCreator
    public AccountCredentials(@JsonProperty("username") String username,@JsonProperty("password") String password) {
        this.username = username;
        this.password = password;
    }
}