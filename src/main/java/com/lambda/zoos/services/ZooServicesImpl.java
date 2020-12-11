package com.lambda.zoos.services;

import com.lambda.zoos.models.Zoo;
import com.lambda.zoos.repositories.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "zooServices")
public class ZooServicesImpl implements ZooServices
{
	@Autowired
	ZooRepository zoorepos;
	
	@Transactional
	@Override public void save(Zoo zoo)
	{
		zoorepos.save(zoo);
	}
	
	@Transactional
	@Override public void deleteAll()
	{
		zoorepos.deleteAll();
	}
	
	@Override public List<Zoo> findAllZoos()
	{
		List<Zoo> retlst = new ArrayList<>();
		zoorepos.findAll().iterator().forEachRemaining(retlst::add);
		return retlst;
	}
	
	@Override public Zoo findZooById(long id)
	{
		return zoorepos.findById(id).orElseThrow(() -> new EntityNotFoundException("Zoo " + id + " not found"));
	}
}
