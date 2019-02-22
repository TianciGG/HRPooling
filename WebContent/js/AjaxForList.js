$(document).ready(function(){
	$('#btnSubmit').bind('click',AjaxSubmit);
});

function AjaxSubmit(){
	$.ajax({
		url:"/HRPooling/OutAction",
		type:"get",
		datatype:'json',
		success:function(data){
			alert(data);
		}
	});
}
