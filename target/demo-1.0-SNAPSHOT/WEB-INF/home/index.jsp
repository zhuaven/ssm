<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<html>
<head>
<title>home page</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script src="/pages/js/jquery.min.js"></script>
<script src="http://apps.bdimg.com/libs/jquery/2.1.1/jquery.min.js"></script>
</head>

<body>
<h2>home page ssm!</h2>
<h1>${requestScope.user}</h1>
<h1>${requestScope.param}</h1>

<div id="b01">点击post</div>
<br>
<a href="#" id="a01">点a击post</a>

<div id="myDiv">点击post</div>
<br><br><br>
点击次数：
<div id="count">点击post</div>
<script>
$(document).ready(function(){
  let count = 0;
  $("#a01").click(function(){
    var htmlobj=$.ajax({
        url:"/home/demo",
        type:"post",
        async:false
      });
    $("#myDiv").html(htmlobj.responseText);
    count++;
    $("#count").html(count);
  });

    $("#b01").click(function(){
        var htmla=$.ajax({url:"/home/demo",type:"post",async:false});
        $("#myDiv").html(htmla.responseText);
    });
});
</script>
</body>
</html>
