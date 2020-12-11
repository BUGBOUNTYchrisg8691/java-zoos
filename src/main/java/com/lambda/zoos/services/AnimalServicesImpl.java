package com.lambda.zoos.services;

import com.lambda.zoos.models.Animal;
import com.lambda.zoos.repositories.AnimalRepository;
import com.lambda.zoos.views.ZooCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service(value = "animalServices")
public class AnimalServicesImpl implements AnimalServices
{
	@Autowired
	AnimalRepository animalrepos;
	
	@Transactional
	@Override public void save(Animal animal)
	{
		animalrepos.save(animal);
	}
	
	@Transactional
	@Override public void deleteAll()
	{
		animalrepos.deleteAll();
	}
	
	@Override public List<ZooCount> findAnimalZooCounts()
	{
		return animalrepos.findZooCount();
	}
}
