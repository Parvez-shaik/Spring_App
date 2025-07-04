package com.example.login_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.web.servlet.error.ErrorController;

@RestController
public class HomeController implements ErrorController {
    
    @GetMapping("/")
    public String home() {
        return "Parvez Shaik's Home!";
    }

    @GetMapping("/error")
	public String customError() {
		return "The link you followed may be broken, or the page may have been removed.";
	}

}
