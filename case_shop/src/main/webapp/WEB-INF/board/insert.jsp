<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp"%>
    /board/insert.jsp
<style>
	table, td{
		border : 1px solid black
	} 
</style>    


<form action="insert.br" method="post">
	<input type="hidden" name="memberNum" value="${sessionScope.memberNum }">
	<input type="hidden" name="name" value="${sessionScope.name }">
	<table class="table">
		<tr>
			<td>작성자</td>
			<td>${sessionScope.name }</td>
		</tr>
		<tr>
			<td>제목</td>
			<td><input type="text" name="subject"></td>
		</tr>
		<tr>
			<td>내용</td>
			<td><input type="text" name="content"></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="submit">
				<input type="reset" value="reset">
			</td>
		</tr>
	</table>
</form>