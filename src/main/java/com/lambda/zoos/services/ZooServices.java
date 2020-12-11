package com.lambda.zoos.services;

import com.lambda.zoos.models.Zoo;

import java.util.List;

public interface ZooServices
{
	void save(Zoo zoo);
	
	void deleteAll();
	
	List<Zoo> findAllZoos();
	
	Zoo findZooById(long id);
}
