class Auto {
    constructor(marca, modello, cilindrata, marcia) {
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
        this.marcia = marcia;

        this.info = function () {
            return "Automobile: " + this.marca + " " + this.modello + " " + this.cilindrata;
        };
    }
}

let auto1 = new Auto("Volvo","XC90", 2000,6);
let auto2 = new Auto("Lancia","Delta",1600,5);
let auto3 = new Auto("BMW","M3",2000,6);

console.log(auto1.info());
console.log(auto3.info());

class Moto{
    constructor(marca,modello,cilindrata,velocita){
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
        this.velocita = velocita;
    }
    static tipologia = "MOTOCICLETTA";
    accendi(){
        return "VROOOOM";
    }
    getMarca(){
        return this.marca;
    }
    static calcolaDiff(m1,m2){
        let differenza = m1.velocita - m2.velocita;
        return differenza;
    }
}

let miaMoto = new Moto("Kawasaki","z750",750,300);
console.log(miaMoto.accendi());
console.log(miaMoto.marca + " " + miaMoto.modello);
console.log(Moto.tipologia);

let tuaMoto = new Moto("Piaggio","Ciao",49,35);

console.log(Moto.calcolaDiff(miaMoto,tuaMoto));

