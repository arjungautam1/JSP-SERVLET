<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:out value="Hello this is me Kumar Poudyal"/><br>
<c:out value="${uname }"/>
<c:set var="income" value="${200000*2 }"/>
<c:if test="${income>200000 }">
<p>I am satisfied with my income .</p>
<p>My income is <c:out value="${income }"/></p>

<c:choose>
<c:when test="${income<1000 }">
Income is less.
</c:when>
<c:when test="${income>1000 }">
You are very rich .
</c:when>
<c:otherwise>
income is undertermined ....
</c:otherwise>
</c:choose>
<%-- <c:redirect url="https://laserarjun876.github.io/personal_website/index.html"></c:redirect> --%>

<c:catch var="Excep">
<%int x=2/0; %>
</c:catch>
<p> This type of exception is :${Excep}</br>


</c:if>
Numbers from 1 to 10: 
<c:forEach var="j" begin="1" end="10">
 <c:out value="${j }"/>
</c:forEach>

</body>
</html>