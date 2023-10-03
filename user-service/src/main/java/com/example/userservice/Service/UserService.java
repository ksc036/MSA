package com.example.userservice.Service;

import com.example.userservice.jpa.UserEntity;
import com.example.userservice.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto userDto);
    UserDto getUserByUserId(String userId);
    Iterable<UserEntity> getUserByAll();
    //List<UserDto> findUser();
}
