package com.example.userservice.Service;

import com.example.userservice.vo.UserDto;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDto);
    List<UserDto> findUser();

}
