package com.lambda.zoos.repositories;

import com.lambda.zoos.models.Animal;
import com.lambda.zoos.views.ZooCount;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AnimalRepository extends CrudRepository<Animal, Long>
{
	@Query(value = "SELECT COUNT(z.zooid) as countzoos, a.animalid,  a.animaltype " +
			"FROM animals a LEFT JOIN zooanimals z ON a.animalid = z.animalid " +
			"GROUP BY a.animalid", nativeQuery = true)
	List<ZooCount> findZooCount();
}

//countzoos. animalid, animaltype