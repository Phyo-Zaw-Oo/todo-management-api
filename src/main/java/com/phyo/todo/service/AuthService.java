package com.phyo.todo.service;

import com.phyo.todo.dto.LoginDto;
import com.phyo.todo.dto.RegisterDto;

public interface AuthService {
    String register(RegisterDto registerDto);

    String login(LoginDto loginDto);
}
