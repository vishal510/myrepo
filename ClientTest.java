package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.aspect.AuthenticationManager;
import com.nt.service.IntrstAmtCal;

public class ClientTest {

	public static void main( String[] args) {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		AuthenticationManager am = ctx.getBean("am",AuthenticationManager.class);
		am.sigIn("vishal","patil");
		IntrstAmtCal proxy = ctx.getBean("pfb",IntrstAmtCal.class);
		float amt = proxy.calIntrstAmt(2000,2,45);
		System.out.println("Interest Amount::"+amt);
		am.signOut();
	}

}
