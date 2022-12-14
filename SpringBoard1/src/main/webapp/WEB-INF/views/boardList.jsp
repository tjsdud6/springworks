<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 목록</title>
<link rel="stylesheet" href="resources/css/style.css">
</head>
<body>
   <div id="container">
      <section id="list">
         <h2>글 목록 입니다.</h2>
         <h3>로그아웃</h3>
         <table class="tbl_list">
            <tr>
               <th>번호</th><th>제목</th><th>작성자</th><th>등록일</th><th>조회수</th>
            </tr>
            <c:forEach items="${boardList}" var="board">
            <tr>
               <td><c:out value="${board.bno}" /></td>
               <td><a href="/boardView?bno=<c:out value="${board.bno}" />"><c:out value="${board.title}" /></a></td>
               <td><c:out value="${board.writer}" /></td>
               <td><fmt:formatDate value="${board.regDate}" pattern="yyyy-MM-dd hh:mm:ss"/></td>
               <td><c:out value="${board.cnt}" /></td>
            </tr>
            </c:forEach>
         </table>
         <div class="btn_box">
            <a href="/insertBoard"><button type="button">글쓰기</button></a>
         </div>
      </section>
   </div>
</body>
</html>