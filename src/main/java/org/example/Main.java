package org.example;

import org.example.Adapter.InfoAdapter;
import org.example.Esercizio1Adapter.DataSource;
import org.example.Esercizio1Adapter.Info;

import java.time.LocalDate;

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

        System.out.println(info);

        DataSource userData = new InfoAdapter(info);

        System.out.println(userData.getNomeCompleto());
        System.out.println(userData.getEta());
    }
}
