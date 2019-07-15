package com.summer.controller;

import com.summer.model.User;
import com.summer.service.UserService;
import com.summer.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @since 2019/7/11 10:26
 */

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> register(User user) {
        int resultCode = userService.addUser(user);
        if (resultCode == Result.SUCCESS.value()) {
            return ResponseEntity.ok("注册成功！");
        }
        else{
            return new ResponseEntity<>("注册失败！" + Result.valueOf(resultCode).getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(String username, String password) {
        int resultCode = userService.login(username, password);
        if (resultCode == Result.SUCCESS.value()) {
            return ResponseEntity.ok("登陆成功！");
        }
        else{
            return new ResponseEntity<>("登录失败！" + Result.valueOf(resultCode).getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
