package org.example.Esercizio2Composite;


import java.util.ArrayList;
import java.util.List;

public class Libro implements Elemento {
    private String titolo;
    private List<Sezione> sezioni = new ArrayList<>();
    private List<Autore> autori = new ArrayList<>();
    private double prezzo;

    public Libro(String titolo, double prezzo) {
        this.titolo = titolo;
        this.prezzo = prezzo;
    }

    public void aggiungiSezione(Sezione sezione) {
        sezioni.add(sezione);
    }

    public void aggiungiAutore(Autore autore) {
        autori.add(autore);
    }

    public List<Autore> getAutori() {
        return autori;
    }

    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public int getParagrafi() {
        int totalePagine = 0;
        for (Sezione sezione : sezioni) {
            totalePagine += sezione.getParagrafi();
        }
        return totalePagine;
    }

    @Override
    public void stampa() {
        System.out.println("Stampando l'intero libro: " + titolo);
        for (Sezione sezione : sezioni) {
            sezione.stampa(); // Stampa le sezioni
        }
    }
}
