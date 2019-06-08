var alumnos = 
[
"Aguado Perez, Xavi",
"Alvarez Rodriquez, Juan",
"Delgado Martinez, Mari",
"Fernández Fernández, Petra",
"García Martín, Dominguito",
"Hernández Pérez, Julia",
"Jimenez Ochoa, Raúl",
"Jimenez Zato, Jose",
"Rodriguez Fernández, Alberto",
"Simeone, Diego"
]

function onload(){
	for(var i = 0; i< alumnos.length; i++){
		var d = document.querySelector('#izq');
		var p = document.createElement("p");
		p.setAttribute("onclick","pasar()");
		p.setAttribute("class","izq");
		p.innerHTML = alumnos[i];
		d.appendChild(p);
	};
}


var divIzq = document.getElementById('izq');
var divDcha = document.getElementById('dcha');
var aux;
function pasar(){
	aux = event.target;
	if(aux.className == 'dcha'){
		aux.setAttribute("class","izq");
		divIzq.appendChild(aux);
	}else{
		aux.setAttribute("class","dcha");
		divDcha.appendChild(aux);
	}
}

document.getElementById("S").addEventListener("change",mostrar);
document.getElementById("N").addEventListener("change",ocultar);

function mostrar(){
	var d = document.querySelector('#dcha');
	var i = document.querySelector('#izq');
	d.style.display = "initial";
	i.style.display = "initial";
}

function ocultar(){
	var d = document.querySelector('#dcha');
	var i = document.querySelector('#izq');
	d.style.display = "none";
	i.style.display = "none";
}