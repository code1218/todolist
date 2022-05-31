package com.springboot.todolist.web.controller.api;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.todolist.annotation.aop.Validation;
import com.springboot.todolist.web.dto.CMRespDto;
import com.springboot.todolist.web.dto.auth.UsernameCheckReqDto;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
	@Validation
	@GetMapping("/signup/username")
	public ResponseEntity<?> checkUsername(@Valid @RequestBody UsernameCheckReqDto usernameCheckReqDto, BindingResult bindingResult) {
		System.out.println(usernameCheckReqDto);
		
		return new ResponseEntity<>(new CMRespDto<Boolean>(1, "username ok", true), HttpStatus.OK);
	}
}
