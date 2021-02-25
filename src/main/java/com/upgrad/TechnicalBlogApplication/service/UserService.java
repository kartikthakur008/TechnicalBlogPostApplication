package com.upgrad.TechnicalBlogApplication.service;

import com.upgrad.TechnicalBlogApplication.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    // Contain all the business logic and communicate to db
    public boolean login(User user) {
        if(user.getUsername().equals("kartikthakur") && user.getPassword().equals("thakur"))
            return true;
        else
            return false;
    }
}
