<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Receita Date</h1>
	<form:form action="receita.do" method="POST" commandName="receita">
		<table>
			<tr>
				<td>Receita Id</td>
				<td><form:input path="id" /></td>
			</tr>
			<tr>
				<td>Descricao</td>
				<td><form:input path="descricao" /></td>
			</tr>
			<tr>
				<td>Vencimento</td>
				<td><form:input path="vencimento" /></td>
			</tr>
			<tr>
				<td>Valor</td>
				<td><form:input path="valor" /></td>
			</tr>
			<tr>
				<td>Tipo</td>
				<td><form:input path="tipo" /></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" name="action" value"Add" />
					<input type="submit" name="action" value"Edit" />
					<input type="submit" name="action" value"Delete" />
					<input type="submit" name="action" value"Search" />
				</td>
			</tr>
		</table>
	</form:form>
	
	<br>
	
	<table>
		<tr>Id</tr>
		<tr>Descricao</tr>
		<tr>Vencimento</tr>
		<tr>Valor</tr>
		<tr>Tipo</tr>
		<c:forEach items="${receitaList}" var="receita">
			<tr>
				<td>${receita.id}</td>
				<td>${receita.descricao}</td>
				<td>${receita.vencimento}</td>
				<td>${receita.valor}</td>
				<td>${receita.tipo}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>