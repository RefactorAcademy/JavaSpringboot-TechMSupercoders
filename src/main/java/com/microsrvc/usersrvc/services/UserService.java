package com.microsrvc.usersrvc.services;

import com.microsrvc.usersrvc.entitites.User;
import org.springframework.stereotype.Service;

@Service()
public class UserService {

    public void addUser(User user){
        System.out.print("Inside service layer : ");
        System.out.println(user);
    }

}
