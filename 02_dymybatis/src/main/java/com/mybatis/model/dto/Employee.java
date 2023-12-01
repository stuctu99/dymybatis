package com.mybatis.model.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(exclude = "deptCode")
public class Employee {

	private int empId;
	private String empName;
	private String empNo;
	private String email;
	private int phone;
//	private String deptCode;
	private Department deptCode;
//	private String jobCode;
	private Job jobCode;
	private String salLevel;
	private int salary;
	private double bonus;
	private int managerId; 
	private Date hireDate;
	private Date entDate;
	private char entYn;
	private String gender;
	
}
