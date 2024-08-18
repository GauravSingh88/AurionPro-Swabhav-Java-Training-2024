<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.util.List" %>
<%@ page import="com.aurionpro.entity.CustomerNameAndId" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Home</title>
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        background-image: url('data:image/jpeg;base64,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');
        background-size: cover;
        background-position: center;
        background-attachment: fixed;
        height: 100vh;
        display: flex;
        flex-direction: column;
    }
    .navbar {
        background-color: transparent;
        padding: 10px 20px;
        display: flex;
        justify-content: space-between;
        align-items: center;
        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        z-index: 2;
    }
    .navbar img {
        height: 50px;
    }
    .navbar .nav-links {
        display: flex;
        gap: 20px;
    }
    .navbar a {
        color: rgba(255, 255, 255, 0.9);
        text-decoration: none;
        font-size: 16px;
        padding: 10px 20px;
        border-radius: 5px;
    }
    .navbar a:hover {
        background-color: rgba(255, 255, 255, 0.3);
    }
    .content {
        flex: 1;
        display: flex;
        justify-content: center;
        align-items: center;
        padding: 20px;
    }
    .content .white-box {
        background-color: rgba(255, 255, 255, 0.9);
        padding: 40px;
        border-radius: 10px;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
        max-width: 800px;
        width: 100%;
    }
    .navbar .nav-buttons {
        display: flex;
        gap: 20px;
    }
</style>
</head>
<body>
    <div class="navbar">
        <a href="AdminHome.jsp"><img src="aurionpros_white-2.png" alt="Logo"></a>
        <div class="nav-links">
            <a href="#" onclick="loadContent('AddNewCustomer.jsp')">Add New Customer</a>
            <a href="#" onclick="loadContent('AddBankAccount.jsp')">Add Bank Account</a>
            <a href="http://localhost:8080/Project_Banking_App/ViewCustomersController">View Customers</a>
            <a href="http://localhost:8080/Project_Banking_App/ViewTransactionsController" >View Transactions</a>
            <div class="nav-buttons">
            <button onclick="redirectToFirstPage()">Log out</button>
            
       		</div>
        </div>
    </div>

    <div class="content">
    
        <div class="white-box" id="content-area">
            
            <h1>Welcome to the Admin Dashboard</h1>
            <p>Select an option from the menu at top to manage your bank.</p>
        </div>
    </div>

    <script>
        function loadContent(url) {
            var xhr = new XMLHttpRequest();
            xhr.open('GET', url, true);
            xhr.onreadystatechange = function() {
                if (xhr.readyState === 4 && xhr.status === 200) {
                    document.getElementById('content-area').innerHTML = xhr.responseText;
                }
            };
            xhr.send();
        }
    </script>
    <script>
        function redirectToFirstPage() {
            window.location.href = 'FirstPage.jsp';
        }

    </script>
</body>
</html>
