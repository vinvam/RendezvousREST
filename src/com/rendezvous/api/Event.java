package com.rendezvous.api;

import java.util.Date;
import java.util.Set;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Event {
	
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	String eventId;
	String creator;
	String title;
	Date startTime;
	Date endTime;
	String location;
	
	/* attending users is a subset of invited users.  invited users will contain all users associated with the event including the creator */
	Set<String> attendingUsers;	//everyone attending (including creator)
	Set<String> invitedUsers;		//all users (including creator)
	
	
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Set<String> getAttendingUsers() {
		return attendingUsers;
	}
	public void setAttendingUsers(Set<String> attendingUsers) {
		this.attendingUsers = attendingUsers;
	}
	public Set<String> getInvitedUsers() {
		return invitedUsers;
	}
	public void setInvitedUsers(Set<String> invitedUsers) {
		this.invitedUsers = invitedUsers;
	}

}
