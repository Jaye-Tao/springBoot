<#assign base=req.contextPath />
<!DOCTYPE HTML>
<head>
    <link href="${base}/commonstatic/bootstrap/css/bootstrap.css" rel="stylesheet">
    <title>hello</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<script src="${base}/commonstatic/jquery/js/jquery-1.11.3.js1.3.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="../commonstatic/bootstrap/js/bootstrap.js"></script>
<script src="../commonstatic/bootstrap/js/bootstrap.min.js"></script>

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
</body>
</html>