package org.example.Esercizio2Composite;


public class Autore {
    private String nome;

    public Autore(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Autore{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
