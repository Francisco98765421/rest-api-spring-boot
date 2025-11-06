package br.edu.atitus.api_exemple.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.atitus.api_exemple.dtos.SignupDTO;
import br.edu.atitus.api_exemple.entities.TypeUser;
import br.edu.atitus.api_exemple.entities.UserEntity;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	private final UserService service = new UserService();
	
	@PostMapping("/signup")
	public ResponseEntity<UserEntity> postSignup(@RequestBody SignupDTO dto){
		UserEntity user = new UserEntity();
		BeanUtils.copyProperties(dto, user);
		user.setType(TypeUser.Common);
		//TODO enviar para a camada service
		return ResponseEntity.status(201).body(user);
	}

}
