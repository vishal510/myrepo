package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.nt.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
	private static final String INSERT_LAYERED_STUDENT="INSERT INTO LAYERED_STUDENT(SNAME,TOTAL,AVG,RESULT) VALUES(?,?,?,?)";
	
	private  Connection getPooledConnection()throws Exception{
		InitialContext ic=null;
		DataSource ds=null;
		Connection con=null;
		//create InitialContext obj to establish the connection with Jndi Registry
		ic=new InitialContext();
		//get DataSource obj ref from jndi registry
		ds=(DataSource)ic.lookup("java:/comp/env/DsJndi");
		//get Connection object from jdbc con pool
		con=ds.getConnection();
		return con;
	}

	@Override
	public int insert(StudentBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int result=0;
		//get Pooled Connection
		con=getPooledConnection();
		//create PreparedStaetment object
		ps=con.prepareStatement(INSERT_LAYERED_STUDENT);
		//set values to query params
		ps.setString(1,bo.getSname());
		ps.setInt(2,bo.getTotal());
		ps.setFloat(3, bo.getAvg());
		ps.setString(4, bo.getResult());
		//execute the SQL Query
		result=ps.executeUpdate();
		
		//release jdbc con obj back to jdbc con pool
		con.close();
		return result;
	}//method
}//class
