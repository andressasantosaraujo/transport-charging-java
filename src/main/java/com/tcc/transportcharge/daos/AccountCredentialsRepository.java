package com.tcc.transportcharge.daos;

import com.tcc.transportcharge.entities.AccountCredentials;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountCredentialsRepository extends MongoRepository<AccountCredentials, String> {
    AccountCredentials findByUsername(String Username);

}
