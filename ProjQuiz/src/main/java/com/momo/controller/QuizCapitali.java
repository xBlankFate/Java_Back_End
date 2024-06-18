package com.momo.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuizCapitali {

	  private static ArrayList<Domanda> domande;

	    public static void main(String[] args) {
	        inizializzaDomande();

	        Scanner scanner = new Scanner(System.in);

	        for (Domanda domanda : domande) {
	            presentaNuovaDomanda(domanda);
	            String rispostaUtente = scanner.next().toUpperCase();

	            if (domanda.isRispostaCorretta(rispostaUtente)) {
	                System.out.println("Corretto!\n");
	            } else {
	                System.out.println("Sbagliato. La risposta corretta è: " + domanda.getRispostaCorretta() + "\n");
	            }
	        }

	        System.out.println("Hai completato il quiz!");
	    }

	    private static void inizializzaDomande() {
	        domande = new ArrayList<>();
	        domande.add(new Domanda("Qual è la capitale dell'Italia?", "A. Roma", "B. Madrid", "C. Parigi"));
	        domande.add(new Domanda("Qual è la capitale del Giappone?", "A. Tokyo", "B. Pechino", "C. Seul"));
	        domande.add(new Domanda("Qual è la capitale dell'Australia?", "A. Sydney", "B. Canberra", "C. Melbourne"));

	        // Aggiungi ulteriori domande se necessario
	    }

	    private static void presentaNuovaDomanda(Domanda domanda) {
	        System.out.println(domanda.getTestoDomanda());

	        ArrayList<String> opzioni = new ArrayList<>(domanda.getOpzioni());
	        Collections.shuffle(opzioni);

	        for (String opzione : opzioni) {
	            System.out.println(opzione);
	        }

	        System.out.print("Inserisci la lettera corrispondente alla risposta: ");
	    }
	}

	class Domanda {
	    private String testoDomanda;
	    private ArrayList<String> opzioni;
	    private String rispostaCorretta;

	    public Domanda(String testoDomanda, String opzioneA, String opzioneB, String opzioneC) {
	        this.testoDomanda = testoDomanda;
	        this.opzioni = new ArrayList<>();
	        this.opzioni.add(opzioneA);
	        this.opzioni.add(opzioneB);
	        this.opzioni.add(opzioneC);
	        this.rispostaCorretta = rispostaCorretta.toUpperCase();
	    }

	    public String getTestoDomanda() {
	        return testoDomanda;
	    }

	    public ArrayList<String> getOpzioni() {
	        return opzioni;
	    }

	    public String getRispostaCorretta() {
	        return rispostaCorretta;
	    }

	    public boolean isRispostaCorretta(String rispostaUtente) {
	        return rispostaUtente.toUpperCase().equals(rispostaCorretta);
	    }
	}
