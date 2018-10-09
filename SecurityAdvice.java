package com.nt.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class SecurityAdvice implements MethodBeforeAdvice {

	private AuthenticationManager am;

	public AuthenticationManager getAm() {
		return am;
	}

	public void setAm(AuthenticationManager am) {
		this.am = am;
	}

	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {

		boolean flag = am.isAuthenticated();

		if (flag == false) {

			throw new IllegalArgumentException("Invalid Credintial");
		}
	}

}
