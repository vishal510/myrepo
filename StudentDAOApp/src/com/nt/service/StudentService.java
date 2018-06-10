package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAOImpl;
import com.nt.dao.StudentDao;
import com.nt.dto.StudentDTO;

public class StudentService {
	public String generateResult(StudentDTO dto) throws Exception {
		int total = 0;
		float avg = 0.0f;
		String result = null;
		StudentBO bo = null;
		StudentDao dao = null;
		int cnt = 0;
		total = dto.getM1() + dto.getM2() + dto.getM3();
		avg = total / 3.0f;
		if (dto.getM1() < 35 || dto.getM2() < 35 || dto.getM3() < 35) {
			result = "fail";
		} else {
			result = "pass";
		}
		bo = new StudentBO();
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setResult(result);
		bo.setAvg(avg);
		bo.setTotal(total);
		dao = new StudentDAOImpl();
		cnt = dao.insertData(bo);
		if(cnt == 0) {
			return "registrtation failed";
		}
		
		else {
			return "Registration succeeded and result"+result;
		}

	}

}
