package com.openapi.dev.service;

import com.openapi.dev.model.UserRegistration;
import com.openapi.dev.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    UserRepository userRepository;



    public UserRegistration getUserById(int customerId){

        return userRepository.findById(customerId).get();
    }




}
