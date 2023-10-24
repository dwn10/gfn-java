package Abgestimmte_Aufgaben1;

public class _230_StatischeMethodenUeberladung {

    // Deklariere eine statische Methode namens 'addieren', die zwei
    // Integer-Parameter nimmt und ihre Summe zurückgibt.

    public static int addieren(int a, int b) {
        return a + b;
    }

    // Deklariere eine zweite, überladene Version der Methode 'addieren', die drei
    // Integer-Parameter nimmt und ihre Summe zurückgibt.

    public static int addieren(int a, int b, int c) {
        return a + b + c;
    }

    // Deklariere eine dritte, überladene Version der Methode 'addieren', die zwei
    // Double-Parameter nimmt und ihre Summe zurückgibt.

    public static double addieren(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        // Rufe alle drei Versionen der Methode 'addieren' auf und speichere die
        // Ergebnisse in geeigneten Variablen.

        int ergebnis1 = addieren(1, 2);
        int ergebnis2 = addieren(1, 2, 3);
        double ergebnis3 = addieren(1.0, 2.0);

        // Gib die Ergebnisse auf der Konsole aus.

        System.out.println("Ergebnis 1: " + ergebnis1);
        System.out.println("Ergebnis 2: " + ergebnis2);
        System.out.println("Ergebnis 3: " + ergebnis3);
    }
}
