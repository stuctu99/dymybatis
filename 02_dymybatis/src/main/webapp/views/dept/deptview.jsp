<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서조회</title>
</head>
<body>
	<h3>부서 상세정보</h3>
	${department }
	<ul>
		<li>부서 코드 : ${department.deptId }</li>
		<li>부서명 : ${department.deptTitle }</li>
		<li>지역코드 : ${department.locationId }</li>
	</ul>
	<h4>부서 사원 정보</h4>
	<table>
	<c:if test="${not empty department.employees }">
		<c:forEach var="emp" items="${department.employees }">
			<tr>
				<td>${emp.empName }</td>
				<td>${emp.jobCode.jobName }</td>
				<td>${emp.salary }</td>
				<td>${emp.bonus }</td>
			</tr>
		</c:forEach>
	</c:if>
	</table>
</body>
</html>