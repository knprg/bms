package com.bookmyshow.demo.controllers;

import com.bookmyshow.demo.dto.SignUpUserDtoResponse;
import com.bookmyshow.demo.dto.SignUpUserRequestDto;
import com.bookmyshow.demo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    public SignUpUserDtoResponse signUp(SignUpUserRequestDto request){
      User user=userService.signUp(request);
        return new SignUpUserDtoResponse(user.getId(),ResponseStatus.SUCCESS);

    }
}
