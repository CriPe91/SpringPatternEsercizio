package org.example.Esercizio1Adapter;

public class UserData implements DataSource {

    public void getData(DataSource ds) {
        String nomeCompleto = ds.getNomeCompleto();
        int eta = ds.getEta();
    }

    @Override
    public String getNomeCompleto() {
        return "";
    }

    @Override
    public int getEta() {
        return 0;
    }
}