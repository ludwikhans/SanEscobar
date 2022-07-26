function southVilage(){
      var locationId = 1;
}

function northVilage(){
    var locationId = 2;
}

function easthVilage(){
    var locationId = 3;
}

function westVilage(){
    var locationId = 4;
}

function centralVilage(){
    var locationId = 5;
}

window.onload = function (){
    document.getElementById('1').onclick = northVilage;
    document.getElementById('2').onclick = easthVilage;
    document.getElementById('3').onclick = centralVilage;
    document.getElementById('4').onclick = southVilage;
    document.getElementById('5').onclick = westVilage;
}