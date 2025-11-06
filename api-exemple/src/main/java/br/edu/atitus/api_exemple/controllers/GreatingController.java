package br.edu.atitus.api_exemple.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greating")
public class GreatingController {
	@GetMapping(value= {"","/{namePath}"})

	public ResponseEntity<String> getGreating(@RequestParam(required=false) String name, @PathVariable(required=false) String namePath) {
		String retorno="Hello";
		if(name == null) name="World!";
		name= namePath!=null ? namePath : "World!";
		return ResponseEntity.ok(retorno + " " +name+"!");
	}
}
