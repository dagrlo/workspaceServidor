<%@ page import="edu.uv.jsp.taller.Libro" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="libro" class="edu.uv.jsp.taller.Libro" scope="page"/>
<jsp:setProperty property="autor" name="libro" value="kk"/>
<jsp:setProperty property="titulo" name="libro" value="titulorr"/>
<jsp:setProperty property="editorial" name="libro" value="editorial kk"/>
<jsp:setProperty property="precio" name="libro" value="20.0"/>

<h1>Libro:</h1>
<table>
	<tr><th>Autor</th><th>Titulo</th><th>Editorial</th><th>Precio</th></tr>
	<tr><td> <jsp:getProperty property="libro" name="autor"/></td>
	<td><jsp:getProperty property="libro" name="titulo"/> </td>
	<td><jsp:getProperty property="libro" name="editorial"/></td>
	<td><jsp:getProperty property="libro" name="precio"/></td></tr>
</table>

</body>
</html>