var num = document.getElementsByClassName("num");
var igual = document.getElementById('=').addEventListener("click", equal);
var op = document.getElementsByClassName('op');
var ac = document.getElementById('AC').addEventListener("click", ac);

for(i = 0;i < num.length; i++){
	num[i].addEventListener("click",n);
}

for(i = 0;i < op.length; i++){
	op[i].addEventListener("click", oper);
}


var acum1 = 0;
var acum2 = 0;
var operation = '';
function n (event) {
	acum1 = parseInt(document.getElementById('screen').innerHTML + event.target.value);
	document.getElementById('screen').innerHTML = acum1;
}

function equal(){
	switch(operation){
		case '+': document.getElementById('screen').innerHTML = acum2+acum1;
			break;
		case '-': document.getElementById('screen').innerHTML = acum2-acum1;
			break;
		case '*': document.getElementById('screen').innerHTML = acum2*acum1;
			break;
		case '/': document.getElementById('screen').innerHTML = acum2/acum1;
			break;									
	}
	operation = '';
	acum1 = 0;
}

function oper(event){
	acum2 = parseInt(document.getElementById('screen').innerHTML);
	document.getElementById('screen').innerHTML = '';
	operation = event.target.value;
	acum1 = 0;
}

function ac(){
	acum1 = 0;
	acum2 = 0;
	document.getElementById('screen').innerHTML = '';
}