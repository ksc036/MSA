package com.example.userservice.Service;

import com.example.userservice.jpa.UserEntity;
import com.example.userservice.jpa.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
//@RunWith(SpringRunner.class)
class UserServiceImplTest {

    @Autowired
    UserRepository userRepository;

    @Test
    void createUser() {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(1l);
        userEntity.setEmail("ksc036@gmail.com");
        userEntity.setName("강수창");
        userEntity.setUserId("ksc");
        userEntity.setEncrtpyedPwd("hihgi");
        userRepository.save(userEntity);
        log.info("검색결과 : {}",userRepository.findByUserId("ksc"));

        UserEntity userEntity1 = new UserEntity();
        userEntity1.setId(1l);
        userEntity1.setEmail("ksc036");
        userEntity1.setName("123");
        userEntity1.setUserId("123123");
        userEntity1.setEncrtpyedPwd("123123123");
        userRepository.save(userEntity1);
        System.out.println(userRepository.findByUserId("123123"));


    }

    @Test
    void getUserByUserId() {
    }

    @Test
    void getUserByAll() {
    }

    @Test
    void loadUserByUsername() {
    }
}