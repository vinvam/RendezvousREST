package com.rendezvous.api;

import java.util.HashSet;
import java.util.Set;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class User {
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	String id;		//phone number only non-numeric chars and no whitespace
	
	private Set<String> events;
	
	public User(String id)
	{
		this.id = id;
		events = new HashSet<String>();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public Set<String> getStrings() {
		return events;
	}
	public void setStrings(Set<String> events) {
		this.events = events;
	}
	public void addString(String eventid)
	{
		this.events.add(eventid);
	}
	public void removeString(String eventid)
	{
		this.events.remove(eventid);
	}
}
