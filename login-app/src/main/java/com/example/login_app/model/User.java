package com.example.login_app.model;

import java.util.Set;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;
    
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String> roles;


        // Getter and Setter for username
        public Long getId() {
            return id;
        }
    
        public void setId(Long id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }
    
        public void setUsername(String username) {
            this.username = username;
        }
    
        // Getter and Setter for password
        public String getPassword() {
            return password;
        }
    
        public void setPassword(String password) {
            this.password = password;
        }

        public Set<String> getRoles() {
            return roles;
        }
    
        public void setRoles(Set<String> roles) {
            this.roles = roles;
        }
}