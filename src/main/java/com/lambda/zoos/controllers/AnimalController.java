package com.lambda.zoos.controllers;

import com.lambda.zoos.services.AnimalServices;
import com.lambda.zoos.views.ZooCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController
{
	@Autowired
	private AnimalServices animalServices;
	
	@GetMapping(value = "/count", produces = "application/json")
	public ResponseEntity<?> getAnimalZooCounts()
	{
		List<ZooCount> retlst = animalServices.findAnimalZooCounts();
		return new ResponseEntity<>(retlst, HttpStatus.OK);
	}

}
