
document.getElementById('siguiente').addEventListener('click',next);
document.getElementById('anterior').addEventListener('click',previous);

var maxCounter = 8;
var imageCounter = 1;
function next() { 
	var image = document.getElementById('image'); 
	if(imageCounter==maxCounter) {
		image.src = 'img/1.jpg';
		imageCounter = 1;
	}else{ 
		imageCounter++;
		image.src = 'img/' + imageCounter + '.jpg';
	}
}

function previous() { 
	var image = document.getElementById('image'); 
	if(imageCounter==1) { 
		image.src = 'img/' + maxCounter + '.jpg';
		imageCounter = maxCounter;
	}else{
		imageCounter--; 
		image.src = 'img/' + imageCounter + '.jpg';
	}
}

function auto() {
	var date = new Date();
	var sec = date.getSeconds();
	if(sec%10 == 0){
		next();
	}
	auto();
}