package com.stackroute.userservice;

import com.stackroute.domain.User;
import com.stackroute.repository.UserRepository;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserServiceImpl() {
    }

    @Override
    public User findByUserIdAndPassword(String username, String password) {
        return userRepository.findByNameAndPassword(username,password);
    }
}
