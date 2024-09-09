package com.ibm.servlet_simple_crud_operation.controller;

import java.io.IOException;
import java.time.LocalDate;

import com.ibm.servlet_simple_crud_operation.dao.StudentDao;
import com.ibm.servlet_simple_crud_operation.dto.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(value = "/editForm")
public class UpdateStudentController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		
		String firstName = req.getParameter("firstName");

		String lastName = req.getParameter("lastName");

		String nickName = req.getParameter("nickName");

		String email = req.getParameter("email");

		String password = req.getParameter("password");

		String dob = req.getParameter("dob");

		long mobile = Long.parseLong(req.getParameter("mobile"));

		String gender = req.getParameter("gender");

		String address = req.getParameter("address");

		Student student = new Student(id,firstName, lastName, nickName, email, password, LocalDate.parse(dob), mobile,
				gender, address);
		new StudentDao().updateStudentDao(student);
		
		resp.sendRedirect("display.jsp");
		

	}
}
