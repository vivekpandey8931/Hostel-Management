package com.hotel.mgt.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hostel.mgt.bean.RoomBean;
import com.hostel.mgt.model.RoomModel;

/**
 * Servlet implementation class RoomCtl
 */
public class RoomCtl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RoomCtl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		//out.println("dkbdkj");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter out = response.getWriter();
		RoomModel rm = new RoomModel();
		RoomBean rb = new RoomBean();
		String s1 = request.getParameter("param");
		if(s1.equals("roomDetails")) {
		ArrayList<RoomBean> al =new ArrayList<RoomBean>();
		
		al = rm.availbleRoom();
		for(int i=0;i<al.size();i++) {
			out.println(al.get(i).getRid()+" "+al.get(i).getRoomNumber()+" "+al.get(i).getAllotTo()+" "+al.get(i).getFromDate());
		}
		response.sendRedirect( "checkAvailableRoom.jsp?var=roomDetails");
		
		}else if(s1.equals("AddNewRoom")) {
			response.sendRedirect( "checkAvailableRoom.jsp?var=AddNewRoom");
			out.print("Add New Room");
		}else if(s1.equals("AllotARoom")) {
			response.sendRedirect("checkAvailableRoom.jsp?var=AllotARoom");
		   out.println("Allot A Room");
		}else if(s1.equals("allot")) {
			out.println("allot new room");
		
		}else if(s1.equals("AddNewR")) {
			String roomNumber = request.getParameter("roomNumber");
			int rn = Integer.parseInt(roomNumber);
			rb.setRoomNumber(rn);
			rm.addRoom(rb);
			response.sendRedirect("checkAvailableRoom.jsp?var=dataInserted");
			//out.println("Add new room");
		}else if(s1.equals("allotR")) {
			String roomNumber = request.getParameter("roomNumber");
			int rn = Integer.parseInt(roomNumber);
			String name = request.getParameter("name");
			String date = request.getParameter("allotDate");
			String email = request.getParameter("email");
			rb.setRoomNumber(rn);
			rb.setAllotTo(name);
			rb.setFromDate(date);
			rb.setsEmail(email);
			
			rm.allotRoom(rb);
			response.sendRedirect("checkAvailableRoom.jsp?var=dataInserted");
			//out.println("test");
		}
	}

}
