package com.lambda.zoos.services;

import com.lambda.zoos.models.ZooAnimal;
import com.lambda.zoos.repositories.ZooAnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "zooAnimalServices")
public class ZooAnimalServicesImpl implements ZooAnimalServices
{
	@Autowired
	ZooAnimalRepository zooanimalrepos;
	
	@Transactional
	@Override public void save(ZooAnimal zooAnimal)
	{
		zooanimalrepos.save(zooAnimal);
	}
}
