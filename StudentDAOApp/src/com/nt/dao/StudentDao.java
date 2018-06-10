package com.nt.dao;

import org.python.core.exceptions;

import com.nt.bo.StudentBO;

public interface StudentDao {
	public int insertData(StudentBO sbo)throws Exception;
}
