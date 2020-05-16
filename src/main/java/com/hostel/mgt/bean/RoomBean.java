package com.hostel.mgt.bean;

public class RoomBean {
	
	int rid;
	int roomNumber;
	String allotTo;
	String fromDate;
	String sEmail;
	
	
	public String getsEmail() {
		return sEmail;
	}
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getAllotTo() {
		return allotTo;
	}
	public void setAllotTo(String allotTo) {
		this.allotTo = allotTo;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	
	

}
