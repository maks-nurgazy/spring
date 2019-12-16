<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Tiger - Animal</title>
</head>
<body>

    <h1>Animal World</h1>

    <form:form action="/animal/tiger" modelAttribute="tiger">
        Animal name: <form:input path="name"/>
        Animal voice: <form:input path="voice"/>
        <br><br>
        <input type="submit" value="Submit">
    </form:form>

</body>
</html>