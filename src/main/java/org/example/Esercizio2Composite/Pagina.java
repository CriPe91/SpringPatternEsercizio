package org.example.Esercizio2Composite;

public class Pagina implements Elemento {
    private int paragrafi;

    public Pagina(int paragrafi) {
        this.paragrafi = paragrafi;
    }

    @Override
    public int getParagrafi() {
        return paragrafi;
    }

    @Override
    public void stampa() {
        System.out.println("Stampando una pagina." + paragrafi);
    }
}
