package com.example.springboot_login_demo.repository;


import com.example.springboot_login_demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
    User findByusername(String username);
    User findByusernameAndPassword(String username, String password);

}
