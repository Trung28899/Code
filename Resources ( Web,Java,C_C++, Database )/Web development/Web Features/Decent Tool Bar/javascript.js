var i = 0; // Start point
	var images = [];
	var time = 1500;

	// Image List
	images[0] = 'BG1.jpg';
	images[1] = 'BG2.jpg';
	images[2] = 'BG3.jpg';
	images[3] = 'BG4.png';

	// Change Image
	function changeImg(){
		document.slide.src = images[i];

		if(i < images.length - 1){
			i++;
		} else {
			i = 0;
		}

		setTimeout("changeImg()", time);
	}

	window.onload = changeImg;