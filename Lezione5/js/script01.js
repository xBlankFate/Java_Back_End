class Utente{
    constructor(name,lastName){
        this.name = name;
        this.lastName = lastName;
    }
}

let elListaUtenti = document.querySelector("#elListaUtenti");
let btnInvia = document.querySelector("#btnInvia");

const URLEndpoint = "https://6668148df53957909ff66d31.mockapi.io/api/utenti";

function salvaUtente(){

    let userName = document.querySelector("#nomeUser").value;
    let lastName = document.querySelector("#cognomeUser").value;

    if(userName == "" || lastName == ""){
        event.preventDefault();
    }else{
        let utente = new Utente(userName,lastName);

        fetch(URLEndpoint, {
            method:"POST",
            headers:{
                "Content-Type" : "application/json"
            },
            body: JSON.stringify(utente)
        }).then(data => {
            return data.json();
        }).then(() => {
            location.reload();
        })
    }
}

btnInvia.addEventListener("click",salvaUtente);

function recuperaDati(){
    fetch(URLEndpoint)
    .then(data => {
        return data.json();
    })
    .then(response =>{
        response.forEach(user => {
           // elListaUtenti.innerHTML += `<li> ${user.name} ${user.lastName} </li>`; 
            elListaUtenti.appendChild(stampaUser(user));
        });
    })
}

function eliminaUserById(id){
    console.log("Sto eliminando " + id);
    let URLDel = URLEndpoint + "/" + id;

    fetch(URLDel, {
        method: "DELETE"
    })
        .then(data => {
            return data.json();
        })
        .then(userEliminato =>{
            console.log("Hai eliminato " + userEliminato);
            location.reload();
        })
        .catch(error => {
            console.log(error);
        })
}

function stampaUser(user){
    let rigaUser = document.createElement("li");
    rigaUser.innerHTML = `${user.name} ${user.lastName}`;
    
    let btnElimina = document.createElement("button");
    btnElimina.innerHTML = " X " ;
    rigaUser.appendChild(btnElimina);

    let btnModifica = document.createElement("button");
    btnModifica.innerHTML = "modifica";
    rigaUser.appendChild(btnModifica);

    btnElimina.addEventListener("click" , function(){
        eliminaUserById(user.id);
    })

    
    btnModifica.addEventListener("click" , function(){
        document.querySelector("#nomeUserMod").value = user.name;
        document.querySelector("#cognomeUserMod").value = user.lastName;
    })

    rigaUser.appendChild(btnElimina);
    
    return rigaUser;

}

let userMod = document.querySelector("#nomeUserMod").value;
let cognomeMod = document.querySelector("#cognomeUserMod").value;
let btnModifica = document.querySelector("#btnModifica").value;


function modificaUser(id){
    console.log("Sto modificando " + id);
    let URLMod = URLEndpoint + "/" + id;

    let utente = new Utente(userMod,cognomeMod);

    fetch(URLMod, {
        method: "PUT",
        headers: {
            "Content-Type" : "application/json"
        },
        body: JSON.stringify(utente)
    })
        .then(data => {
            return data.json();
        })
        .then(userModificato =>{
            console.log("Hai modificato " + userModificato);
            location.reload();
        })
        .catch(error => {
            console.log(error);
        })
        let rigaUser = document.createElement("li");
        rigaUser.innerHTML = `${user.name} ${user.lastName}`;
        
}   

window.addEventListener("DOMContentLoaded",recuperaDati);