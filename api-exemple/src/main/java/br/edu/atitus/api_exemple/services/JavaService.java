package br.edu.atitus.api_exemple.services;

import br.edu.atitus.api_exemple.entities.UserEntity;

public class JavaService {
	public UserEntity save(UserEntity user) throws Exception {
		if (user == null) {
			throw new Exception("Objeto nulo");
		if (user.getName()==null||user.getName().isEmpty()) {
			throw new Exception("Nome Invalido");
			
		user.setName(user.getName().trim());
		
		if (user.getName()==null||user.getEmail().isEmpty()) {
			throw new Exception("Email Invalido");
			
			if (user.getName()==null||user.getPassword().isEmpty()||user.getPassword().length() < 8) {
				throw new Exception("Senha Invalido");	
				//TODO criar hash da senha
				//TODO validar permissão cadastro admin
		}
		//TODO enviar para a camada repository
		return user;
	}
}
