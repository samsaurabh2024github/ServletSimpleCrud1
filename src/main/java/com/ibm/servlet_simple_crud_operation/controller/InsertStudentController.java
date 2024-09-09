package com.ibm.servlet_simple_crud_operation.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import com.ibm.servlet_simple_crud_operation.dao.StudentDao;
import com.ibm.servlet_simple_crud_operation.dto.Student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InsertStudentController extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		StudentDao dao = new StudentDao();
		
		PrintWriter p=resp.getWriter();
		
		String firstName=req.getParameter("firstName");
		
		String lastName=req.getParameter("lastName");
		
		String nickName=req.getParameter("nickName");
		
		String email=req.getParameter("email");
		
		String password=req.getParameter("password");
		
		String dob=req.getParameter("dob");
		
		long mobile=Long.parseLong(req.getParameter("mobile"));
		
		String gender=req.getParameter("gender");
		
		String address=req.getParameter("address");
		
		Student student = new Student(firstName, lastName, nickName, email, password, LocalDate.parse(dob), mobile, gender, address);
		
		
		Student student2=dao.saveStudentDao(student);
		
		if(student2!=null) {
			p.write("<html><body><h1 style='color:green;'>Data Stored</h1></body></html>");
		
			RequestDispatcher dispatcher=req.getRequestDispatcher("register.jsp");
			dispatcher.include(req, resp);
		}
	}
	
}
