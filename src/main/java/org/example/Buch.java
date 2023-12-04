package org.example;

public class Buch {
    private String titel;
    private String isbn;
    private double preis;
    private Autor autor;

    public Buch(String isbn, String titel, Autor autor) {
        this.isbn = isbn;
        this.titel = titel;
        this.autor = autor;
    }

    public String getTitel() {
        return titel;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public Autor getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Buch{" +
                "titel='" + titel + '\'' +
                ", isbn='" + isbn + '\'' +
                ", preis=" + preis +
                ", autor=" + autor +
                '}';
    }
}
