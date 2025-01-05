package com.example.login_app;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.example.login_app.model.User;
import com.example.login_app.repository.UserRepository;

@Component
public class DataLoader implements CommandLineRunner{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void run(String... args) throws Exception {
        if (userRepository.findByUsername("testuser").isEmpty()) {
            User user = new User();
            user.setUsername("testuser");
            user.setPassword(passwordEncoder.encode("password"));
            user.setRoles(Set.of("ROLE_USER"));
            userRepository.save(user);
            System.out.println("User saved: " + user.getUsername());
        }
        
    }
    
}
