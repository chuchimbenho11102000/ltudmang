<%@ page language="java" contentType="text/html; charset=UTF-8"%>
 
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        <title>LOGIN</title>
        <base href="/">
    </head>
    <body>
    <div>
    <h1 style="margin: 0 auto; color: rgb(255, 230, 4);">ĐĂNG NHẬP</h1>
        
        <div class="container" style="margin-top:100px;background-image: url('https://muahohangnhat.net/wp-content/uploads/2019/04/mat-hang-dien-tu-nhat-ban-1.png'); ">
            <div class="row" style="border: 1px darkgrey solid; border-radius: 10px;width: 50%; margin: 0 auto; padding: 20px;" >
                <div class="col-sm-12">
                <h3>Login</h3>
                <form action="login" method="get">
                    <div class="form-group">
                        <label>UserName</label>
                        <input type="text" class="form-control" name="username" placeholder="Enter UserName">
                    </div>
                    <div class="form-group">
                        <label>Password:</label>
                        <input type="password" class="form-control" name="password" placeholder="Enter password">
                    </div>
                    <div class="checkbox">
                        <label><input type="checkbox"> Remember me</label>
                    </div>
                    <p style="color: red">Username and password not exist</p>
                    <button type="submit" class="btn btn-primary">Submit</button>
                    <button type="reset" class="btn btn-primary">Cancel</button>
                    <p style="margin: 10px; font-size: 16px;"><a href="register-user.jsp">Register</a></p>
                </form>
                </div>
            </div>
        </div>
        </div>
    </body>
</html>
