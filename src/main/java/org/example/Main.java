package org.example;

import org.example.Esercizio1Adapter.Adapter.InfoAdapter;
import org.example.Esercizio1Adapter.DataSource;
import org.example.Esercizio1Adapter.Info;
import org.example.Esercizio2Composite.Autore;
import org.example.Esercizio2Composite.Libro;
import org.example.Esercizio2Composite.Pagina;
import org.example.Esercizio2Composite.Sezione;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) {

    Info info = new Info();
    info.setNome("Aldo");
    info.setCognome("Baglio");
    info.setDataDiNascita(LocalDate.of(1960,5,18));

        //System.out.println(info);

        DataSource userData = new InfoAdapter(info);

        //System.out.println(userData.getNomeCompleto());
        //System.out.println(userData.getEta());

        List<Autore> listaAutori = new ArrayList<>();
        Autore autore1 = new Autore("Pippo");
        Autore autore2 = new Autore("Pluto");

        listaAutori.add(autore1);
        listaAutori.add(autore2);

        Pagina pagine1 = new Pagina(30);
        Pagina pagine2 = new Pagina(40);


        Sezione sezione1 = new Sezione("Capitolo 1");
        Sezione sezione2 = new Sezione("capitolo 2");

        Libro libro = new Libro("Il signore degli agnelli",23.80);
        libro.aggiungiSezione(sezione1);
        libro.aggiungiSezione(sezione2);
        libro.aggiungiAutore(autore1);
        libro.aggiungiAutore(autore2);

        sezione1.aggiungiElemento(pagine1);
        sezione2.aggiungiElemento(pagine2);

        //System.out.println("Stampa intero libro");
       // libro.stampa();
       // sezione1.stampa();
        // pagine1.stampa();
        // System.out.println(listaAutori);









    }
}
