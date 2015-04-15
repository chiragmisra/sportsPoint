package com.ftrd.changeme.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the event_log database table.
 * 
 */
@Entity
@Table(name="User_Activity")
public class UserActivity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userActivityId;
 
	@ManyToOne
	@JoinColumn(name="User_Id")
	private User user;
	
    @ManyToOne
	@JoinColumn(name="Activity_Id")
	private Activity activity ;
    
    @Column(name="User_Activity_Unit")
	private double distance;
	
	@Column(name="Points")
	private int points;
	
	@Column(name="Activity_Timestamp")
	private Timestamp timeStamp;	
	

//	public UserActivity(User user, Activity activity, double distance) {
//		this.user = user;
//		activity = activity;
//		this.distance = distance;
//	}

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		activity = activity;
	}

	public int getUserActivityId() {
		return userActivityId;
	}

	public void setUserActivityId(int userActivityId) {
		this.userActivityId = userActivityId;
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

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	


}