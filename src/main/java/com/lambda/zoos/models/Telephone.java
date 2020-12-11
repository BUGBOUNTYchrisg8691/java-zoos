package com.lambda.zoos.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "telephones")
public class Telephone extends Auditable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long phoneid;
	
	private String phonenumber;
	private String phonetype;
	
	@ManyToOne
	@JoinColumn(name = "zooid")
	private Zoo zoo;
	
	public Telephone()
	{
	}
	
	public Telephone(String phonenumber, String phonetype, Zoo zoo)
	{
		this.phonenumber = phonenumber;
		this.phonetype = phonetype;
		this.zoo = zoo;
	}
	
	public long getPhoneid()
	{
		return phoneid;
	}
	
	public void setPhoneid(long phoneid)
	{
		this.phoneid = phoneid;
	}
	
	public String getPhonenumber()
	{
		return phonenumber;
	}
	
	public void setPhonenumber(String phonenumber)
	{
		this.phonenumber = phonenumber;
	}
	
	public String getPhonetype()
	{
		return phonetype;
	}
	
	public void setPhonetype(String phonetype)
	{
		this.phonetype = phonetype;
	}
	
	public Zoo getZoo()
	{
		return zoo;
	}
	
	public void setZoo(Zoo zoo)
	{
		this.zoo = zoo;
	}
}
