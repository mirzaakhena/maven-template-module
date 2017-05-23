package com.mirzaakhena.myproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mirzaakhena.myproject.service.HelloService;

@RestController
public class HelloController {

	@Autowired
	private HelloService helloService;

	@RequestMapping("/hello")
	public ResponseEntity<?> getHelloWorld(@RequestParam(defaultValue = "mirza") String name) {
		return new ResponseEntity<>(helloService.helloworld(name), HttpStatus.OK);
	}

}
