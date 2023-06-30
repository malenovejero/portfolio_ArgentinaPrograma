package com.portfolio.Portfolio.service;

import com.portfolio.Portfolio.model.User;
import org.springframework.stereotype.Service;
import com.portfolio.Portfolio.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author malen
 */
@Service
public class UserService implements IUserService {
    
    @Autowired
    public UserRepository userRepo;

    @Override
    public User login(String username) {
        return userRepo.findByUsername(username);
    }
    
}
