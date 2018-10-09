package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.aspect.UserDetails;

public class AuthenticataeDao {

	private static final String AUTH_QRY = "SELECT COUNT(*) FROM AUTHENTICATION WHERE UNAME = ? AND PWD = ?";

	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public boolean authenticate(UserDetails ud) {
		System.out.println(ud.getUname()+" "+ud.getPwd());
		int count;
		count = jt.queryForObject(AUTH_QRY, Integer.class, ud.getUname(), ud.getPwd());
		if (count == 0)
			return false;
		else
			return true;

	}

}
