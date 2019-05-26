function startTime() {
    var today = new Date();
    var hr = today.getHours();
    var min = today.getMinutes();
    var sec = today.getSeconds();

    //comprobar ceros
    hr = checkTime(hr);
    min = checkTime(min);
    sec = checkTime(sec);
    document.getElementById("clock").innerHTML = hr + ":" + min + ":" + sec;

    //cambiar color
    if(sec%10 == 0){
        var rgb = randomColor();
    }
    document.getElementById("clock-wrapper").style.border = "10px solid " + rgb;
        
    var time = setTimeout(function(){ startTime() }, 1000);
}

function checkTime(i) {
    if (i < 10) {
        i = "0" + i;
    }
    return i;
}

function randomColor(){
    var r = function () { 
        return Math.floor(Math.random()*255) 
    };
    return "rgb(" + r() + "," + r() + "," + r() + ")";
}