<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Spring Form Demo</title>

    <link rel="stylesheet" href="/vendor/normalize.css">
    <link rel="stylesheet" href="/vendor/skeleton.css">

    <link rel="stylesheet" href="/style.css">
</head>
<body>
    <div class="container">
        <h1>Spring Form Demo</h1>
        <form:form action="/submit" method="post" modelAttribute="user">
            <div class="row">
                <div class="ten columns">
                    <label for="name">Full Name <form:errors path="name" cssClass="error" /></label>
                    <form:input type="text" path="name" class="u-full-width" placeholder="Your name here..." id="name" />
                </div>
                <div class="two columns">
                    <label for="age">Age <form:errors path="age" cssClass="error" /></label>
                    <form:input type="number" path="age" class="u-full-width" placeholder="Age?" id="age" />
                </div>
            </div>
            <div class="row">
                <label for="email">Email <form:errors path="email" cssClass="error" /></label>
                <form:input type="email" path="email" class="u-full-width" placeholder="Your email id here..." id="email" />
            </div>
            <input class="button-primary" type="submit" value="Submit">
        </form:form>
    </div>
</body>
</html>