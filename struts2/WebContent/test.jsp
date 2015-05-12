<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="<%=request.getContextPath()%>/testaction" method="post" >
		1.<span>请告诉我你的style</span></br>
		屌丝:<input type="checkbox" name="style" value="屌丝"/>
		高富帅:<input type="checkbox" name="style" value="高富帅"/>
		白富美:<input type="checkbox" name="style" value="白富美"/></br>
		2.<span>请告诉我你的目的</span></br>
		因为想你:<input type="checkbox" name="mudi" value="因为想你"/>
		因为爱你:<input type="checkbox" name="mudi" value="因为爱你"/>
		因为恨你:<input type="checkbox" name="mudi" value="因为恨你"/></br>
		<input type="submit" value="提交"/>
		
	</form>
</body>
</html>