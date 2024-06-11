<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>ITEM Page</title>
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
    <script type="text/javascript">
        function add(id) {
            window.location = "MainController?action=Add&id=" + id;
        }

        function remove(id){
            window.location = "MainController?action=Remove&id=" + id;
        }
        
        function check(){
            window.location = "MainController?action=Check" ;
        }
        
    </script>
</head>
<body>

    <a href="admin.jsp">BACK</a>
    <form action="MainController" method="POST">
        <input type="submit" name="action" value="Show Inventory"/>
        <div style="margin-right: -1100px">
        <input style="width: 130px; "type="text" name="cid" placeholder="Enter ComicID">
        <input type="submit" value="SearchInventory" name="action">
        </div>
    </form>

    <table border="1">
        <thead>
            <tr>
                <th>NO</th>
                <th>ID</th>
                <th>NAME</th>
                <th>DESCRIPTION</th>
                <th>ARTIST</th>
                <th>PRICE</th>
                <th>IMAGE</th>
                <th>QUANTITY</th>
                <th>REPORT</th>
                <th><input type="button" value="Check" onclick="check()"/> </th>
            </tr>
        </thead>
        <tbody>
            
            <c:forEach items="${sessionScope.ITEMS}" var="i" varStatus="counter">
                
                <tr>
                    <form action="MainController" method="POST" style="display:inline;">
                        <td>${counter.count}</td>
                        <td><input type="text" name="id" value="${i.comicid}" style="width: 50px;" readonly ></td>
                        <td><input type="text" value="${i.name}" name="name" style="width: 140px;"></td>
                        <td><input type="text" value="${i.description}" name="description" style="width: 290px;" ></td>
                        <td><input type="text" value="${i.artist}" name="artist" style="width: 120px;" ></td>
                        <td><input type="text" value="${i.price}" name="price" style="width: 60px;"></td>
                        <td><img src="./images/${i.image}" style="width: 80px;"></td>
                        <td><input type="text" value="${i.quantity}" name="quantity" style="width: 80px;"></td>
                        <td><input type="text" value="${i.report}" style="width: 60px;"></td>
                        <td>                
                            <input type="button" value="Remove" onclick="remove('${i.comicid}')"/>   
                        </td>    
                        <td>
                        <input type="hidden" name="id" value="${i.comicid}"/>
                        <input type="submit" value="Update" name="action"/>
                        </td>
                        <td>

                        </td>
                    </form>
                </tr>
            </c:forEach> 
                                

        </tbody>
    </table>
        <div>ADD New Product</div>
                <tr>
                <form action="MainController" method="post">
                    <div>Product ID <input type="text" name="comicID" size="2" required</div>
                    <div>Product Name <input type="text" name="name" size="20"required</div>
                    <div>Description <input type="text" name="description" size="20"required</div>
                    <div>Artist <input type="text" name="artist" size="20"required</div>
                    <div>Product Price <input type="text" name="price" size="5"required</div>   
                    <div>Image Link <input type="text" name="image" size="20"required</div>
                    <div>Quantity <input type="text" name="quantity" size="1"required</div>
                
                    <td>
                        <input type="submit" name="action" value="Add">                                  
                    </td>
                    
                </tr>

</body>
</html>
