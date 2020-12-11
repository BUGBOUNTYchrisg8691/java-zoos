package com.lambda.zoos;

import com.lambda.zoos.models.Animal;
import com.lambda.zoos.models.Telephone;
import com.lambda.zoos.models.Zoo;
import com.lambda.zoos.models.ZooAnimal;
import com.lambda.zoos.repositories.AnimalRepository;
import com.lambda.zoos.repositories.TelephoneRepository;
import com.lambda.zoos.repositories.ZooAnimalRepository;
import com.lambda.zoos.repositories.ZooRepository;
import com.lambda.zoos.services.AnimalServices;
import com.lambda.zoos.services.ZooServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Transactional
//@Component
public class SeedData implements CommandLineRunner
{
	@Autowired
	private AnimalRepository animalrepos;

	@Autowired
	private TelephoneRepository telerepos;

	@Autowired
	private ZooRepository zoorepos;

	@Autowired
	private ZooAnimalRepository zooanimalrepos;

	@Autowired
	private ZooServices zooServices;

	@Autowired
	private AnimalServices animalServices;

	@Transactional
	@Override
	public void run(String[] args)
	{
		zooServices.deleteAll();
		animalServices.deleteAll();

		Zoo z1 = new Zoo("Lowry Park Zoo");
		Zoo z2 = new Zoo("San Francisco Zoo");
		Zoo z3 = new Zoo("lake Tahoe Zoo");

		Telephone t1 = new Telephone("666.555.1515", "Cell", z3);
		Telephone t2 = new Telephone("911.555.0420", "Home", z1);
		Telephone t3 = new Telephone("456.555.1234", "Cell", z2);
		Telephone t4 = new Telephone("123.456.7890", "Fax", z3);
		Telephone t5 = new Telephone("813.555.1230", "Home", z2);
		Telephone t6 = new Telephone("987.654.3210", "Cell", z3);

		Animal a1 = new Animal("Giraffe");
		Animal a2 = new Animal("Monkey");
		Animal a3 = new Animal("Rhino");
		Animal a4 = new Animal("Python");
		Animal a5 = new Animal("Gorilla");
		Animal a6 = new Animal("Zebra");
		Animal a7 = new Animal("Bear");

		ZooAnimal za1 = new ZooAnimal(z1, a1, z1.getZooname());
		ZooAnimal za2 = new ZooAnimal(z1, a7, z1.getZooname());
		ZooAnimal za3 = new ZooAnimal(z1, a4, z1.getZooname());
		ZooAnimal za4 = new ZooAnimal(z2, a6, z2.getZooname());
		ZooAnimal za5 = new ZooAnimal(z2, a3, z2.getZooname());
		ZooAnimal za6 = new ZooAnimal(z3, a5, z3.getZooname());
		ZooAnimal za7 = new ZooAnimal(z3, a2, z3.getZooname());

		z1.getAnimals().add(za1);
		z1.getAnimals().add(za2);
		z1.getAnimals().add(za3);
		z2.getAnimals().add(za4);
		z2.getAnimals().add(za5);
		z3.getAnimals().add(za6);
		z3.getAnimals().add(za7);

		zoorepos.save(z1);
		zoorepos.save(z2);
		zoorepos.save(z3);

		telerepos.save(t1);
		telerepos.save(t2);
		telerepos.save(t3);
		telerepos.save(t4);
		telerepos.save(t5);
		telerepos.save(t6);

		animalrepos.save(a1);
		animalrepos.save(a2);
		animalrepos.save(a3);
		animalrepos.save(a4);
		animalrepos.save(a5);
		animalrepos.save(a6);
		animalrepos.save(a7);

		zooanimalrepos.save(za1);
		zooanimalrepos.save(za2);
		zooanimalrepos.save(za3);
		zooanimalrepos.save(za4);
		zooanimalrepos.save(za5);
		zooanimalrepos.save(za6);
		zooanimalrepos.save(za7);
	}
}
