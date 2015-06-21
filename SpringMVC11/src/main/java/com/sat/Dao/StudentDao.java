package com.sat.Dao;

import java.util.List;

import com.sat.model.Student;

public interface StudentDao {

	public int insert(Student st) throws  Exception ;
	public boolean update(Student st)throws  Exception;
	public boolean save(Student st)throws  Exception;
	public boolean delet(Student st)throws  Exception;
	public Student findById(int id)throws  Exception;
	public  List<Student> findByFirstname(String  firstname)throws  Exception;
	public  List<Student> findByLasttname(String  lasgtname)throws  Exception;
	public Student findByEmail(String  email)throws  Exception;

	List<Student> select(int id, String firstname, String lastname, String email, int age) throws  Exception;

	List<Student> selectAll() throws  Exception;


}


