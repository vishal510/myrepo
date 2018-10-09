package com.nt.aspect;

import com.nt.dao.AuthenticataeDao;

public class AuthenticationManager {

	ThreadLocal<UserDetails> tl = new ThreadLocal<UserDetails>();

	private AuthenticataeDao dao;

	public void setDao(AuthenticataeDao dao) {
		this.dao = dao;
	}

	public void sigIn(String uname, String pwd) {
		System.out.println(uname + " " + pwd);
		UserDetails ud = new UserDetails();
		ud.setUname(uname);
		ud.setPwd(pwd);
		tl.set(ud);
	}

	public void signOut() {
		tl.remove();
	}

	public AuthenticataeDao getDao() {
		return dao;
	}

	public boolean isAuthenticated() {
		UserDetails ud = tl.get();
		System.out.println(ud);
		

		boolean flag = dao.authenticate(ud);

		return flag;

	}

}
