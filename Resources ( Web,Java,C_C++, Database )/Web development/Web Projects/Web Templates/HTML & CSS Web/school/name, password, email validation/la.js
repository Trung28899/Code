   $(function() {
    $('.error').hide();
    $(".button").click(function() {
      // validate and process form here
      
       $('.error').hide();
      var firstname = $("input#firstname").val(); // take value of tag = input, id = name
	 // first name must not be empty
	 if (firstname == "") {
        $("label#firstname_error").show(); // show tag = lab1, class = error, for name (because we hide it from the code above)
        $("input#firstname").focus();  // focus to the input
        return false;			  // Be sure to return false, otherwise the form get submitted
      }
	  
	  // first name must contain no number 
	  var pattern = /^[a-zA-Z]*$/;  
	  if(!pattern.test(firstname)){ 			// test if the name in the specified range or not, if not
		 $("label#firstname_error2").show(); 	// execute the code below 
		 $("input#firstname").focus(); 
		 return false; 	  
	  }
	  
	  var lastname = $("input#lastname").val();
    // last name must not be empty 
	if (lastname == "") {
        $("label#lastname_error").show();
        $("input#lastname").focus();
        return false;
      }
	  
	  	  // last name must contain no number  
		var pattern2 = /^[a-zA-Z]*$/; 
	  if(!pattern2.test(lastname)){ 			// test if the name in the specified range or not, if not
		 $("label#lastname_error2").show(); 	// execute the code below 
		 $("input#lastname").focus(); 			// .test() return true if pattern matched
		 return false; 	  
	  }
	  
   var email = $("input#email").val();
	// jquery email validaton   :   var pattern = /^([\w-\.]+@([\w-]+\.)+[\w-]{2,4})?$/;
    // search regular expression in jquery to understand more about this
	// email must not be empty 
	if (email == "") {
        $("label#email_error").show();
        $("input#email").focus();
        return false;
      }
	  

	  // password must not be empty 
    var password = $("input#password").val();
	//Minimum eight characters, at least one uppercase letter, one lowercase letter, one number and one special character:
    var pattern3 = /^[a-zA-Z0-9$!]*$/;
	var length = $("input#password").val().length; 
	
	if(password == "")
	{
		$("label#password_error").show();
        $("input#password").focus();
        return false;
	}
	if(length <8)
	{
		$("label#password_error2").show();
        $("input#password").focus();
        return false;
	}
	
    });
  });
