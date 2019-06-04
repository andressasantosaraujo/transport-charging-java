package com.tcc.transportcharge.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
public class UserData implements Serializable {

    private static final long serialVersionUID = 1943584345911056087L;

    @Id
    @Getter
    @Setter
    private String id;
    @Getter
    @Setter
    @DBRef
    private AccountCredentials accountCredentials;
    @Getter
    @Setter
    private String contact;
    @Getter
    @Setter
    private String email;
    @Getter
    @Setter
    private String address;
    @Getter
    @Setter
    private String numberAddress;
    @Getter
    @Setter
    private String creditCardNumber;
    @Getter
    @Setter
    private String numberCreditCCV;

    public UserData(){
    }

    public UserData(String contact, String email, String address, String numberAddress, String creditCardNumber, String numberCreditCCV, AccountCredentials accountCredentials) {
        this.contact = contact;
        this.email = email;
        this.address = address;
        this.numberAddress = numberAddress;
        this.creditCardNumber = creditCardNumber;
        this.numberCreditCCV = numberCreditCCV;
        this.accountCredentials = accountCredentials;
    }
}
