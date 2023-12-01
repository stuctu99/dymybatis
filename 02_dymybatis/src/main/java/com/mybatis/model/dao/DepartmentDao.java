package com.mybatis.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.model.dto.Department;

public class DepartmentDao {

	public List<Department> selectDepartment(SqlSession session){
		return session.selectList("dept.selectDepartment");
	}
	
	
	public Department selectDepartmentById(SqlSession session, String deptCode) {
		return session.selectOne("dept.selectDepartmentById", deptCode);
	}
} 
