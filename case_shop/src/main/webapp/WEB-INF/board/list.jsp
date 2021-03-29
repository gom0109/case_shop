<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp"%>
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>

/board/list.jsp<br>
memberName:${sessionScope.name} / memberNum :${sessionScope.memberNum}
<a href="getSession.br">getSession</a> <a href="removeSession.br">removeSession</a>
<hr>
<br>
<style>
	table, td{
		border : 1px solid black
	} 
</style>
<script>
	window.onload = function(){
		var error = "${msg}";
		if(error !=''){
			alert(error);
		}	
	}
</script>    

<a href="insert.br">게시글입력</a>
<table>
	<tr>	
		<td>게시글번호</td>
		<td>글쓴이</td>
		<td>제목</td>
		<td>조회수</td>
		<td>수정</td>
		<td>삭제</td>
	</tr>
	<c:forEach var="b" items="${boardList}">
		<tr>
			<td>${b.boardNum }</td>
			<td>${b.name }</td>
			<td><a href="read.br?boardNum=${b.boardNum }">${b.subject }</a></td>
			<td>${b.regDate }</td>
			<td><a href="update.br?boardNum=${b.boardNum }">수정</a></td>
			<td><a href="delete.br?boardNum=${b.boardNum }">삭제</a></td>
		</tr>
	</c:forEach>
</table>
