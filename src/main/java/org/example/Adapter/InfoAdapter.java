package org.example.Adapter;

import org.example.Esercizio1Adapter.DataSource;
import org.example.Esercizio1Adapter.Info;

import java.time.LocalDate;
import java.time.Period;

public class InfoAdapter implements DataSource {
    private Info info;  // L'oggetto Info che vogliamo adattare

    // Costruttore che riceve un oggetto Info
    public InfoAdapter(Info info) {
        this.info = info;
    }

    // Implementiamo i metodi dell'interfaccia DataSource
    @Override
    public String getNomeCompleto() {
        // Uniamo nome e cognome di Info per ottenere il nome completo
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        // Calcoliamo l'età usando LocalDate e Period
        LocalDate oggi = LocalDate.now();
        Period periodo = Period.between(info.getDataDiNascita(), oggi); // Calcola la differenza tra oggi e la data di nascita
        return periodo.getYears(); // Otteniamo gli anni dalla differenza
    }
}

