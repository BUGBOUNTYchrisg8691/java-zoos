package com.lambda.zoos.services;

import com.lambda.zoos.models.Animal;

public interface AnimalServices
{
	void save(Animal animal);
	
	void deleteAll();
}
