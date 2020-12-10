package com.lambda.zoos.services;

import com.lambda.zoos.models.Telephone;
import com.lambda.zoos.repositories.TelephoneRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TelephoneServicesImpl implements TelephoneServices
{
	@Autowired
	TelephoneRepository telerepos;
	
	@Override public void save(Telephone phone)
	{
		telerepos.save(phone);
	}
}
