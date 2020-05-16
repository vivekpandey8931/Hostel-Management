package com.hotel.mgt.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.hostel.mgt.bean.ContactBean;
import com.hostel.mgt.model.ContactModel;

/**
 * Servlet implementation class ContactCtl
 */
public class ContactCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactCtl() {
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
		ContactBean contactBean = new ContactBean();
		contactBean.setName(request.getParameter("name"));
		contactBean.setEmail(request.getParameter("email"));
		contactBean.setMessage(request.getParameter("textMsg"));
		ContactModel contactModel = new ContactModel();
		contactModel.insertContactData(contactBean);
        response.sendRedirect("contact.jsp");
	}

}
