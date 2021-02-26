<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Spring Form Demo Submissions</title>

    <link rel="stylesheet" href="/vendor/normalize.css">
    <link rel="stylesheet" href="/vendor/skeleton.css">

    <link rel="stylesheet" href="/style.css">
</head>
<body>
    <div class="container">
        <h1>Spring Form Demo Submissions</h1>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Age</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="user" items="${users}">
                    <tr>
                        <td>${user.id}</td>
                        <td>${user.name}</td>
                        <td>${user.email}</td>
                        <td>${user.age}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html> 