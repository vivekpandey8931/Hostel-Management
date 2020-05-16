package com.hostel.mgt.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.hostel.mgt.bean.RoomBean;

public class RoomModel {
	 MyDb db = new MyDb();
	
	public ArrayList<RoomBean> availbleRoom() {
		ArrayList<RoomBean> al = new ArrayList<RoomBean>();
		Connection con = db.getCon();
		Statement stmt = null;
		try {
			 stmt = con.createStatement();
     	
		   // System.out.println("fine"+studentBean.getName());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ResultSet rs  = stmt.executeQuery("select * from rooms");
			while(rs.next()) {
				RoomBean roomBean = new RoomBean();
			roomBean.setRid(rs.getInt("rid"));
			roomBean.setRoomNumber(rs.getInt("roomNumber"));
			roomBean.setAllotTo(rs.getString("allotTo"));
			roomBean.setFromDate(rs.getString("fromDate"));
		
			al.add(roomBean);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
 	return al;
		
		
	}
	
	public void addRoom(RoomBean rb) {
		Connection con = db.getCon();
		
		try {
			Statement stmt = con.createStatement();
			
     		stmt.executeUpdate("insert into rooms (roomNumber) values('"+rb.getRoomNumber()+"')");
     		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void allotRoom(RoomBean rb) {
		Connection con = db.getCon();
		
		try {
			Statement stmt = con.createStatement();
			
     		stmt.executeUpdate("update rooms set allotTo='"+rb.getAllotTo()+"' , fromDate='"+rb.getFromDate()+"', studentEmail ='"+rb.getsEmail()+"' where roomNumber='"+rb.getRoomNumber()+"'");
     		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	}


