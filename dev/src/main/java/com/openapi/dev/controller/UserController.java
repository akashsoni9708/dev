package com.openapi.dev.controller;

import com.openapi.dev.model.UserRegistration;
import com.openapi.dev.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

   @GetMapping("/getuserbyId")
    private UserRegistration getRegistration(@PathVariable("customerid") int customerId){


       return userService.getUserById(customerId);
   }

}
