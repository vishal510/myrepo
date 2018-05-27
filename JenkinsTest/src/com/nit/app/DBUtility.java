package com.nit.app;

import java.sql.Connection;

public class DBUtility {

	private static Connection connection = null;
	public static Connection openConnection()
	{
		// driver loading
		// connection establishment
		// Prepared statment.
		System.out.println("DBUtility.openConnection()........");
		return connection;
	}
	
}
