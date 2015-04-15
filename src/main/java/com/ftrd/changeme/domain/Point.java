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
@Table(name="Point")
public class Point implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Point_Id;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="Activity_Id")
	private Activity Activity_Id ;
	
	@Column(name="Total_Points")
	private int Total_Points;

	public int getPoint_Id() {
		return Point_Id;
	}

	public void setPoint_Id(int point_Id) {
		Point_Id = point_Id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Activity getActivity_Id() {
		return Activity_Id;
	}

	public void setActivity_Id(Activity activity_Id) {
		Activity_Id = activity_Id;
	}

	public int getTotal_Points() {
		return Total_Points;
	}

	public void setTotal_Points(int total_Points) {
		Total_Points = total_Points;
	}
	
	
}
