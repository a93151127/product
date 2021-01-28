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
<form action="Controller3" method="post">
	<SELECT name="value">
		<OPTION>HandPhone
		<OPTION>Accessory
		<OPTION>Laptop
	</SELECT>
	<input type="submit" name="action" value="submit"/>
</form>
<table width="100%" border="0" align="center">

    <tr >
        <th width="33%">產品名稱</th>
        <th width="33%">產品價格</th>
        <th width="33%">產品存貨</th>
    </tr>
    <c:forEach var="product" items="${productlist}">
    <tr>
    	<td width="33%" align="center">${product.productName}</td>
    	<td width="33%" align="center">${product.productPrice}</td>
    	<td width="33%" align="center">${product.stock}</td>
    </tr>
    </c:forEach>

</body>
</html>