package com.lambda.zoos.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "zoos")
public class Zoo extends Auditable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long zooid;
	
	private String zooname;
	
	@OneToMany(mappedBy = "zoo", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnoreProperties(value = "zoo")
	private List<Telephone> telephones = new ArrayList<>();
	
//	@ManyToMany
//	@JoinTable(name = "zooanimals",
//	           joinColumns = @JoinColumn(name = "zooid"),
//	           inverseJoinColumns = @JoinColumn(name = "animalid"))
	@OneToMany(mappedBy = "animal", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnoreProperties(value = "zoo")
	private Set<ZooAnimal> animals = new HashSet<>();
	
	public Zoo()
	{
	}
	
	public Zoo(String zooname)
	{
		this.zooname = zooname;
	}
	
	public long getZooid()
	{
		return zooid;
	}
	
	public void setZooid(long zooid)
	{
		this.zooid = zooid;
	}
	
	public String getZooname()
	{
		return zooname;
	}
	
	public void setZooname(String zooname)
	{
		this.zooname = zooname;
	}
	
	public List<Telephone> getTelephones()
	{
		return telephones;
	}
	
	public void setTelephones(List<Telephone> telephones)
	{
		this.telephones = telephones;
	}
	
	public Set<ZooAnimal> getAnimals()
	{
		return animals;
	}
	
	public void setAnimals(Set<ZooAnimal> animals)
	{
		this.animals = animals;
	}
}
