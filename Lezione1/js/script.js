let nomeAuto="Enrico Momo";
let eta=31;

//Voglio scrivere il valore di una variabile all'interno della mia pagina html

//recupero l'elemento html con un particolare id
let infoAutore= document.getElementById("infoAutore");

//Scrivo all'interno del tag p appena recuperato,  anzi, vado a modificare la proprieta del suo contenuto testuale
infoAutore.innerHTML=nomeAuto + " eta: "+eta;

let titolo=document.getElementById("titolo");

//Voglio leggere il contenuto del tag p id=titolo
console.log(titolo);
console.log(titolo.innerHTML);

let num1=25.6;
let num2=12.12;

let somma=num1+num2;
let diff=num1-num2;
let molt=num1*num2;
let div=num1/num2;

//recupero tutti gli elementi html byid

let resSomma=document.getElementById("resSomma");
resSomma.innerHTML="La somma vale: " + somma;

let resSottr=document.getElementById("resSottr");
resSottr.innerHTML="La differenza vale: "+ diff;

document.getElementById("resMolt").innerHTML="La moltiplicazione vale "+molt.toPrecision(3);
document.getElementById("resDiv").innerHTML="La divisione vale "+div.toPrecision(3);




