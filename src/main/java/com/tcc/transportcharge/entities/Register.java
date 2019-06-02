package com.tcc.transportcharge.entities;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

public class Register implements Serializable {

    private static final long serialVersionUID = -2216756051002651100L;

    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String key;
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
    private String NumberCreditCCV;


    public Register(){

    }

    public Register(String name, String key, String contact, String email, String address, String numberAddress, String creditCardNumber, String NumberCreditCCV){
        this.name = name;
        this.key = key;
        this.contact = contact;
        this.email = email;
        this.address = address;
        this.numberAddress = numberAddress;
        this.creditCardNumber = creditCardNumber;
        this.NumberCreditCCV = NumberCreditCCV;
    }

}
