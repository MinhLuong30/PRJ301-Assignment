<%-- 
    Document   : customer
    Created on : Mar 21, 2024, 9:45:39 PM
    Author     : minhl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
.products-container {
    display: flex;
    flex-wrap: wrap;
    gap: 16px;
    background-color: #f4f4f4; /* Light gray background for the container */
}

.product-card {
    width: 200px; /* Adjust width as necessary */
    border: 1px solid #ddd;
    border-radius: 20px;
    padding: 8px;
    box-shadow: 0px 2px 4px rgba(0, 0, 0, 0.1);
    background-color: #ffffff; /* White background for the cards */
    transition: transform 0.3s ease-in-out; /* Smooth transformation upon hover */
}

.product-card:hover {
    transform: translateY(-5px); /* Slightly raise the card on hover */
    box-shadow: 0px 4px 6px rgba(0, 0, 0, 0.15); /* Increase shadow on hover */
}

.product-image img {
    width: 100%;
    height: auto;
    border-top-left-radius: 20px; /* Make the image corners rounded */
    border-top-right-radius: 20px;
}

.product-info {
    margin-top: 8px;
}

.product-info h5 {
    margin: 0;
    font-size: 1em;
    color: #333; /* Darker text color for the title */
}

.product-info p {
    margin: 4px 0;
    font-size: 0.8em;
    color: #666; /* Lighter text color for description and other info */
}

.product-info .price {
    color: #d10000; /* A vibrant red color for the price */
    font-weight: bold;
}

.product-actions {
    margin-top: 8px;
    text-align: center;
}

.product-actions form {
    display: flex;
    gap: 8px;
    justify-content: center;
}

.product-actions input[type="button"],
.product-actions input[type="submit"] {
    padding: 4px 8px;
    background-color: #008CBA; /* Blue background for buttons */
    color: white; /* White text on the buttons */
    border: none;
    border-radius: 4px;
    cursor: pointer; /* Changes the cursor to a pointer on hover */
}

.product-actions input[type="button"]:hover,
.product-actions input[type="submit"]:hover {
    background-color: #005f73; /* Darker blue on hover */
}
        </style>
         <script type="text/javascript">
        function addtocart(id) {
            window.location = "MainController?action=Addtocart&id=" + id;
        }

    </script>
    </head>
    <body>
        <body>
    <h1>Welcome ${sessionScope.LOGIN_US.fullname}</h1>
    <form action="MainController" method="POST">
        <input type="submit" name="action" value="ShowCus"/>
        <input type="submit" name="action" value="GoBack"/>
    </form>

                                
    <div class="products-container">
        <c:forEach items="${sessionScope.PRODUCTS}" var="i" varStatus="counter">
            <div class="product-card">
            <div class="product-image">
                <img src="./images/${i.image}" alt="${i.name}">
            </div>
            <div class="product-info">
                <h5>${i.name}</h5>
                <p>${i.description}</p>
                <p class="artist">${i.artist}</p>
                <p class="price">${i.price}</p>
            </div>
            <div class="product-actions">
                <form action="MainController" method="POST">
                    <input type="hidden" name="id" value="${i.comicid}">
                    <input type="button" value="AddToCart" onclick="addtocart('${i.comicid}')">
                </form>
            </div>
        </div>
    </c:forEach>
</div>

</body>
</html>