//notazione letterale

let studente = {
    //prop
    nome: "Denis",
    cognome: "Crilia",
    eta:22,
    presenza: true,
    //metodo
    salutaDocente: function(){
        
        return "Ciao Denis";

    }
} 

console.log(studente.cognome);
console.log(studente.nome);
console.log(studente.eta);
console.log(studente.presenza);
console.log(studente.salutaDocente);

//accedere solo con [string]

console.log(studente["nome"]);
console.log(studente["cognome"]);
console.log(studente["eta"]);
console.log(studente["presenza"]);
console.log(studente["salutaDocente"]);

console.log("stampo con for in")
function stampaInfo(persona){
    //la key rappresenta la prop dell'oggetto
    for (const key in persona) {
        if(typeof persona[key] != "function"){
         console.log(persona[key]);
        }
    }
}

stampaInfo(studente);