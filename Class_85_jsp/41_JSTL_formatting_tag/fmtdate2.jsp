<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
	<head>
		<title>JSTL fmt:dateNumber Tag</title>
	</head>
	<body>
		<h3>Number Format: </h3>
		<c:set var="date" value="<%=new java.util.Date() %>" />
		<table bgcolor="#D8D8D8" border="1" width="70%">
			<tr>
				<td width="100%" colspan="2" bgcolor="#1C1C1C" >
					<p align="center" >
						<b>
							<font color="#D8D8D8" size="4" >
								Formatting: <fmt:formatDate value="<%=new java.util.Date()%>" type="both" timeStyle="long" dateStyle="long" />
							</font>
						</b>
					</p>
				</td>
			</tr>
			<tr>
				<td width="51%"> Attribute: type="date"</td>
				<td width="49%"><fmt:formatDate type="date" value="<%= new java.util.Date() %>" /></td>
			</tr>
				<tr>
				<td width="51%"> Attribute: type="time"</td>
				<td width="49%"><fmt:formatDate type="time" value="<%= new java.util.Date() %>" /></td>
			</tr>
			<tr>
				<td width="51%"> Attribute: type="both"</td>
				<td width="49%"><fmt:formatDate type="both" value="<%= new java.util.Date() %>" /></td>
			</tr>
			<tr>
				<td width="51%"> Attribute: type="both" dateStyle="default"</td>
				<td width="49%"><fmt:formatDate type="both" dateStyle="default" value="<%= new java.util.Date() %>" /></td>
			</tr>
			<tr>
				<td width="51%"> Attribute: type="short" dateStyle="default" timeStyle="short"</td>
				<td width="49%"><fmt:formatDate type="both" dateStyle="short" timeStyle="short" value="<%= new java.util.Date() %>" /></td>
			<tr>
				<td width="51%"> Attribute: type="both" dateStyle="medium" </td>
				<td width="49%"><fmt:formatDate type="both" dateStyle="medium" value="<%= new java.util.Date() %>" /></td>
			</tr>
			<tr>
				<td width="51%"> Attribute: type="both" dateStyle="long"</td>
				<td width="49%"><fmt:formatDate type="both" dateStyle="long" value="<%= new java.util.Date() %>" /></td>
			</tr>
			<tr>
				<td width="51%"> Attribute: type="both" dateStyle="full"</td>
				<td width="49%"><fmt:formatDate type="both" dateStyle="full" value="<%= new java.util.Date() %>" /></td>
			</tr>
			<tr>
				<td width="51%"> Attribute: pattern="yyy-MM-dd"</td>
				<td width="49%"><fmt:formatDate pattern="yyyy-MM-dd" value="<%= new java.util.Date() %>" /></td>
			</tr>
			<tr>
				<td width="51%"> Attribute: pattern="yyyy-MM-dd hh:mm:ss"</td>
				<td width="49%"><fmt:formatDate pattern="yyyy-MM-dd hh:mm:ss" value="<%= new java.util.Date() %>" /></td>
			</tr>
		</table>
	</body>
</html>
