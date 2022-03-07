<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body style="background-color:lavender">
<h1><center> Delicious Buffet Restaurant </center></h1>
<a href="/showPage?language=en">English</a>|<a href="/showPage?language=de">German</a>|<a href="/showPage?language=fr">French</a>

<form:form method="post" action="billDesk" modelAttribute="book">

<table style="margin: 0px auto; margin-left: auto; margin-right:auto">
		               
         <tr>
         <td><spring:message code="label.customerName"/></td>
         <td><form:input path="customerName" id="customerName"/></td>
         <td><form:errors path="customerName"/></td>
         </tr>
		 <tr>
		 <td><spring:message code="label.contactNumber"/></td>
         <td><form:input path="contactNumber" id="contactNumber"/></td>
         <td><form:errors path="contactNumber"/></td>
		 </tr>
		 <tr>
		 <td><spring:message code="label.hallType"/></td>
		 <td><form:select path="hallType" id="hallType">
		     <form:options items="${hallList}"/></form:select>	
		 </td>
		 </tr>
		<tr>
		<td><spring:message code="label.adultVegCount"/></td>
		<td><form:input path="adultVegCount" id="adultVegCount"/></td>
		<td><form:errors path="adultVegCount"/></td>
		</tr>
		<tr>
		<td><spring:message code="label.kidsVegCount"/></td>
		<td><form:input path="kidsVegCount" id="kidsVegCount"/></td>
		<td><form:errors path="kidsVegCount"/></td>
		</tr>
		<tr>
		<td><spring:message code="label.adultNonVegCount"/></td>
		<td><form:input path="adultNonVegCount" id="adultNonVegCount"/></td>
		<td><form:errors path="adultNonVegCount"/></td>
		</tr>
		<tr>
		<td><spring:message code="label.kidsNonVegCount"/></td>
		<td><form:input path="kidsNonVegCount" id="kidsNonVegCount"/></td>
		<td><form:errors path="kidsNonVegCount"/></td>
		</tr>
		<tr>
		<td><input type="submit" value="CalculateCost" id="submit" /></td>
		<td><input type="reset" value="Cancel"/></td>
		</tr>
			
		</table>
</form:form>


</body>
</html>	 	  	    	    	     	      	 	
