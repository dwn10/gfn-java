package Abgestimmte_Aufgaben1;

public class _100_VerschachtelteSchleifen {

    public static void main(String[] args) {
        // Deklariere und initialisiere ein Integer-Array namens 'zahlen' mit den Werten
        // 2, 4 und 6.
        int[] zahlen = { 2, 4, 6 };

        // Verwende einen enhanced for loop, um über jedes Element von 'zahlen' zu
        // iterieren.
        for (int zahl : zahlen) {

            // Innerhalb des enhanced for loops, deklariere eine Variable namens 'zaehler'
            // und setze sie auf 0.
            int zaehler = 0;

            // Verwende eine while-Schleife, die solange durchläuft, bis 'zaehler' den
            // aktuellen Wert des Array-Elements erreicht.
            while (zaehler < zahl) {

                // In jeder Iteration der while-Schleife erhöhe den Wert von 'zaehler' um 1 und
                // gib den Wert von 'zaehler' auf der Konsole aus.
                System.out.println(zaehler);
                zaehler++;
            }
        }
    }
}
