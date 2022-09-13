<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript">

   /*유효성 검사 조건
   1. 아이디는 영문자, 숫자 포함 4-12자 이하로 입력해주세요 
   2. 비밀번호는 영문자, 숫자, 특수문자 포함 8~12자로 입력해주세요
   3. 비밀번호를 동일하게 입력하세요        
   4. 이름을 입력해주세요
   */

   function checkMember(){
   //변수 할당
   let form = document.regForm;     //폼 이름
   let id = form.userid.value;    //아이디 입력값
   let pwd1 = form.userpw.value;    //비밀번호 입력값
   let pwd2 = form.userpw_confirm.value; //비밀번호 확인 입력값
   let name = form.username.value;      //이름 입력값
   
   //정규식 변수 할당
   let regExpId = /^[a-zA-Z0-9]*$/ //영문자, 숫자만(^-시작, *-반복)
   let regExpPwd1 = /[a-zA-Z0-9]/  //영문자, 숫자
   let regExpPwd2 = /[~!@#$%^&*()_+/]/  //특수문자
   let regExpPwd3 = /[ㄱ-ㅎㅏ-ㅣ가-힣]/  //한글
   
   if(id.length < 4 || id.length > 12 || !regExpId.test(id)){
      alert("아이디는 영문자, 숫자 포함 4-12자 이하로 입력해주세요 ");
      form.userid.focus();
      return false;
   }else if(pwd1.length < 8 || pwd1.length > 12 ||
         !regExpPwd1.test(pwd1) || !regExpPwd2.test(pwd1) ||
         regExpPwd3.test(pwd1)){
      alert("비밀번호는 영문자, 숫자, 특수문자 포함 8-12자 이하로 입력해주세요 ");
      form.userpw.focus();
      return false;
   }else if(pwd1 != pwd2){
      alert("비밀번호를 동일하게 입력해주세요");
      form.userpw_confirm.focus();
      return false;
   }else if(name == ""){
      alert("이름을 입력해주세요");
      form.username.focus();
      return false;
      }
   }
</script>
</head>
<body>
   <jsp:include page="../menu.jsp" />
   <div id="container">
      <section id="signup">
         <div class="title">
            <h2>회원 가입</h2>
         </div>
         <form action="/member/signup" method="post" 
              onsubmit="return checkForm()" name="regForm">
            <table class="tbl_signup">
               <tr>
                  <td>아이디</td>
                  <td><input type="text" name="userid" placeholder="ID"></td>
               </tr>
               <tr>
                  <td>비밀번호</td>
                  <td><input type="password" name="userpw"
                         placeholder="PASSWORD"></td>
               </tr>
               <tr>
                  <td>비밀번호 확인</td>
                  <td><input type="password" name="userpw_confirm"
                         placeholder="PASSWORD_CONFIRM"></td>
               </tr>
               <tr>
                  <td>이름</td>
                  <td><input type="text" name="username"></td>
               </tr>
               <tr>
                  <td>이메일</td>
                  <td><input type="text" name="email"></td>
               </tr>
               <tr>
                  <td colspan="2">
                     <input type="submit" value="등록" >
                     <input type="reset" value="취소">
                  </td>
               </tr>
            </table>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
         </form>
      </section>
   </div>
   <jsp:include page="../footer.jsp" />
</body>
</html>