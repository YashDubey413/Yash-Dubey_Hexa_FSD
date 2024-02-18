<%@page import="java.util.*,com.hexaware.springbootweb.entity.Employee"  %>
<h1>Here is your list of employees</h1>

<%
List<Employee> list=(List<Employee>)session.getAttribute("empList");
out.println(list);

%>