<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<%@ page import="org.hibernate.cfg.Configuration" %>
<%@ page import="org.hibernate.*" %>
<%@ page import ="com.demo.Laptop" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Laptop Shop</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<h1>Laptop</h1>
    
	<jsp:useBean id="laptop" class="com.demo.Laptop">
		<jsp:setProperty name="laptop" property="*" />
	</jsp:useBean>

	<%
		try{
			
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session hsession = factory.openSession();
		hsession.save(laptop);
		Transaction transaction = hsession.beginTransaction();
		transaction.commit();
		out.println("lapopt saved");
		response.sendRedirect("showlaptop.jsp");
		}
		catch(Exception e){
			e.printStackTrace();
	}
	%>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>