<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:useBean id="now" class="java.util.Date" />
<p>Date: <fmt:formatDate value="<%= now %>" type="date"  /></p>
<p>Time: <fmt:formatDate value="<%= now %>" type="time" /></p>
<p>Date & Time: <fmt:formatDate value="<%= now %>" type="both" /></p>



