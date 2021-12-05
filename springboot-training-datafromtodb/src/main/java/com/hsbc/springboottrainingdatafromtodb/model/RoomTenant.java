package com.hsbc.springboottrainingdatafromtodb.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RoomTenant {
	
	@Id
	private int rtid;
	private String rtname;
	private int rtage;
	private String rtoccupation;
	
	public RoomTenant() {
		
	}
	
	public RoomTenant(int rtid, String rtname, int rtage, String rtoccupation) {
		this.rtid = rtid;
		this.rtname = rtname;
		this.rtage = rtage;
		this.rtoccupation = rtoccupation;
	}

	public int getRtid() {
		return rtid;
	}

	public void setRtid(int rtid) {
		this.rtid = rtid;
	}

	public String getRtname() {
		return rtname;
	}

	public void setRtname(String rtname) {
		this.rtname = rtname;
	}

	public int getRtage() {
		return rtage;
	}

	public void setRtage(int rtage) {
		this.rtage = rtage;
	}

	public String getRtoccupation() {
		return rtoccupation;
	}

	public void setRtOccupation(String rtoccupation) {
		this.rtoccupation = rtoccupation;
	}
	
	

}
