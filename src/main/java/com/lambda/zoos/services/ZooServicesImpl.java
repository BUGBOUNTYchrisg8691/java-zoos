package com.lambda.zoos.services;

import com.lambda.zoos.models.Zoo;
import com.lambda.zoos.repositories.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ZooServicesImpl implements ZooServices
{
	@Autowired
	ZooRepository zoorepos;
	
	@Override public void save(Zoo zoo)
	{
		zoorepos.save(zoo);
	}
}
