function myFunction(){
  var elmnt = document.getElementById("myDIV");
  var y = elmnt.scrollTop;
  console.log(y);
  if(y>1000 && y<3000){
  	document.getElementById("content").style.background = 'red';
  }else{
  	document.getElementById("content").style.background = 'coral';
  }
}