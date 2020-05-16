package com.hostel.mgt.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.hostel.mgt.bean.AdminBean;


public class AdminModel {
	 MyDb db = new MyDb();
	public String login(AdminBean adminbean) throws SQLException {
		Connection con = db.getCon();
		Statement stmt = null;
		try {
			 stmt = con.createStatement();
     	
		   // System.out.println("fine"+studentBean.getName());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs  = stmt.executeQuery("select email,password from admin where email='"+adminbean.getEmail()+"' and password='"+adminbean.getPassword()+"'");
 		if(rs.next()) {
 			return "sucess";
 		}else {
 			return "wrong";
 		}
		
		
	}
	
}
