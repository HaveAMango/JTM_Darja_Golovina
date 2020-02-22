package jtm.activity12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TeacherManager {

	public static void main(String[] args) {
		System.out.println(new TeacherManager().findTeacher(1));
	}

	protected Connection conn;

	public TeacherManager() {
		/*
		 * TODO When new TeacherManager is created, create connection to the database
		 * server:
		 */

		// Use conn.commit() after each Insert/Update/Delete call

		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/db?autoReconnect=true&useSSL=false&characterEncoding=utf8", "admin",
					"abcd1234");
			conn.setAutoCommit(false);

			PreparedStatement stmt = conn.prepareStatement("select Id,lastName,firstName from Teacher");

			ResultSet rs = stmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * Returns a Teacher instance represented by the specified ID.
	 */
	public Teacher findTeacher(int id) {
		try {
			Statement stmt = conn.createStatement();// prepare create difference???

			ResultSet rs = stmt.executeQuery("select * Teacher where id =" + id);
			if (rs.first() == true) {
				id = rs.getInt(1);
				String lastName = rs.getString(2);
				String firstName = rs.getString(3);
				Teacher teacher = new Teacher(id, firstName, lastName);
				return teacher;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		/*
		 * TODO Execute an SQL statement that searches teacher by ID. If teacher is
		 * found return Teacher object with values from DB If teacher is not found
		 * return null
		 */
		return null;
	}

	/**
	 * Returns a list of Teacher objects.
	 */
	public List<Teacher> findTeacher(String firstName, String lastName) {
		try {
			Statement stmt = conn.createStatement();// prepare create difference???

			ResultSet rs = stmt.executeQuery("select * Teacher where firstName =" + firstName);
			while (rs.first() == true) {
				ArrayList<String> first = new ArrayList<String>();
				Integer id = rs.getInt(1);
				lastName = rs.getString(2);
				firstName = rs.getString(3);
			first.add(firstName);
			}
			ResultSet rst = stmt.executeQuery("select * Teacher where firstName =" + lastName);
			ArrayList<String> last = new ArrayList<String>();
			if (rs.first() == true) {
				Integer id = rs.getInt(1);
				lastName = rs.getString(2);
				firstName = rs.getString(3);
				last.add(lastName);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*
		 * TODO Write an sql statement that searches teacher by first and last name and
		 * returns results as ArrayList<Teacher>. Result list should include all partial
		 * results as well, e.g. if first name is matching but last name is not still
		 * include, the teacher in result list, same applies for lastName If nothing is
		 * found return empty list!
		 */
		return null;
	}

	/**
	 * Insert an new teacher (first name and last name) into the table.
	 */
	public boolean insertTeacher(String firstName, String lastName) {
		/*
		 * TODO Execute an SQL statement that inserts teacher in database. SQL statement
		 * should contain only firstName and lastName, ID should be automatically
		 * generated by DB
		 */
		return false;
	}

	/**
	 * Insert teacher object into database
	 */
	public boolean insertTeacher(Teacher teacher) {
		/*
		 * TODO Execute an SQL statement that inserts teacher in database. SQL statement
		 * should contain all fields: id, firstName and lastName If teacher is inserted
		 * successfully return true, otherwise false
		 */

		return false;

	}

	/**
	 * Updates an existing Teacher in the repository with the values represented by
	 * the Teacher object.
	 */
	public boolean updateTeacher(Teacher teacher) {
		/*
		 * TODO Execute an SQL statement that updates teacher information. Update
		 * teacher in database by it's ID If ONE teacher is successfully updated, return
		 * true, otherwise false
		 */
		return false;
	}

	public boolean deleteTeacher(int id) {
		/*
		 * TODO Execute an SQL statement that deletes teacher from database. Delete
		 * teacher by it's ID If one teacher is successfully deleted, return true If no
		 * teacher is deleted return false
		 */
		return false;
	}

	public void closeConnection() {
		/*
		 * TODO Close connection to the database server and reset conn object to null
		 */
	}
}
