class Utente{
    constructor(nome,cognome,email,eta,password,termCond){

        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.eta = eta;
        this.password = password;
        this.termCond = termCond;

    }
}
 

 let formReg = document.querySelector("#formReg");
 let demo = document.querySelector("#demo");

 function validate(event){
   
   let inputsColorati = document.querySelectorAll("input.borderRed");
   inputsColorati.forEach(inputsColorato => {
    inputsColorato.removeAttribute("class");
   })


    demo.innerHTML = "";

    let nome = document.querySelector("#nome").value;
    let cognome = document.querySelector("#cognome").value;
    let email = document.querySelector("#email").value;
    let password = document.querySelector("#password").value;
    let termCond = document.querySelector("#termCond");
    let eta = document.querySelector("#eta").value;

    validateName(nome,event);
    validateCognome(cognome,event);
    validateEta(eta,event);
    validateEmail(email,event);
    validatePass(password,event);

    if(!termCond.checked){
        demo.innerHTML += "<p> Non hai spuntato termini e condizioni </p>";
        event.preventDefault();
    }

 }

 function validateName(nome,event){
    if(nome == "" || nome.length <= 2){

        demo.innerHTML += "<p> Hai dimenticato il nome </p>";
        document.querySelector("#nome").setAttribute("class","borderRed");
        event.preventDefault();
        event.stopImmediatePropagation();

    }else{
        localStorage.setItem("nomeUser",nome);
    }
 }

 formReg.addEventListener("submit",validate);

 function validateCognome(cognome,event){
    if(cognome == "" || cognome.length <= 2){

        demo.innerHTML += "<p> Hai dimenticato il cognome </p>";
        document.querySelector("#cognome").setAttribute("class","borderRed");
        event.preventDefault();
        event.stopImmediatePropagation();

    }else{
        localStorage.setItem("cognomeUser",cognome);
    }
 }

 function validateEta(eta,event){
    if(eta < 18){

        demo.innerHTML += "<p> Non sei abbastanza grande per entrare</p>";
        document.querySelector("#eta").setAttribute("class","borderRed");
        event.preventDefault();
        event.stopImmediatePropagation();

    }else{
        localStorage.setItem("etaUser",eta);
    }
 }

 function validateEmail(email,event){
   
    let regexEmail = /^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$/ ;
    if(!email.match(regexEmail)){
        demo.innerHTML += "<p> La tua mail non è valida";
        document.querySelector("#email").setAttribute("class","borderRed");
        event.preventDefault();
        event.stopImmediatePropagation();
    }else{
        localStorage.setItem("emailUser",email);
    }
}
function validatePass(password,event){
   
    let regexPass = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$/;
    if(!password.match(regexPass)){
        demo.innerHTML += "<p> La tua pass non è valida";
        document.querySelector("#password").setAttribute("class","borderRed");
        event.preventDefault();
        event.stopImmediatePropagation();
    }else{
        localStorage.setItem("passwordUser",password);
    }
}

let elNome = document.querySelector("#nome"); 
let elCognome = document.querySelector("#cognome"); 
let elEta = document.querySelector("#eta"); 
let elEmail = document.querySelector("#email"); 
let elPass = document.querySelector("#password"); 

elNome.addEventListener("blur", function(){
    validateName(this.value , event)
});
elCognome.addEventListener("blur", function(){
    validateCognome(this.value , event)
});
elEta.addEventListener("blur", function(){
    validateEta(this.value , event)
});
elPass.addEventListener("blur", function(){
    validatePass(this.value , event)
});
elEmail.addEventListener("blur", function(){
    validateEmail(this.value , event)
});


