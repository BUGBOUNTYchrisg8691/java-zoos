package com.lambda.zoos.controllers;

import com.lambda.zoos.models.Zoo;
import com.lambda.zoos.services.ZooServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/zoos")
public class ZooController
{
	@Autowired
	private ZooServices zooServices;
	@GetMapping(value = "/zoos", produces = "application/json")
	public ResponseEntity<?> getAllZoos()
	{
		List<Zoo> retlst = zooServices.findAllZoos();
		return new ResponseEntity<>(retlst, HttpStatus.OK);
	}
}
