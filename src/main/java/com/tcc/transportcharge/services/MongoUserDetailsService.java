package com.tcc.transportcharge.services;

import com.tcc.transportcharge.entities.AccountCredentials;
import com.tcc.transportcharge.daos.AccountCredentialsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import java.util.Arrays;
import java.util.List;
@Component
public class MongoUserDetailsService implements UserDetailsService{
    @Autowired
    private AccountCredentialsRepository repository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AccountCredentials user = repository.findByName(username);
        if(user == null) {
            throw new UsernameNotFoundException("User not found");
        }

        List<SimpleGrantedAuthority> authorities = Arrays.asList(new SimpleGrantedAuthority("user"));
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        User userValidation =  new User(user.getName(), bCryptPasswordEncoder.encode(user.getKey()), authorities);
        return userValidation;
    }
}
