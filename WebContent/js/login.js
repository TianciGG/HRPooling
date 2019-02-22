/**
 * 登录逻辑
 */


$(document).ready(function(){
	
	$('btnSubmit').bind('click',btnSubmit_Click);
});


function btnSubmit_Click()
{
	this.location="/HRPooling/page/index.jsp";
}