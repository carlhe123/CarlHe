<%--
  Created by IntelliJ IDEA.
  User: hebiao
  Date: 2019/6/25
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()  + path + "/";
%>
<html lang="en" data-ng-app="app">
<head>
    <title>登录</title>
    <link rel="stylesheet" href="/static/css/abn_tree.css">
    <link rel="stylesheet" href="/static/css/app.css">
    <link rel="stylesheet" href="/static/css/font.css">
    <link rel="stylesheet" href="/static/css/bootstrap.css">
    <link rel="stylesheet" href="/static/css/font-awesome.min.css">
</head>
<body ng-controller="AppCtrl">
<script src="/static/js/main.js"></script>
<script src="/static/js/angular.js"></script>
<script src="/static/js/jquery-1.10.2.js"></script>
<div class="wrapper-md">
    <button type="button" class="close" data-dismiss="modal" aria-hidden="true" ng-click="cancel()">&times;</button>
    <div class="panel-heading">首页登录</div>
    <div class="panel-body">
        <div class="hbox hbox-auto-xs hbox-auto-sm">
            <div class="modal-body">
                <div class="row wrapper">
                    <form class="form-horizontal form-validation" name="form">
                        <div class="col-sm-12">
                            <div class="col-sm-6">
                                <label class="col-sm-2">用户名：</label>
                                <input ng-model="username"/>
                            </div>
                            <div class="col-sm-6">
                                <label class="col-sm-2">密码：</label>
                                <input ng-model="password"/>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</div>
<div class="modal-footer">
    <button class="btn btn-default" ng-click="cancel()">取消</button>
    <button class="btn btn-primary" ng-disabled="form.$invalid" ng-click="submit()">提交</button>
</div>
</body>
<script>
    var contextPath = '<%=path%>';
    function absUrl(str) {
        return contextPath + "/" + str;
    }
</script>
</html>
