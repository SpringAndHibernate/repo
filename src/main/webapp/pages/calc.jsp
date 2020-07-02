<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>

</head>
<body>
<form action= "/calc" method="post">
    <input type="text" name="digit1">
    <input type="text" name="digit2">
    <input type="text" name="operation">
    <button>Calculate</button>
</form>
Result is ${calcResult}
</body>
</html>
