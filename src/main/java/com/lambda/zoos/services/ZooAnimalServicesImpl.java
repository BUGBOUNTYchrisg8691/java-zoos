package com.lambda.zoos.services;

import com.lambda.zoos.models.ZooAnimal;
import com.lambda.zoos.repositories.ZooAnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ZooAnimalServicesImpl implements ZooAnimalServices
{
	@Autowired
	ZooAnimalRepository zooanimalrepos;
	
	@Override public void save(ZooAnimal zooAnimal)
	{
		zooanimalrepos.save(zooAnimal);
	}
}
