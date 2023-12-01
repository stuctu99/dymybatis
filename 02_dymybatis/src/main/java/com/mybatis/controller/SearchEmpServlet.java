package com.mybatis.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mybatis.model.dto.Employee;
import com.mybatis.model.service.DepartmentService;
import com.mybatis.model.service.EmployeeService;

/**
 * Servlet implementation class SearchEmp
 */
@WebServlet("/emp/searchemp.do")
public class SearchEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchEmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String type = request.getParameter("type");
		String keyword = request.getParameter("keyword");
		String gender = request.getParameter("gender");
		int salary=0;
		try{
			salary = Integer.parseInt(request.getParameter("salary"));
		}catch(NumberFormatException e){
			salary=0;
		}
		String salFlag = request.getParameter("salFlag");
		
		String[] depts = request.getParameterValues("dept");
		
		
		
		Map<String,Object> pram = new HashMap<>();
		
		pram.put("type",type);
		pram.put("keyword",keyword);
		pram.put("gender",gender);
		pram.put("salary",salary);
		pram.put("salFlag",salFlag);
		pram.put("depts", depts);
		
		
		List<Employee> employees = new EmployeeService().searchEmpByKeyword(pram);
	
		
		request.setAttribute("employees", employees);
		
		request.setAttribute("departments", new DepartmentService().selectDepartment());
		
		request.getRequestDispatcher("/views/employee/employee.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
