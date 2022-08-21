function southVilage(){
    console.log('Południowa wioska została kliknięta');
}

function northVilage(){
    console.log('Północna wioska została kliknięta');
}

function easthVilage(){
    console.log('Wschodnia wioska została kliknięta');
}

function westVilage(){
    console.log('Zachodnia wioska została kliknięta');
}

function centralVilage(){
    console.log('Centralna wioska została kliknięta');
}

window.onload = function (){
    document.getElementById('1').onclick = northVilage;
    document.getElementById('2').onclick = easthVilage;
    document.getElementById('3').onclick = centralVilage;
    document.getElementById('4').onclick = southVilage;
    document.getElementById('5').onclick = westVilage;
}