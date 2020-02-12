package com.jwttest.test.repository;


import com.jwttest.test.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
