$( document ).ready(function() {
	var nbreponse = 0;
	var newreponse;
	var istrue;
    $(".addReponse").click(function(event){
    	event.preventDefault();
    	console.log("clique");
    	newreponse = $("#newresponse").val();
    	nbreponse++;
    	istrue = $('input[name=istrue]:checked', '#myform').val();
    	var check = "";
    	if(istrue == 1){
    		check = "V";
    	}else{
    		check = "F";
    	}
    	$(".tablereponses").append("<tr><td>"+check+"</td><td>"+newreponse+"</td><td>modifier</td><td>suppr</td></tr>")
    	$("#newresponse").val("");
    });
});