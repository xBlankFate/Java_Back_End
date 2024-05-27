//voglio scrivere qualcosa all'interno di demo

//1 recupero il div con id = "demo"

// let demo = document.getElementById("demo");

// demo.innerHTML ="Ciao, Mondo!!";


//faccio la stessa cosa utilizzando le funzioni
//dichiaro una funzione
function saluta(){
    let demo = document.getElementById("demo");
    demo.innerHTML = "Ciao, Mondo";
}

//richiamo la funzione
saluta();
//att: il richiamo di una funzione è indipendente dalla sua dichiarazione

salutaStudente();


function salutaStudente(){
    let demo = document.getElementById("demo");
    let nome = "Denis";
    demo.innerHTML = "Ciao, " + nome;
}

aggiungiParole();


//posso dichiarare una funzione all'interno di un'altra funzione
function aggiungiParole(){
    let feed = document.getElementById("feed");
    feed.innerHTML = "queste sono le prime parole";
    aggiungiAltreParole(feed)
} 

/**
 * 
 * @param {HTMLElement} elementoHTML 
 */
function aggiungiAltreParole(elementoHTML){

    elementoHTML.innerHTML += ", questo è il resto delle parole"; 

}

//oss: var globali o locali



let mioNome ="Denis";

function prendiNome(){
    let mioNome ="Anna";
    console.log(mioNome);
}

prendiNome();
console.log(mioNome);

function calcolaArea(base,altezza){
    let area = base * altezza;
    return area;
}

let base = 6;
let altezza = 9.5;
let area = calcolaArea(base,altezza);

console.log("L'Area vale: " + area);

let calcArea = function(base,altezza){
    let area = base * altezza;
    // console.log(area);
    return area;
}
console.log(calcArea(5,7));

function calcolaVolume(base,altezza,profondita){
    let area = calcolaArea(base,altezza);
    let volume = area * profondita;
    return volume; 
}

console.log(calcolaVolume(5,6,7));

function calcolaVolume2(area,profondita){

    let volume = area * profondita;
    return volume;

}

console.log(calcolaVolume2(calcolaArea(5,6),7));

function calcolaVolume3(base,altezza,profondita){

    let volume;

    function calcolaArea(){
        volume = base * altezza * profondita;    
    }

    calcolaArea()
    return volume;
}

console.log(calcolaVolume3(5,6,7));

//ESEMPIO

let numeri = [34,15,22,10,1,3,8];
function calcolaPari(numero){
    if(numero % 2 == 0 ){
        return numero;
    }else{
        return "dispari";
    }
}
// => function(parametro)

let numClick = 0;

function eseguiCalcolo(){
    numClick++;    
    if(numClick <= 10){
        gioco.innerHTML="";
         numeri.forEach(numero =>{
        gioco.innerHTML += "<li>" + calcolaPari(numero) + "</li>";

    });
    }else{
        gioco.innerHTML = "<h2> Basta testa di cazzo </h2>";
        window.alert("allora sei proprio down");
        window.location = "https://www.google.com/search?q=gay" //per indirizzarlo in un sito a scelta
        
    }
}

let gioco = document.getElementById("gioco");

let btn = document.getElementById("btn");

btn.addEventListener("click",eseguiCalcolo);