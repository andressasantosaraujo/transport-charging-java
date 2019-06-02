package com.tcc.transportcharge.daos;

import com.tcc.transportcharge.entities.UserData;
import org.springframework.data.mongodb.repository.MongoRepository;

import javax.validation.constraints.Email;

public interface UserDataRepository extends MongoRepository<UserData, String> {
    UserDataRepository findByEmail(String email);
}
