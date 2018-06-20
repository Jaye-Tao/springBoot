<!DOCTYPE HTML>
<head>
<#include "main.ftl"/>
    <title>hello</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse"
                    data-target="#example-navbar-collapse">
                <span class="sr-only">切换导航</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">菜鸟教程</a>
        </div>
        <div class="collapse navbar-collapse" id="example-navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">iOS</a></li>
                <li><a href="#">SVN</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        Java <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="#">jmeter</a></li>
                        <li><a href="#">EJB</a></li>
                        <li><a href="#">Jasper Report</a></li>
                        <li class="divider"></li>
                        <li><a href="#">分离的链接</a></li>
                        <li class="divider"></li>
                        <li><a href="#">另一个分离的链接</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>

<table class="table">
    <caption>上下文表格布局</caption>
    <thead>
    <tr>
        <th>产品</th>
        <th>付款日期</th>
        <th>状态</th></tr>
    </thead>
    <tbody>
    <#list name as p>
    <tr class="active">
        <td>${p}</td>
        <td>23/11/2013</td>
        <td>待发货</td>
    </tr>
    </#list>
    </tbody>
</table>
<h1>${base}</h1>

<div ng-app="myApp" ng-controller="myCtrl">

    名:  <input type="text" ng-model="firstName"><br>
    姓:  <input type="text" ng-model="lastName"><br>

    <br>
    姓名: {{firstName + " " + lastName}}

    <div ng-controller="moneyCtrl">
        <h1 > 价格：{{ 12.564789| currency }}</h1></div>

</div>



<script>
    var app = angular.module('myApp', []);
    app.controller('myCtrl', function($scope) {
        $scope.firstName = "John";
        $scope.lastName = "Doen";
    });
    app.controller('moneyCtrl', function($scope) {
        $scope.price = "12.56";
    });
</script>
</body>
</html>