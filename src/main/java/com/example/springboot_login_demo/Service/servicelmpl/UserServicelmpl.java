package com.example.springboot_login_demo.Service.servicelmpl;

import com.example.springboot_login_demo.Service.UserService;
import com.example.springboot_login_demo.entity.User;
import com.example.springboot_login_demo.repository.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServicelmpl implements UserService {

    @Resource
    private UserDao userDao;
    @Override
    public User loginService(String username, String password) {
        // 如果账号密码都对则返回登录的用户对象，若有一个错误则返回null
        User user = userDao.findByusernameAndPassword(username, password);
        // 重要信息置空
        if(user != null){
            user.setPassword("");
        }
        return user;
    }

    @Override
    public User registService(User user) {
        //当新用户的用户名已存在时
        if(userDao.findByusername(user.getUsername())!=null){
            // 无法注册
            return null;
        }else{
            //返回创建好的用户对象(带user_id)
            User newUser = userDao.save(user);
            if(newUser != null){
                newUser.setPassword("");
            }
            return newUser;
        }
    }
}
