package com.starhealth.eshop.controller;


import com.starhealth.eshop.Dto.ResponseDto;
import com.starhealth.eshop.exceptions.AuthenticationFailException;
import com.starhealth.eshop.exceptions.CustomException;
import com.starhealth.eshop.repository.UserRepository;
import com.starhealth.eshop.Dto.user.SignInDto;
import com.starhealth.eshop.Dto.user.SignInResponseDto;
import com.starhealth.eshop.Dto.user.SignupDto;
import com.starhealth.eshop.entity.User;
import com.starhealth.eshop.service.AuthenticationService;
import com.starhealth.eshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("user")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    AuthenticationService authenticationService;

    @Autowired
    UserService userService;

    @GetMapping("/all")
    public List<User> findAllUser(@RequestParam("token") String token) throws AuthenticationFailException {
        authenticationService.authenticate(token);
        return userRepository.findAll();
    }

    @PostMapping("/signup")
    public ResponseDto Signup(@RequestBody SignupDto signupDto) throws CustomException {
        return userService.signUp(signupDto);
    }

    //TODO token should be updated
    @PostMapping("/signIn")
    public SignInResponseDto Signup(@RequestBody SignInDto signInDto) throws CustomException {
        return userService.signIn(signInDto);
    }


}
