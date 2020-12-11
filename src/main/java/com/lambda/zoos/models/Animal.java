package com.lambda.zoos.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "animals")
public class Animal extends Auditable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long animalid;
	
	private String animaltype;
	
//	@ManyToMany(mappedBy = "animals", cascade = CascadeType.ALL)
//	private Set<Zoo> zoos = new HashSet<>();
	@OneToMany(mappedBy = "zoo", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnoreProperties(value = "animal")
	private Set<ZooAnimal> zoos = new HashSet<>();
	
	public Animal()
	{
	}
	
	public Animal(String animaltype)
	{
		this.animaltype = animaltype;
	}
	
	public long getAnimalid()
	{
		return animalid;
	}
	
	public void setAnimalid(long animalid)
	{
		this.animalid = animalid;
	}
	
	public String getAnimaltype()
	{
		return animaltype;
	}
	
	public void setAnimaltype(String animaltype)
	{
		this.animaltype = animaltype;
	}
	
	public Set<ZooAnimal> getZoos()
	{
		return zoos;
	}
	
	public void setZoos(Set<ZooAnimal> zoos)
	{
		this.zoos = zoos;
	}
}
