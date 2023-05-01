package com.example.mpesaservice.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/mpesa")
public class MpesaController {

	@GetMapping("/send-money")
	public ResponseEntity<String> sendMoney(){
		System.out.println("Money has been deposited in your account");
		return ResponseEntity.ok("Success");
	}

}
