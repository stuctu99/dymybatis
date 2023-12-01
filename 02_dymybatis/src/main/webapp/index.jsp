<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>저장된 전체 학생 조회</h3>
	<h4>
		<a href="${path }/employee/searchAll.do">
			전체 사원 조회
		</a>
	</h4>

	<h3>web계정에 있는 데이터 조회하기</h3>
	<h3>게시글 조회하기</h3>
	<input type="text" name="boardNo"><button>조회</button>
	게시글 내용 출력 + 게시글을 작성한 회원의 아이디, 이메일을 출력하기
	
	<input type="text" name="boardNo"><button>조회</button>
	게시글 내용을 출력 + 댓글들 출력하기
	
	<button>회원 조회하기</button> 		
	회원 정보 출력 + 회원이 등록한 게시글 정보 출력하기
	
</body>
</html>