package com.hotel.mgt.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hostel.mgt.bean.AdminBean;
import com.hostel.mgt.bean.StudentBean;
import com.hostel.mgt.model.AdminModel;
import com.hostel.mgt.model.StudentModel;

/**
 * Servlet implementation class LoginCtl
 */
@WebServlet("/LoginCtl")
public class LoginCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCtl() {
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
		PrintWriter out = response.getWriter();
	
	
	   StudentBean studentBean = new StudentBean();
	   AdminBean adminBean = new AdminBean();
	   String roletype = request.getParameter("loginSelector");
	   if(roletype.equals("student")) {
      
		studentBean.setEmail(request.getParameter("email"));
		
		studentBean.setPassword(request.getParameter("password"));
	
		StudentModel sm = new StudentModel();
		try {
			String s1 = sm.login(studentBean);
			
			if(s1.equals("sucess")) {
				 HttpSession session=request.getSession();  
			        session.setAttribute("uname","xyz"); 
			        session.setAttribute("email",request.getParameter("email"));
			        session.setAttribute("password",request.getParameter("password"));
				response.sendRedirect(request.getContextPath() + "/StudentCtl");
			}else {
				out.println("Wrong Credencial....");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }else if(roletype.equals("admin")) {
		   
		   adminBean.setEmail(request.getParameter("email"));
			
		   adminBean.setPassword(request.getParameter("password"));
			
			out.println("fgdgfgd");
		
			AdminModel am = new AdminModel();
			try {
				String s1 = am.login(adminBean);
				if(s1.equals("sucess")) {
					HttpSession session=request.getSession();  
			        session.setAttribute("uname","xyz"); 
					response.sendRedirect("welcome_admin.jsp");
				}else {
					out.println("Wrong Credencial....");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   }
	}

}
