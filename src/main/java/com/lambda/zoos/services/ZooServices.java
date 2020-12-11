package com.lambda.zoos.services;

import com.lambda.zoos.models.Zoo;

public interface ZooServices
{
	void save(Zoo zoo);
	
	void deleteAll();
}
