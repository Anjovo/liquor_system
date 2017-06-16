<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'login.jsp' starting page</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!-- Bootstrap 3.3.6 -->
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="css/admin/AdminLTE.min.css">
    <!-- iCheck -->
    <link rel="stylesheet" href="plugins/iCheck/square/blue.css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body class="hold-transition login-page">

<div class="login-box">
    <div class="login-logo">
    <a href="javascript:;"><b>智慧水利</b></a>
    </div>
    <!-- /.login-logo -->
    <div class="login-box-body">
    <p class="login-box-msg">后台登录</p>

    <form action="user/userAction!login" method="post">
    <div class="form-group has-feedback">
    <input id="userName" name="user.username" type="text" class="form-control" placeholder="账 号" required>
<span class="glyphicon glyphicon-user form-control-feedback"></span>
    </div>
    <div class="form-group has-feedback">
    <input id="password" name="user.password" type="password" class="form-control" placeholder="密 码" required>
<span class="glyphicon glyphicon-lock form-control-feedback"></span>
    </div>
    <div class="row">
    <div class="col-xs-8">
    <div class="checkbox icheck">
    <label> <input type="checkbox"> 记住我
    </label>
    </div>
    </div>
    <!-- /.col -->
    <div class="col-xs-4">
    <button type="submit" class="btn btn-primary btn-block btn-flat">登录</button>
    </div>
    <!-- /.col -->
    </div>
    </form>

    </div>
    <!-- /.login-box-body -->
    </div>
    <!-- /.login-box -->

    <!-- jQuery 2.2.3 <-->
<script src="plugins/jQuery/jquery-2.2.3.min.js"></script>
<!-- Bootstrap 3.3.6 -->
<script src="bootstrap/js/bootstrap.min.js"></script>
<!-- iCheck -->
<script src="plugins/iCheck/icheck.min.js"></script>

</body>
</html>
