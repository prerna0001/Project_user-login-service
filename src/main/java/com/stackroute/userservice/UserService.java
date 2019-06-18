package com.stackroute.userservice;

import com.stackroute.domain.User;


import java.util.Optional;

public interface UserService {

    User findByUserIdAndPassword(String username,String password);

}
