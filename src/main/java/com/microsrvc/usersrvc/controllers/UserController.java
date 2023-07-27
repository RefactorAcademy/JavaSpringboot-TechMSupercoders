package com.microsrvc.usersrvc.controllers;

import com.microsrvc.usersrvc.entitites.User;
import com.microsrvc.usersrvc.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/user")    /// http requests ----> localhost:8080/user
public class UserController {

    //  HTTP METHODS ---> POST ( CREATE SOME NEW ENTRY IN OUR DB ), PUT ( MODIFY ), GET ( FETCH ), DELETE
  @Autowired()
  private UserService userService;    // dependency injection  ( field based di, constructor based di, method based di )





    @PostMapping("/add")
    public String addUsers(@RequestBody() User user){
        System.out.println("Inside User Controller");
        // pass it on to our service layer
        this.userService.addUser(user);
        return "Users fetched";
    }

    @GetMapping("/test")
    public String fetchUsers(){
        return "Users fetched";
    }

    @PutMapping("/test")
    public String updateUsers(){
        return "Users fetched";
    }

}
