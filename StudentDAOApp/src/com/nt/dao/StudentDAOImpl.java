package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.nt.bo.StudentBO;
import com.ziclix.python.sql.connect.Connect;

public class StudentDAOImpl implements StudentDao  {

	private Connection makeConnection() throws Exception {
		InitialContext ic = null;
		DataSource ds = null;
		Connection con = null;
		//locate the jndi
		ic = new InitialContext();
		//get datasource object
		ds = (DataSource) ic.lookup("java:/comp/env/jdbc/DsJndi");
		//get connection object
		con = ds.getConnection();
		return con;
	}
	
	
	@Override
	public int insertData(StudentBO sbo) throws Exception {
		String INSERT_INTO_DB = "INSERT INTO STUDENT_LAYERED VALUES(?,?,?,?,?)";
		Connection con =null;
		PreparedStatement ps = null;
		int result=0;
		con = makeConnection();
		ps= con.prepareStatement(INSERT_INTO_DB);
		ps.setInt(1,sbo.getSno() );
		ps.setString(2,sbo.getSname());
		ps.setInt(3, sbo.getTotal());
		ps.setFloat(4, sbo.getAvg());
		ps.setString(5, sbo.getResult());
		
		result=ps.executeUpdate();
		return result;
	}

}
