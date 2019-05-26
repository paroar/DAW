var fr = function(event){
	event.target.style.zIndex = 1;
	event.target.style.transform = "scale(1.5)";
};

var reset = function(event){
	event.target.style.zIndex = 0;
	event.target.style.transform = "scale(1)";
};

var each = function(element){
	element.addEventListener("mouseover",fr);
	element.addEventListener("mouseout",reset);
};

var t = document.getElementsByClassName("box");
for (var i = 0; i < t.length; i++) {
	each(t[i]);
};