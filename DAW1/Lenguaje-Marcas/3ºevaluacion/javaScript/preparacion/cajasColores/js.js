var boxes = document.querySelectorAll('.box');
for (var i = boxes.length - 1; i >= 0; i--) {
	boxes[i].addEventListener('mouseover',scale);
	boxes[i].addEventListener('mouseout',reset);
}

function scale(){
	event.target.style.zIndex = "2";
	event.target.style.borderRadius = "100px";
}

function reset(){
	event.target.style.zIndex = "0";
	event.target.style.borderRadius = "0px";
}