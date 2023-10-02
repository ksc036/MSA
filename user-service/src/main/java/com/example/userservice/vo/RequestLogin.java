package com.example.userservice.vo;

import lombok.Data;
import lombok.NonNull;

@Data
public class RequestLogin {
    private String email;
    private String password;
}
