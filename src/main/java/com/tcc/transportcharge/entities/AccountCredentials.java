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
    private String name;
    @Getter
    @Setter
    private String key;

    @JsonCreator
    public AccountCredentials() {
    }

    @JsonCreator
    public AccountCredentials(@JsonProperty("name") String username,@JsonProperty("key") String password) {
        this.name = username;
        this.key = password;
    }
}