package com.lambda.zoos.repositories;

import com.lambda.zoos.models.Animal;
import org.springframework.data.repository.CrudRepository;

public interface AnimalRepository extends CrudRepository<Animal, Long>
{
}
