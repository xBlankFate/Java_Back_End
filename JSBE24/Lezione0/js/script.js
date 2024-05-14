
//commento lol che cagata

let saluto = "ciao,mondo";

console.log(saluto);

let mioNome = "Denis Crilia";
let eta = 22;
let presenza = true;
var corso = "JavaBackEND";
console.log("ciao " + mioNome + " , eta: " + eta);

let miaVariabile = 42;
console.log(miaVariabile);

miaVariabie = 40;
console.log(miaVariabile);

let numero1 = 5;
let numero2 = 9;

console.log("la somma è " + numero1 + numero2);
// = 59

let valoreNull = null;

console.log(valoreNull);

//array
let colori = ["giallo","rosso","verde","blu"];
console.log(colori);
// aggiunge un elemento
colori.push("arancione");
// sort ordina alfabetico
colori.sort();
// elimina l'ultimo posto
colori.pop;
console.log(colori);
// for
for(let i = 0; i < colori.length; i++){
    console.log(colori[i]);
}
// foreach
colori.forEach(colore => {
    console.log(colore);
})
// forin
console.log("for in");
for (const colore in colori) {
    console.log(colori[colore]);
}