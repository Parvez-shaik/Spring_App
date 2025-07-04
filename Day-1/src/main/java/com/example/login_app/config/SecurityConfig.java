package com.example.login_app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.User;
import com.example.login_app.repository.UserRepository;


@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    
    @Bean
    public UserDetailsService userDetailsService(UserRepository userRepository) {
        return username -> userRepository.findByUsername(username)
                .map(user -> User
                .withUsername(user.getUsername())
                .password(user.getPassword()) 
                .authorities(user.getRoles().toArray(new String[0]))
                .build())
                .orElseThrow(() -> new UsernameNotFoundException("User not found: " + username));
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf((csrf)->csrf.disable())
        .authorizeHttpRequests(authorizeRequests -> authorizeRequests
            .requestMatchers("/h2-console/**").permitAll()
            .requestMatchers("/admin/**").hasRole("ADMIN") // Example route for admins
            .anyRequest().authenticated()
)


        .headers(headers -> headers.frameOptions(frameOptions -> frameOptions.disable()))
        
        .formLogin(form -> form
        .defaultSuccessUrl("/", true)
        .permitAll())

        .logout(logout -> logout
        .logoutSuccessUrl("/login?logout")
        .permitAll());


        return http.build();
    }
    
}
