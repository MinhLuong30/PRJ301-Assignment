<%-- 
    Document   : account
    Created on : Mar 20, 2024, 10:12:19 PM
    Author     : minhl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    <script type="text/javascript">
        function delete(username){
            window.location = "MainController?action=Deleteacc&username=" + username;
        }

        
    </script>
    <style>
  body {
    font-family: 'Arial', sans-serif;
    margin: 0;
    padding: 0;
    background: #f0f0f0;
    text-align: center; /* Center text */
  }

  header {
    background: #202020; /* Darker header background */
    color: white;
    padding: 10px 20px;
  }

  h1 {
    margin: 0;
  }

  a {
    color: #ffffff;
    text-decoration: none;
    background-color: #007bff;
    padding: 10px 15px;
    border-radius: 5px;
    transition: background-color 0.3s ease;
    display: inline-block; /* Ensure proper centering */
  }

  a:hover {
    background-color: #0056b3;
  }

  table {
    width: 90%;
    margin: 20px auto;
    border-collapse: collapse;
    background: white;
    box-shadow: 2px 2px 10px rgba(0, 0, 0, 0.1);
  }

  th, td {
    text-align: center; /* Center table text */
    padding: 12px;
    border-bottom: 1px solid #ddd;
  }

  th {
    background-color: #32a852; /* Changed heading background */
    color: white;
  }

  tr:hover {
    background-color: #f5f5f5;
  }

  img {
    width: 100px;
    height: auto;
    border-radius: 5px;
  }

  input[type='text'], input[type='number'] {
    width: 90%;
    padding: 8px;
    margin: 5px 0;
    box-sizing: border-box;
    border: 1px solid #ccc;
    border-radius: 4px;
  }

  input[type='submit'], input[type='button'] {
    background-color: #32a852; /* Changed button background */
    border: none;
    color: white;
    padding: 10px 20px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
    border-radius: 5px;
  }

  .add-new-product {
    width: 90%;
    margin: 20px auto;
    padding: 20px;
    background: #fff;
    box-shadow: 2px 2px 10px rgba(0, 0, 0, 0.1);
    border-radius: 5px;
    text-align: left; /* Align form text to the left */
  }

  .add-new-product input[type='text'] {
    width: calc(100% - 20px);
  }

  .add-new-product div {
    margin-bottom: 10px;
  }
</style>
</head>
<body>
    <a href="admin.jsp">BACK</a>
    <form action="MainController" method="POST">
        <input type="submit" name="action" value="Show Account"/>
    </form>

    <table border="1">
        <thead>
            <tr>
                <th>NO</th>
                <th>USERNAME</th>
                <th>FULLNAME</th>
                <th>PASSWORD</th>
                <th>EMAIL</th>
                <th>ROLEID</th>
                <th>STATUS</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${sessionScope.ACCOUNTS}" var="i" varStatus="counter">
                <tr>
                    
                    
                        <td>${counter.count}</td>
                        <td>${i.username} </td>
                        <td>${i.fullname}</td>
                        <td>${i.password}</td>
                        <td>${i.email}</td>
                        <td>${i.roleid}</td>
                        <td>${i.status}</td>
                        <td>
                            <form action="MainController" method="POST">
                                <input type="hidden" name="id" value="${i.username}"/>
                                <input type="submit" value="Delete" name="action"/>    
                            </form>
                                                          
                        </td>
                    
                </tr>
            </c:forEach> 
                
        </tbody>
    </table>

    </body>
</html>
