package com.mybatis.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.model.dao.DepartmentDao;
import com.mybatis.model.dto.Department;
import static com.mybatis.common.SqlSessionTemplate.getSession;

public class DepartmentService {
	private DepartmentDao dao = new DepartmentDao();
	
	public List<Department> selectDepartment(){
		SqlSession session= getSession();
		List<Department> departments = dao.selectDepartment(session);
		session.close();
		return departments;
		
	}
	
	public Department selectDepartmentById(String deptCode) {
		SqlSession session = getSession();
		Department result = dao.selectDepartmentById(session, deptCode);
		session.close();
		return result;
		
		
	}
		
}
