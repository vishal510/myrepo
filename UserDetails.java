package com.nt.aspect;

public class UserDetails {

	private String uname;
	private String pwd;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "UserDetails [uname=" + uname + ", pwd=" + pwd + "]";
	}

}
