package com.lambda.zoos.services;

import com.lambda.zoos.models.Telephone;
import com.lambda.zoos.repositories.TelephoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "telephoneServices")
public class TelephoneServicesImpl implements TelephoneServices
{
	@Autowired
	TelephoneRepository telerepos;
	
	@Transactional
	@Override public void save(Telephone phone)
	{
		telerepos.save(phone);
	}
}
