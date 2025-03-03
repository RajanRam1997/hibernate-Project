<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="org.hibernate.cfg.Configuration" %>
<%@ page import="org.hibernate.*" %>
<%@ page import="org.hibernate.query.*" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="com.demo.Car" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Cars</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<h1>All Cars </h1>
<table class="table border border-3" >
<tr>
	<%
	try{
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session hsession = factory.openSession();
	
	%>
	<% 
	
	}
		catch(Exception e){
			e.printStackTrace();
	}
	%>
	<%
	Query query = session.createQuery("from Car");
	List<Car> l1 = query.list();
	Iterator <Car>i1 = l1.iterator();
	while(i1.hasNext()){
		Car car=i1.next();
		
	%>
	<td> <%=car.getCarid() %> </td>
	<td> <%=car.getModel() %> </td>
	<td> <%=car.getColor() %> </td>
	<td> <%=car.getPrice() %> </td>
	
	<td><a href="EditCar.jsp?carid=<%=car.getCarid()%>" class='btn btn-primary'>
   <img src='update.jpg' width="100px" height="100px"></a>
   <a href="DeleteCar.jsp?carid=<%=car.getCarid()%>" class='btn btn-danger'>
   <img src="delete.jpg" width="100px" height="100px"></a></td>
	</tr>
	<%

	}
	%>

</table>
</body>
</html>