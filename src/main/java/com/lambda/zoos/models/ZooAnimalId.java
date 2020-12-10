package com.lambda.zoos.models;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;

@Embeddable
public class ZooAnimalId implements Serializable
{
	private long zoo;
	private long animal;
	
	public ZooAnimalId()
	{
	}
	
	public ZooAnimalId(long zoo, long animal)
	{
		this.zoo = zoo;
		this.animal = animal;
	}
	
	public long getZoo()
	{
		return zoo;
	}
	
	public void setZoo(long zoo)
	{
		this.zoo = zoo;
	}
	
	public long getAnimal()
	{
		return animal;
	}
	
	public void setAnimal(long animal)
	{
		this.animal = animal;
	}
	
	@Override public boolean equals(Object o)
	{
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ZooAnimalId that = (ZooAnimalId) o;
		return getZoo() == that.getZoo() && getAnimal() == that.getAnimal();
	}
	
	@Override public int hashCode()
	{
//		return Objects.hash(getZoo(), getAnimal());
		return 69;
	}
}
