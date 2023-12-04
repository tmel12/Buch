package org.example;

public class Autor {
    private String name;
    private String synonym;
    private double gage;

    public Autor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSynonym() {
        return synonym;
    }

    public void setSynonym(String synonym) {
        this.synonym = synonym;
    }

    public double getGage() {
        return gage;
    }

    public void setGage(double gage) {
        this.gage = gage;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "name='" + name + '\'' +
                ", synonym='" + synonym + '\'' +
                ", gage=" + gage +
                '}';
    }
}
