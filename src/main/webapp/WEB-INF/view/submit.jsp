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
        <h1>Submitted Form</h1>
        <form:form modelAttribute="user">
            <div class="row">
                <div class="ten columns">
                    <label for="name">Full Name</label>
                    <form:input type="text" path="name" class="u-full-width" id="name" disabled="true" />
                </div>
                <div class="two columns">
                    <label for="age">How old are you?</label>
                    <form:input type="number" path="age" class="u-full-width" id="age" min="10" max="99" disabled="true" />
                </div>
            </div>
            <div class="row">
                <label for="email">Email</label>
                <form:input type="email" path="email" class="u-full-width" id="email" disabled="true" />
            </div>
        </form:form>
    </div>
</body>
</html>