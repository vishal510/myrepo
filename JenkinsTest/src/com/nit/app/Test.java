package com.nit.app;

import java.sql.Connection;

public class Test {

	public static void main(String[] args) {

		System.out.println("Test.main()..........START.........");
		
		Connection connection  = DBUtility.openConnection();
		
		System.out.println("Test.main()....Exit...");
		
		
		
	}

}
