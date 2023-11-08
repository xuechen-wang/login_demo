package com.example.springboot_login_demo.controller;

import com.example.springboot_login_demo.Service.UserService;
import com.example.springboot_login_demo.entity.User;
import com.example.springboot_login_demo.utils.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.print.DocFlavor;

@RestController
@RequestMapping("/user") //”/user”是这个控制器类的基路由
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @PostMapping("/login")
    public Result<User> loginController(@RequestParam String username, @RequestParam String password){
        User user = userService.loginService(username, password);
        if(user!=null){
            return Result.success(user,"登录成功！");
        }else{
            return Result.error("123","账号或密码错误！");
        }
    }
    @PostMapping("/register")
    public Result<User> registerController( User newUser){
        User user = userService.registService(newUser);
        if(user!=null){
            return Result.success(user,"注册成功！");
        }else{
            return Result.error("456","用户名已存在！");
        }
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }
}
