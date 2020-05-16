package com.hostel.mgt.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.hostel.mgt.bean.ContactBean;

public class ContactModel {
	
	 MyDb db = new MyDb();
   
		public void insertContactData(ContactBean contactBean) {
			Connection con = db.getCon();
			
			try {
				Statement stmt = con.createStatement();
	     		stmt.executeUpdate("insert into contact (name,email,msg)values('"+contactBean.getName()+"','"+contactBean.getEmail()+"','"+contactBean.getMessage()+"')");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}