package com.bookmyshow.demo.controllers;

import com.bookmyshow.demo.Repository.UserRepository;
import com.bookmyshow.demo.dto.SignUpUserRequestDto;
import com.bookmyshow.demo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public User signUp(SignUpUserRequestDto request){
        Optional<User> user = userRepository.findByEmail(request.getEmail());
        if(user.isEmpty()){
            throw new RuntimeException();
        }
        User newuser=new User();
        newuser.setName(request.getName());
        newuser.setEmail(request.getEmail());
        newuser.setPassword(request.getPassword());
        return userRepository.save(newuser);

    }
}
