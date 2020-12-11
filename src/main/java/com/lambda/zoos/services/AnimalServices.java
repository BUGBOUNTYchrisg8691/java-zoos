package com.lambda.zoos.services;

import com.lambda.zoos.models.Animal;
import com.lambda.zoos.views.ZooCount;

import java.util.List;

public interface AnimalServices
{
	void save(Animal animal);
	
	void deleteAll();
	
	List<ZooCount> findAnimalZooCounts();
}
