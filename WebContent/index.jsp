<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="/testlaji/jquery.js"></script>
<title>Insert title here</title>
</head>
<body>
<div id="xx"></div>
<script type="text/javascript">
	function oncomple(href){
		$.post(href,{},function(data){
			
			$("#xx").html(data);
		})	
	}
</script>
</body>
</html>