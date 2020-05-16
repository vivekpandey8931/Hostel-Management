package com.hotel.mgt.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.hostel.mgt.bean.StudentBean;
import com.hostel.mgt.model.StudentModel;

/**
 * Servlet implementation class RegisterCtl
 */
public class RegisterCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterCtl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	
	
		String joinDate = request.getParameter("joinDate");
	    
		StudentBean studentBean = new StudentBean();
		Date jDate= null;
		try {
			jDate = new SimpleDateFormat("dd/MM/yyyy").parse(joinDate);
			studentBean.setJoinDate(jDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
        studentBean.setName(request.getParameter("name"));
		studentBean.setEmail(request.getParameter("email"));
		studentBean.setPhoneNumber(request.getParameter("phoneNumber"));
		studentBean.setGender(request.getParameter("gender"));
		studentBean.setPassword(request.getParameter("password"));
		studentBean.setAddress(request.getParameter("address"));
			
		StudentModel sm = new StudentModel();
		sm.insertStudentData(studentBean);
		
	response.sendRedirect("index.jsp");
		
	}

}
