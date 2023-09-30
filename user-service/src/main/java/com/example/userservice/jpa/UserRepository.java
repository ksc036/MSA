package com.example.userservice.jpa;

import com.example.userservice.vo.UserDto;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity,Long> {
}
