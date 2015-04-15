package com.ftrd.changeme.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the event_log database table.
 * 
 */
@Entity
@Table(name="user")
public class UserActivity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
 
	@Column(name="User_Name")
	private String userName;
	
	@ManyToOne
	@JoinColumn(name="User_Id")
	private User user;
	
//	@ManyToMany
//	@JoinColumn(name="Activity_Id")
	//private Activity Activity_Id ;
	
	@Column(name="Points")
	private int points;
	
	@Column(name="Activity_Timestamp")
	private Timestamp timeStamp;

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public Timestamp getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Timestamp timeStamp) {
		this.timeStamp = timeStamp;
	}
	


}