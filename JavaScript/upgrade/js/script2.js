class Studente{
    
    constructor(nome,cognome,corso,matricola){

        this.nome = nome;
        this.cognome = cognome;
        this.corso = corso;
        this.matricola = matricola;

    }
}

let studenti = [];

let btnReg = document.querySelector("#btn");
let lastUser = document.querySelector("#lastUser");
let feed = document.querySelector("#feed");
let btnShowStudenti = document.querySelector("#btnShowStudenti");
let classe = document.querySelector("#classe");

function registra() {
    let nome = document.querySelector("#nome").value;
    let cognome = document.querySelector("#cognome").value;
    let corso = document.querySelector("#corso").value;
    let matricola = document.querySelector("#matricola").value;

    feed.innerHTML = "";

    if(nome =="" || cognome == "" || corso == "" || matricola ==""){

        feed.innerHTML = "<strong> I campi devono essere tutti compilati </strong>";
        
    }else{

        let studente = new Studente(nome,cognome,corso,matricola);
        console.log(studente);
        studenti.push(studente);
        stampaLastUser(studente);

        let allInput = document.querySelectorAll("#formComp input");
        allInput.forEach(input =>{
            input.value = "";
        })
    }
}
/**
 * 
 * @param {Studente} studente 
 */
function stampaLastUser(studente){

    lastUser.innerHTML += `
    
    <p>Nome: ${studente.nome} </p>
    <p>Cognome: ${studente.cognome} </p>
    <p>Corso: ${studente.corso} </p>
    <p>Matricola: ${studente.matricola} </p>

    `
}

btnReg.addEventListener("click", registra);

/**
 * @param {String} studenti
 */
function mostraStudenti(studenti){
    classe.innerHTML = studenti;
}

btnShowStudenti.addEventListener("click", function(){

    let studentiJSON = JSON.stringify(studenti);

    mostraStudenti(studentiJSON);

    localStorage.setItem("studenti",studentiJSON);
});

