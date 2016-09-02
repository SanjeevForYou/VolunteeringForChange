	// pathname is contextRoot/path/path/ so we want to get [1] that is where contextRoot is
	// [0] has "" as a result of split 
	var contextRoot = "/" + window.location.pathname.split( '/' )[1];

	function displayEvent(id)
	{
		//alert(categoryId);
		 $("#drop").hide();
			 $.ajax({
				url:contextRoot+"/event/retrieveEventByCategory",
				type: "POST",
				data:'id='+ id,
				//data:{},
				datatype:"json",
				//contentType: 'application/json',
				success: function(response){
					alert("I am here in success after getting Event");
					//displayEvent(response);
				}, 
				error: function(){
					alert ('Error')
				}
			  })
	}

	
$(function(){
	
	
	$("#result").on('click',function(){
		 $("#drop").show();
		$("#drop").empty();
		$.ajax({
			
			type : 'POST',
			url :contextRoot + "/category/retrieveCategory",
			data: {},
			datatype : "json",
			contentType: 'application/json',
			success : function(response) {
				//alert("I am here in Ajaz");
				displayCategory(response);
				//displayCategory();
			},
			error: function(){
				alert('Error while request...');
			}
			
			

		});
	})
		
		/*function displayCategory(){
			 $("#drop").append('<p>'+ category.name+'</p>');
		}*/
		
		function displayCategory(categorylist){ 
			//alert("I am here in Ajaz");
		 jQuery.each(categorylist,
		 function(i,category){ 
			$("#drop").append('<li > <a id="drop-down-values" href="#" onclick="displayEvent('+category.categoryId+');">'+ category.name+'</a> </li>'); 
			//$("#drop").append('<li> <a id="drop-down-values" onclick="displayEvent(\'${'+category.categoryId+'}\');">'+ category.name+'</a> </li>'); 
			 })
			 }
		

	
	/*function displaycategory(name){
		$("#dropdown-menu").append('<li>'+name+'</li>');
	}*/

	
 // function displayEvent(categoryId){
	$("#drop-down-values").on('click', function(){ 
	  $("#drop").hide();
	/*  $.ajax({
		url:rootContext+"/event/retrieveEventByCategory",
		type: "GET",
		data:'id='+categoryId,
		dataType:"json",
		success: function(response){
			alert("I am here in success");
			displayEvent(response);
		},   
	  })*/
	});	
})


	 /*$("#result").on('click', 'button', function() {
		$.ajax({
			url : '/retrieveCategory',
			type : 'GET',
			datatype : "json",
			success : function(response) {
				alert("succeded");
				displayCategory(response);
			}

		});
	
}) */

/*
 * function displayCategory(categoryList){ jQuery.each(categoryList,
 * function(i,category){ $("#dropdown-menu").append('<li>'+ category.name+'</li>'); }) }
 */

	