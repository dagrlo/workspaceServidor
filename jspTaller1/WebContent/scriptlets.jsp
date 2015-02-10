<%@ page import="edu.uv.jsp.taller.Libro" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	Libro l=new Libro();
	l.setAutor("kk");
	l.setTitulo("titulo");
	l.setEditorial("ditorial");
	l.setPrecio(12.0);	
%>

<h1>Libro:</h1>
<table>
	<tr><th>Autor</th><th>Titulo</th><th>Editorial</th><th>Precio</th></tr>
	<tr><td> <%=l.getAutor() %></td><td> <%=l.getTitulo() %></td><td> <%=l.getEditorial() %></td><td><%=l.getPrecio() %></td></tr>
</table>

</body>
</html>