function onLoad(){
	var div = document.createElement('div');

	var select1 = document.createElement("select");
	select1.setAttribute("name","comunidades");
	select1.setAttribute("onchange", "loadProvince(event)");
	var option1 = document.createElement("option");
	option1.innerHTML = "Comunidad Autónoma";
	select1.appendChild(option1);

	var select2 = document.createElement("select");
	select2.setAttribute("name","provincias");
	select2.setAttribute("onchange", "loadProvince(event)");
	var option2 = document.createElement("option");
	option2.innerHTML = "Provincia";
	select2.appendChild(option2);	

	div.appendChild(select1);
	div.appendChild(select2);

	document.querySelector("body").appendChild(div);
	console.log(div);

	var ca = ["Andalucía","Canarias","Aragón"]
	ca.sort();
	addOptions("comunidades",ca);
}

function loadProvince(event){
	var array;
	removeOptions("provincias");
	switch(event.target.value){
		case "Andalucía":
			array = ["Sevilla","Almería","Cádiz","Córdoba","Granada","Huelva","Jaén","Málaga"];
			break;
		case "Aragón": 
			array = ["Huesca","Teruel","Zaragoza"];
			break;
		case "Canarias": 
			array = ["Las Palmas","Santa Cruz de Tenerife"];
			break;
	}
	array.sort();
	addOptions("provincias",array);
}

function addOptions(domElement,array){
	var select = document.getElementsByName(domElement)[0];
	var option;
	for (value in array){
		option = document.createElement("option");
		option.text = array[value];
		option.value = array[value];
		select.add(option);
	}
}

function removeOptions(event){
	var select = document.getElementsByName(event)[0];
	var count = select.length;
	for(var i = 0; i < count; i++){
		select[0].remove();
	}
}