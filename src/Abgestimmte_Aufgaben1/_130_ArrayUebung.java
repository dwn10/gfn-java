package Abgestimmte_Aufgaben1;

public class _130_ArrayUebung {

    public static void main(String[] args) {
        // Deklariere ein Array 'zahlen' mit den Werten 5, 10, 15, 20, 25.
        int[] zahlen = { 5, 10, 15, 20, 25 };

        // Verwende eine for-Schleife, um den Inhalt des Arrays zu verdoppeln.
        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] *= 2;
        }

        // Gib den veränderten Inhalt des Arrays 'zahlen' auf der Konsole aus.
        for (int zahl : zahlen) {
            System.out.println(zahl);
        }
    }
}
