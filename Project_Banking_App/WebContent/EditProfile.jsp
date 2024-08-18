<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Profile</title>
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
    }
    .form-container {
        max-width: 600px;
        margin: 0 auto;
        padding: 20px;
        background-color: #ffffff;
        border-radius: 10px;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
    }
    .form-container h2 {
        margin-top: 0;
        color: #0044cc;
    }
    .form-container label {
        display: block;
        margin-bottom: 8px;
        font-weight: bold;
    }
    .form-container input[type="text"],
    .form-container input[type="password"] {
        width: 100%;
        padding: 10px;
        margin-bottom: 20px;
        border: 1px solid #ccc;
        border-radius: 5px;
    }
    .form-container button {
        background-color: #0044cc;
        color: white;
        padding: 10px 20px;
        border: none;
        border-radius: 5px;
        font-size: 16px;
        cursor: pointer;
        margin-right: 10px;
    }
    .form-container button:hover {
        background-color: #003399;
    }
    .form-container .cancel-button {
        background-color: #f44336;
    }
    .form-container .cancel-button:hover {
        background-color: #c62828;
    }
</style>
</head>
<body>

<div class="form-container">
    <h2>Edit Profile</h2>

    <form action="EditProfileController" method="post">
        <label for="firstname">First Name:</label>
        <input type="text" id="firstname" name="firstname" required>

        <label for="lastname">Last Name:</label>
        <input type="text" id="lastname" name="lastname" required>

        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required >

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>

        <button type="submit">Change</button>
        <button type="button" class="cancel-button" onclick="window.location.href='CustomerHome.jsp'">Cancel</button>
    </form>
</div>

</body>
</html>
