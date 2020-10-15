<%@page contentType="text/html; charset=EUC-KR"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>글 목록</title>
</head>
<body>
	<center>
		<h1>hello world</h1>
		<h3>${userName }님!
			게시판에 오신걸 환영합니다...<a href="logout.do">Log-out</a>
		</h3>
		<!-- 검색 시작 -->
		<form action="getBoardList.jsp" method="post">
			<table border="1" cellpadding="0" cellspacing="0" width="700">
				<tr>
					<td align="right"><select name="searchCondition">
							<option value="TITLE">제목
							<option value="CONTENT">내용
					</select> <input name="searchKeyword" type="text" /> <input type="submit"
						value="검색" /></td>
				</tr>
			</table>
		</form>
		<!-- 검색 종료 -->
<div ng-app="myApp" ng-controller="myCtrl">
{{myCtrl.firstName}}
{{firstName}}
Full Name:{{ firstName + lastName }}
</div>



<script>
var app=angular.module('myApp',[]);
app.controller('myCtrl',function($scope){
    $scope.firstName=${board.seq };
    $scope.lastName=${board.regDate };
});

</script>


</body>
</html>