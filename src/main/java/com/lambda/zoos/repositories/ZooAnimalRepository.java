package com.lambda.zoos.repositories;

import com.lambda.zoos.models.ZooAnimal;
import com.lambda.zoos.models.ZooAnimalId;
import org.springframework.data.repository.CrudRepository;

public interface ZooAnimalRepository extends CrudRepository<ZooAnimal, ZooAnimalId>
{
}
