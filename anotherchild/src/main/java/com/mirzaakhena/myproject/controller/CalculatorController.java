package com.mirzaakhena.myproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mirzaakhena.myproject.service.CalculatorService;

//@RestController
public class CalculatorController {

	@Autowired
	private CalculatorService helloService;

	@RequestMapping("/sum")
	public ResponseEntity<?> getSum(@RequestParam int a, @RequestParam int b) {
		return new ResponseEntity<>(helloService.sum(a, b), HttpStatus.OK);
	}

}
