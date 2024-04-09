<%@page import = "mypack.InsertCustomer" %>

<jsp:useBean id="customer" class="mypack.Customer" scope="session"/>
<jsp:setProperty name = "customer" property="*"/>

<%
	boolean flag = InsertCustomer.saveCustomer(customer);
	if(flag){
		out.println("<h3> Customer Added Successfully</h3>");
	}
%>
<a href = "customer.jsp">Add new Customer</a>
<a href = "DisplayCustomer.jsp">Show Customer Table</a>
