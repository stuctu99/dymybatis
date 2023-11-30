<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<h2>사원 조회 결과</h2>
	
	<div>
		<form action="${pageContext.request.contextPath }/emp/searchemp.do" method="get">
			<table>
				<tr>
					<td>
						<select name="type">
							<option value="emp_id">사원 번호</option>
							<option value="emp_name">사원 이름</option>
							<option value="email">이메일</option>
							<option value="phone">전화번호</option>
						</select>
					</td>
					<td>
						<input type="text" placeholder="검색어입력" name="keyword">
					</td>
				</tr>
				<tr>
					<td>성별</td>
					<td>
						<label><input type="radio" name="gender" value="M">남</label>
						<label><input type="radio" name="gender" value="F">여</label>
					</td>
				</tr>
				<tr>
					<td>
						급여
					</td>
					<td>
						<input type="number" min="1500000" step="100000" name="salary"/>
						<label><input type="radio" name="salFlag" value="ge">이상</label>
						<label><input type="radio" name="salFlag" value="le">이하</label>
 					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="검색">
					</td>
				</tr>
			</table>
		</form>
	</div>
	
	<table>
		<tr>
			<th>사원 번호</th>
			<th>사원 이름</th>
			<th>사원 주민번호</th>
			<th>사원 이메일</th>
			<th>사원 연락처</th>
			<th>부서코드</th>
			<th>잡코드</th>
			<th>sal_level</th>
			<th>salary</th>
			<th>bonus</th>
			<th>managerId</th>
			<th>hire_date</th>
			<th>ent_date</th>
			<th>entYn</th>
			<th>성별</th>
		</tr>
		<tbody>
			<c:if test="${not empty employees }">
				<c:forEach var="e" items="${employees }">
					<tr>
						<td><c:out value="${e.empId }"/></td>
						<td><c:out value="${e.empName}"/></td>
						<td><c:out value="${e.empNo}"/></td>
						<td><c:out value="${e.email}"/></td>
						<td><c:out value="${e.phone}"/></td>
						<td><c:out value="${e.deptCode}"/></td>
						<td><c:out value="${e.jobCode}"/></td>
						<td><c:out value="${e.salLevel}"/></td>
						<td><fmt:formatNumber type="currency" value="${e.salary }"/></td>
						<td><fmt:formatNumber type="percent" value="${e.bonus }"/></td>
						<td><c:out value="${e.managerId}"/></td>
						<td><fmt:formatDate value="${e.hireDate}" pattern="yyyy년 MM월 dd일 (E)"/></td>
						<td><fmt:formatDate value="${e.entDate}" pattern="yyyy년 MM월 dd일 (E)"/></td>
						<td><c:out value="${e.entYn}"/></td>
						<td><c:out value="${e.gender }"/></td>
						
						
					</tr>
				</c:forEach>
			</c:if>		
		</tbody>
	</table>

</body>
</html>