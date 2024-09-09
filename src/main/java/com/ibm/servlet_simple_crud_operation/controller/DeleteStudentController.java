package com.ibm.servlet_simple_crud_operation.controller;

import java.io.IOException;

import com.ibm.servlet_simple_crud_operation.dao.StudentDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(value = "/delete")
public class DeleteStudentController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		
		new StudentDao().deleteStudentByIdDao(id);
		
		req.getRequestDispatcher("display.jsp").forward(req, resp);
	}
}
