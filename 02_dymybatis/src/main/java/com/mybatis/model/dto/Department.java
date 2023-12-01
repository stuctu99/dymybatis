package com.mybatis.model.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Department {
	private String deptId;
	private String deptTitle;
	private String locationId;
	
	private List<Employee> employees;
	
}
