package com.example.login_app.repository;

import java.util.Optional;

import com.example.login_app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);   
}
