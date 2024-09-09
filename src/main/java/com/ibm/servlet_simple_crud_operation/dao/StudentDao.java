package com.ibm.servlet_simple_crud_operation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibm.servlet_simple_crud_operation.connection.StudentConnection;
import com.ibm.servlet_simple_crud_operation.dto.Student;

public class StudentDao {

	Connection connection = StudentConnection.getStudentConnection();

	final String INSERT_STUDENT_QUERY = "INSERT into student(firstname,lastname,nickname,email,password,dob,mobile,gender,address) values(?,?,?,?,?,?,?,?,?) ";

	final String DISPLAY_STUDENT_QUERY = "SELECT * FROM student";
	
	final String DISPLAY_STUDENT_By_ID_QUERY="SELECT * FROM student where id=?";
	
	final String UPDATE_STUDENT_QUERY="update student set firstname=?,lastname=?,nickname=?,email=?,password=?,dob=?,mobile=?,gender=?,address=? where id=?";

	public Student saveStudentDao(Student student) {

		try {
			PreparedStatement ps = connection.prepareStatement(INSERT_STUDENT_QUERY);
			ps.setString(1, student.getFirstName());
			ps.setString(2, student.getLastName());
			ps.setString(3, student.getNickName());
			ps.setString(4, student.getEmail());
			ps.setString(5, student.getPassword());
			ps.setObject(6, student.getDob());
			ps.setLong(7, student.getMobile());
			ps.setString(8, student.getGender());
			ps.setString(9, student.getAddress());
			
			ps.execute();
			return student;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public List<Student> getAllStudentDataDao() {
		try {

			PreparedStatement ps = connection.prepareStatement(DISPLAY_STUDENT_QUERY);
			ResultSet set = ps.executeQuery();

			List<Student> list = new ArrayList<Student>();

			while (set.next()) {

				list.add(new Student(set.getInt("id"), set.getString("firstname"), set.getString("lastname"),
						set.getString("nickname"), set.getString("email"), set.getString("password"),
						set.getDate("dob").toLocalDate(), set.getLong("mobile"), set.getString("gender"),
						set.getString("address")));
			}
			return list;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	/*
	 * delete by Id
	 */
	public int deleteStudentByIdDao(int id) {
		try {
			PreparedStatement ps = connection.prepareStatement("delete from student where id=?");
			ps.setInt(1, id);
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public Student getStudentByIdDao(int id) {

		try {

			PreparedStatement ps = connection.prepareStatement(DISPLAY_STUDENT_By_ID_QUERY);
			ps.setInt(1, id);
			ResultSet set = ps.executeQuery();

			if (set.next()) {

				return new Student(set.getInt("id"), set.getString("firstname"), set.getString("lastname"),
						set.getString("nickname"), set.getString("email"), set.getString("password"),
						set.getDate("dob").toLocalDate(), set.getLong("mobile"), set.getString("gender"),
						set.getString("address"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}
	
	public int updateStudentDao(Student student) {
		try {
			PreparedStatement ps = connection.prepareStatement(UPDATE_STUDENT_QUERY);
			ps.setString(1, student.getFirstName());
			ps.setString(2, student.getLastName());
			ps.setString(3, student.getNickName());
			ps.setString(4, student.getEmail());
			ps.setString(5, student.getPassword());
			ps.setObject(6, student.getDob());
			ps.setLong(7, student.getMobile());
			ps.setString(8, student.getGender());
			ps.setString(9, student.getAddress());
			ps.setInt(10,student.getId());
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}
}
