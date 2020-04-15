<html>
<head>
    <style type="text/css">
        body{
            background-color: #AEDD81;
        }
        #div1 {
            position:absolute;
            top:50%;
            left:50%;
            margin:-150px 0 0 -200px;
            width:400px;
            height:300px;
        }
    </style>

</head>
<body>
<div id="div1">
    <form  id="loginForm" action="User/login.do" method="post">
        username:<input type="text" name="username" id="username"><br><br>
        password: <input type="password" name = "password" id="password"><br><br>
        <button id="submit" >submit</button>
    </form>
</div>
</body>
</html>
