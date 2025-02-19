package org.example.Esercizio2Composite;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements Elemento {
    private String nomeSezione;
    private List<Elemento> sottoSezioni = new ArrayList<>();

    public Sezione(String nome) {
        this.nomeSezione = nome;
    }

    public void aggiungiElemento(Elemento elemento) {
        sottoSezioni.add(elemento);
    }

    @Override
    public int getParagrafi() {
        int totalePagine = 0;
        for (Elemento elemento : sottoSezioni) {
            totalePagine += elemento.getParagrafi();
        }
        return totalePagine;
    }

    @Override
    public void stampa() {
        System.out.println("Stampando la sezione: " + nomeSezione);
        for (Elemento elemento : sottoSezioni) {
            elemento.stampa(); // Stampa i sotto elementi (pagine o sottosezioni)
        }
    }
}
