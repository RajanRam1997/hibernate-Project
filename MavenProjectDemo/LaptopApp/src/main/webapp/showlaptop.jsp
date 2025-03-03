<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="org.hibernate.cfg.Configuration" %>
<%@ page import="org.hibernate.*" %>
<%@ page import="org.hibernate.query.*" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="com.demo.Laptop" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Laptop</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<h1>All Laptop </h1>
<table class="table border border-3" >
<tr>
	<%
	try{
		
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session hsession = factory.openSession();
	
	Query q1 = hsession.createQuery("from laptop");
	List<Laptop> l1 = q1.list();
	Iterator <Laptop>i1 = l1.iterator();
	while(i1.hasNext()){
		Laptop laptop=i1.next();
	
	%>
	<td> <%=laptop.getId() %> </td>
	<td> <%=laptop.getModel() %> </td>
	<td> <%=laptop.getColor() %> </td>
	<td> <%=laptop.getPrice() %> </td>
	
	<td><a href="edit.jsp?id="<%=laptop.getId() %>>Edit</a> <a href="deletecar.jsp?id="<%=laptop.getId() %>>Delete</a></td>
	</tr>
	<%
	}
	%>
	<%
	}
	catch(Exception e){
		e.printStackTrace();
	}
	%>

</table>
</body>
</html>