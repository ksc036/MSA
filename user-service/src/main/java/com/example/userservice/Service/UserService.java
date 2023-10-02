package com.example.userservice.Service;

import com.example.userservice.jpa.UserEntity;
import com.example.userservice.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto getUserByUserId(String userId);
    Iterable<UserEntity> getUserByAll();
    //List<UserDto> findUser();
}
