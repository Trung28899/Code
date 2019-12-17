/* Equavilent code for checkboxes in javascript
	function validate(){
	var checkbox1 = document.getElementById('check1').checked;
	var checkbox2 = document.getElementById('check2').checked;
	var checkbox3 = document.getElementById('check3').checked;
	
	if(!checkbox1 && !checkbox2 && !checkbox3){
		alert("must check"); 
	}
}
*/

// jquery code
$(function() {
    $('.error').hide(); 
	
    $('#button').click(function() {
		$('.error').hide();
      var checkbox1 = $('#check1').is(":checked");
	  var checkbox2 = $('#check2').is(":checked");
	  var checkbox3 = $('#check3').is(":checked");
	  
	  if(!checkbox1 && !checkbox2 && !checkbox3){
		$('label#checkbox_error').show(); 
		$("input#check1").focus();
		$("input#check2").focus();
		$("input#check3").focus();
        return false; // without this the error won't stay for long 
	}
	  
 });
  });