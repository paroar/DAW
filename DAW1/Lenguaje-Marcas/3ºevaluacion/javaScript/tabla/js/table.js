var color = ["Azul","Negro","Rojo","Blanco"];

function onLoad(){
	var body = document.querySelector("body");
	var xI = document.createElement("button");
	xI.setAttribute("onclick","escribir()")
	xI.innerHTML = "+";
	body.appendChild(xI);
	var table = document.querySelector("table");
	for (var i = color.length - 1; i >= 0; i--) {
		var tr = document.createElement("tr");
		var td = document.createElement("td");
		var td2 = document.createElement("td");
		var x = document.createElement("input");
		x.setAttribute("type","button");
		x.setAttribute("value","X");
		x.setAttribute("onclick", "borrar(event)");
		td.innerHTML = color[i];
		tr.appendChild(td);
		tr.appendChild(td2);
		td2.appendChild(x);
		table.appendChild(tr);
	}
}

function escribir(){
	var info = prompt();
	var table = document.querySelector("table");
	var tr = document.createElement("tr");
	var td = document.createElement("td");
	var td2 = document.createElement("td");
	var x = document.createElement("input");
	x.setAttribute("type","button");
	x.setAttribute("value","X");
	x.setAttribute("onclick", "borrar(event)");
	td.innerHTML = info;
	tr.appendChild(td);
	tr.appendChild(td2);
	td2.appendChild(x);
	table.appendChild(tr);
}

function borrar(event){
	event.target.parentNode.parentNode.remove();
}