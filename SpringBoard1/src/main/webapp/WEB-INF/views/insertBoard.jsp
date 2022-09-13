<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome!</title>
<link rel="stylesheet" href="/resources/css/style.css">

<script type="text/javascript">
	function checkForm(){
		
		let form = document.checkform;
		
		if(form.title.value == ""){
			alert("제목을 입력 해주세요");
			form.tilte.focus();
			return false;
		}else if(form.writer.value == ""){
			alert("작성자를 입력 해주세요");
			form.writer.focus();
			return false;
		}else if(form.content.value == ""){
			alert("내용을 입력 해주세요");
			form.content.focus();
			return false;
		}
	}

</script>
</head>
<body>
	<div id="container">
		<section id="list">
			<h2>글쓰기</h2>
			<form action="/insertBoard" method="post" onsubmit= "return checkForm()" name="checkform">
				<table class="tbl_reg">
					<tr>
						<td>제목</td>
						<td><input type="text" name="title"></td>
					</tr>
					<tr>
						<td>작성자</td>
						<td><input type="text" name="writer"></td>
					</tr>
					<tr>
						<td>내용</td>
						<td><textarea name="content" cols="50" rows="10"></textarea>
						</td>
					</tr>
					<tr>
						<td colspan="2">
						<input type="submit" value="등록">
						<a href="/boardList"><input type="button" value="목록"></a></td>
					</tr>
				</table>
			</form>
		</section>
	</div>
</body>
</html>