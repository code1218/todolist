package com.springboot.todolist.service;

import com.springboot.todolist.web.dto.auth.SignupReqDto;

public interface AuthService {
	public boolean signup(SignupReqDto signupReqDto) throws Exception;
}
