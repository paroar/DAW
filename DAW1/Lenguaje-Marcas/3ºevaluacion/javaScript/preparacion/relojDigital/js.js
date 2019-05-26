var box = document.querySelector(".box");
reloj();

function reloj() {
	var d = new Date();
	h = d.getHours();
	m = d.getMinutes();
	s = d.getSeconds();
	if(h<10){
		h='0'+h;
	}
	if(m<10){
		m='0'+m;
	}
	if(s<10){
		s='0'+s;
	}
	pintar();
}

function pintar(){
	box.innerHTML = h+":"+m+":"+s;
}

setInterval(reloj,1000);

function color(){
	var r = function () { 
    	    	return Math.floor(Math.random()*255) 
   			};
	box.style.borderColor = "rgb(" + r() + "," + r() + "," + r() + ")";
}

setInterval(color,5000);