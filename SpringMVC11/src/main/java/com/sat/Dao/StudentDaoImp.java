package com.sat.Dao;

import java.util.List;

import javax.sql.DataSource;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.sat.model.Student;

public class StudentDaoImp implements StudentDao {

	private DataSource ds;

	public void setDs(DataSource ds) {

		this.ds = ds;

	}

	@Override
	public int insert(Student st) throws Exception {

		Connection con = (Connection) ds.getConnection();

		// insert
		PreparedStatement ps = (PreparedStatement) con
				.prepareStatement("insert into student values(?,?,?,?,?)");
		ps.setInt(1, st.getId());
		ps.setString(2, st.getFirstName());
		ps.setString(3, st.getLastName());
		ps.setInt(4, st.getAge());
		ps.setString(5, st.getEmail());
		int i=ps.executeUpdate();
		con.close();
		return i;

	}

	@Override
	public boolean update(Student st) throws Exception {
		Connection con = (Connection) ds.getConnection();

		// update

		con.close();

		return true;
	}

	@Override
	public Student findById(int id) throws Exception {

		Connection con = (Connection) ds.getConnection();

		// findById

		con.close();

		return null;
	}

	@Override
	public List<Student> findByFirstname(String firstname) throws Exception {

		java.sql.Connection con = ds.getConnection();

		// findByFirstname

		con.close();

		return null;
	}

	@Override
	public List<Student> findByLasttname(String lasgtname) throws Exception {
		java.sql.Connection con = ds.getConnection();

		// findByLasttname

		con.close();

		return null;
	}

	@Override
	public Student findByEmail(String email) throws Exception {
		java.sql.Connection con = ds.getConnection();

		// findByEmail

		con.close();
		return null;
	}

	@Override
	public List<Student> select(int id, String firstname, String lastname,
			String email, int age) throws Exception {
		java.sql.Connection con = ds.getConnection();

		// List

		con.close();

		return null;
	}

	@Override
	public List<Student> selectAll() throws Exception {

		java.sql.Connection con = ds.getConnection();

		// List

		con.close();

		return null;
	}

	@Override
	public boolean save(Student st) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delet(Student st) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
