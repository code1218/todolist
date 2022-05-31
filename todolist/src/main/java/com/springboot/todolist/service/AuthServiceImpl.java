package com.springboot.todolist.service;

import org.springframework.stereotype.Service;

import com.springboot.todolist.domain.UserRepository;
import com.springboot.todolist.web.dto.auth.SignupReqDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
	
	private final UserRepository userRepository;
	
	@Override
	public boolean signup(SignupReqDto signupReqDto) throws Exception {
		return userRepository.save(signupReqDto.toEntity()) > 0;
	}

}



