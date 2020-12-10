package com.lambda.zoos.services;

import com.lambda.zoos.models.Animal;
import com.lambda.zoos.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AnimalServicesImpl implements AnimalServices
{
	@Autowired
	AnimalRepository animalrepos;
	
	@Override public void save(Animal animal)
	{
		animalrepos.save(animal);
	}
}
