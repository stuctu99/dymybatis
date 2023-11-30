package com.mybatis.model.service;

import static com.mybatis.common.SqlSessionTemplate.getSession;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.model.dao.EmployeeDao;
import com.mybatis.model.dto.Employee;


public class EmployeeService {

	EmployeeDao dao = new EmployeeDao();	
	
	public List<Employee> selectEmpAll(){
		SqlSession session = getSession();
		List<Employee> employees = dao.selectEmpAll(session);
		session.close();
		return employees;
		
	}
	
	public List<Employee> searchEmpByKeyword(Map<String,Object> param){
		SqlSession session = getSession();
		List<Employee> employees = dao.searchEmpByKeyword(session, param);
		session.close();
		return employees;
		
		
	}
	
}
