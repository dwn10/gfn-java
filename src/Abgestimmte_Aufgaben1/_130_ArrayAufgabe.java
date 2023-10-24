package Abgestimmte_Aufgaben1;

public class _130_ArrayAufgabe {

    public static void main(String[] args) {
        // Deklariere und initialisiere ein Integer-Array 'zahlen' mit den Werten 1, 2,
        // 3, 4 und 5.
        int[] zahlen = { 1, 2, 3, 4, 5 };

        // Deklariere eine Integer-Variable 'summe' und initialisiere sie mit 0.
        int summe = 0;

        // Verwende eine for-Schleife, um durch das Array zu iterieren.
        for (int zahl : zahlen) {

            // In jedem Schritt der Schleife:
            // - Addiere das aktuelle Element des Arrays zur Variable 'summe'.
            summe += zahl;
        }

        // Gib die Summe aller Elemente des Arrays auf der Konsole aus.
        System.out.println("\nDie Summe der Elemente des Arrays ist: " + summe);
    }
}
