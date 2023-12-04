package org.example;

public class AppBuch {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Autor 1");
        Autor autor2 = new Autor("Autor 2");
        Autor autor3 = new Autor("Autor 3");

        Buch buch1 = new Buch("ISBN1", "Titel 1", autor1);
        Buch buch2 = new Buch("ISBN2", "Titel 2", autor2);
        Buch buch3 = new Buch("ISBN3", "Titel 3", autor3);

        System.out.println(buch1);
        System.out.println(buch2);
        System.out.println(buch3);
    }
}
