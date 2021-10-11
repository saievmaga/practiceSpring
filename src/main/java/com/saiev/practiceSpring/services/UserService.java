package com.saiev.practiceSpring.services;

import com.saiev.practiceSpring.entities.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User findByUserName(String userName);
  //  void save(SystemUser systemUser);
}
