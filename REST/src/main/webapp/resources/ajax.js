
$(function() {
	$("#check").click(function() {
			var member = {
					id:"park",
					name:"박이름",
					pwd:"4321",
					email:"park@test.com"
			};
			
			$.ajax({
				type:"post",
				url:'/REST_TEST/test/info',
				contentType: "application/json",
				data:JSON.stringify(member),  //회원 정보를 json 문자열 타입으로 변경
				success:function (data, textStatus){	
				},
				error:function (data, textStatus){	
					alert("에러 발생");
				}
			});
		});
});