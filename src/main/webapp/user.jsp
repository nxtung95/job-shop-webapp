<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - User Management</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 60%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        button {
            size: 15px;
            padding: 5px;
        }
    </style>
</head>
<body>
    <h1>List User</h1>
    <br/>
    <label for="firstCategory">The first category:</label>
    <input type="number" id="firstCategory" name="firstCategory">
    <br/>
    <br/>
    <label for="firstCategory">The second category:</label>
    <input type="number" id="secondCategory" name="secondCategory">
    <br/>
    <br/>
    <button>Search</button>
    <button onclick="${pageContext.request.contextPath}/users/type=add">Add</button>
    <br/>
    <br/>
    <table>
        <tr>
            <th>Customer ID</th>
            <th>Customer Name</th>
            <th>Customer Address</th>
            <th>Category</th>
        </tr>
        <tr>
            <td>Alfreds Futterkiste</td>
            <td>Maria Anders</td>
            <td>Germany</td>
            <td>Germany</td>
        </tr>
        <tr>
            <td>Centro comercial Moctezuma</td>
            <td>Francisco Chang</td>
            <td>Mexico</td>
            <td>Mexico</td>
        </tr>
    </table>
</body>
</html>