<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>  
<html>
<header>
<script>
function selectMenu(menuId){
	for(var i=1;i<=4;i++){
		document.getElementById("view"+i).style.display='none';
	}
	document.getElementById("view"+menuId).style.display='block';
}
</script>
</header>

<body>
<div style="width:100%;text-align:right;display:flex;" id="nav">
<div style="width:20%" onclick="selectMenu(1)">餐厅管理</div>
<div style="width:20%" onclick="selectMenu(2)">菜谱管理</div>
<div style="width:20%" onclick="selectMenu(3)">菜单管理</div>
<div style="width:20%" onclick="selectMenu(4)">系统管理</div>
</div>
<div id="view1">
<form action="" method="POST">
	餐厅名称
	<input type="text" name="restaurantName"><br />
	地址
	<input type="text" name="addr"><br />
	联系电话
	<input type="text" name="tel"><br />
	标签
	<input type="text" name="tag"><br />
	定位
	<input type="text" name="location"><br />
	<input type="submit" valur="提交"><br />
</div>
<div id="view2" style="display:none">
<form action="" method="POST">
	菜名
	<input type="text" name="菜名"><br />
	菜系
	<input type="text" name="菜系"><br />
	类别
	<input type="text" name="类别"><br />
	<input type="submit" valur="提交"><br />
</div>
<div id="view3" style="display:none">
<form action="" method="POST">
	店名
	<input type="text" name="店名"><br />
	菜名
	<input type="text" name="菜名"><br />
	价格
	<input type="text" name="价格"><br />
	<input type="submit" valur="提交"><br />
</div>
<div id="view4" style="display:none">
</div>
</body>
</html>

