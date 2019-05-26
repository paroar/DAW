var boxImage = document.querySelector('.box');

crearImagen();
function crearImagen(){
	var imagen = document.createElement("img");
	imagen.setAttribute("src","img/1.jpg")
	boxImage.appendChild(imagen);
}

boxImage.addEventListener("click",sigImagen);
setInterval(sigImagen, 3000);

var contador = 1;
function sigImagen(){
	contador++;
	if (contador==9) {
		contador = 1;
	}
	document.querySelector("img").setAttribute("src","img/"+contador+".jpg");
}

