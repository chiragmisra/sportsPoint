package com.ftrd.changeme.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Activity")
public class Activity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Activity_Id;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@Column(name="Activity_Name")
	private String Activity_Name;
	
	@Column(name="Complexity")
	private int Complexity;
	
	@Column(name="Units")
	private double Units;
	
	@Column(name="Equipment")
	private boolean Equipment;
	
	public int getActivity_Id() {
		return Activity_Id;
	}
	public void setActivity_Id(int activity_Id) {
		Activity_Id = activity_Id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getActivity_Name() {
		return Activity_Name;
	}
	public void setActivity_Name(String activity_Name) {
		Activity_Name = activity_Name;
	}
	public int getComplexity() {
		return Complexity;
	}
	public void setComplexity(int complexity) {
		Complexity = complexity;
	}
	public double getUnits() {
		return Units;
	}
	public void setUnits(double units) {
		Units = units;
	}
	public boolean isEquipment() {
		return Equipment;
	}
	public void setEquipment(boolean equipment) {
		Equipment = equipment;
	}
	
	
	
}
