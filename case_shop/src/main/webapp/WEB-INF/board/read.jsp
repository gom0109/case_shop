<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./../common/common.jsp"%>
    
    /board/read.jsp
<style>
	table, td{
		border : 1px solid black
	} 
</style>    



<table class="table">
	<tr>
		<td>boardNum</td>
		<td>${board.boardNum}</td>
	</tr>
	<tr>
		<td>memberNum</td>
		<td>${board.memberNum}</td>
	</tr>
	<tr>
		<td>name</td>
		<td>${board.name}</td>
	</tr>
	<tr>
		<td>subject</td>
		<td>${board.subject}</td>
	</tr>
	<tr>
		<td>regDate</td>
		<td>${board.regDate}</td>
	</tr>
	<tr>
		<td>modDate</td>
		<td>${board.modDate}</td>
	</tr>
	<tr>
		<td>readCount</td>
		<td>${board.readCount}</td>
	</tr>
	<tr>
		<td>content</td>
		<td>${board.content}</td>
	</tr>
	<tr>
		<td>ip</td>
		<td>${board.ip}</td>
	</tr>
</table>
