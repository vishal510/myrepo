package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dao.StudentDAOImpl;
import com.nt.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {

	@Override
	public String register(StudentDTO dto) throws Exception {
		int total=0;
		float avg=0.0f;
		String result=null;
		StudentBO bo=null;
		StudentDAO dao=null;
		int count=0;
		//write b.logic (calc total,avg,result)
		total=dto.getM1()+dto.getM2()+dto.getM3();
		//calc avg
		avg=total/3.0f;
		//generate result
		if(avg>=35 && dto.getM1()>=35&&dto.getM2()>=35 &&dto.getM3()>=35)
			result="PASS";
		else
			result="FAIL";
		//prepare STudentBO class obj having persistable data
		bo=new StudentBO();
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setTotal(total);
		bo.setAvg(avg);
		bo.setResult(result);
		//use DAO
		dao=new StudentDAOImpl();
		count=dao.insert(bo);
		if(count==0)
			return "Registraion failed -->Result::"+result;
		else
			return "Registraion succeded -->Result::"+result;
	}//method
}//calss
