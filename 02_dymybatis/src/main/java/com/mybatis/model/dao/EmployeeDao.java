package com.mybatis.model.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.model.dto.Employee;

public class EmployeeDao {

	public List<Employee> selectEmpAll(SqlSession session){
		return session.selectList("employee.selectEmployeeAll");
	}
	
	public List<Employee> searchEmpByKeyword(SqlSession session, Map<String, Object> param){
		return session.selectList("employee.searchEmpByKeyword", param);
	}
}
