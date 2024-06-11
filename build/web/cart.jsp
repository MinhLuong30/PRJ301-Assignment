<%-- 
    Document   : cart
    Created on : Mar 21, 2024, 10:49:18 PM
    Author     : minhl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>YOUR CART</h1>
        <c:if test="${sessionScope.CART.size() > 0}">
        <table border="1">
            <thead>
                <tr>
                    <th>NO</th>
                    <th>ID</th>
                    <th>NAME</th>
                    <th>DESCRIPTION</th>
                    <th>PRICE</th>
                    <th>Quantity</th>
                    <th>Total</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${sessionScope.CART}" var="p" varStatus="counter">
                    <tr>
                        <td>${counter.count}</td>
                        <td>${p.comicid}</td>
                        <td>${p.name}</td>
                        <td>${p.description}</td>
                        <td>${p.price}</td>
                        <td>${p.quantity}</td>
                        <td>${p.quantity * p.price}</td>
                        <td>
                            <!-- Nút Delete (hoặc Update) -->
                            <form action="MainController" method="POST">
                                <input type="hidden" name="id" value="${p.comicid}" />
                                <input type="submit" value="Remove" name="action" />
                            </form>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <h3>Total: ${sessionScope.TOTAL} Nghìn Đồng</h3>
    </c:if>
    </body>
</html>
