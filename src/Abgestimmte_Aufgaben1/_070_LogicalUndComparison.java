package Abgestimmte_Aufgaben1;

public class _070_LogicalUndComparison {
    public static void main(String[] args) {
        // Deklariere zwei Integer-Variablen 'a' und 'b' und weise ihnen Werte zu.
        int a = 15;
        int b = 2;

        // Deklariere eine Boolean-Variable 'result'.
        boolean result;

        // Verwende logische und Vergleichsoperatoren, um die folgenden Bedingungen zu
        // überprüfen:
        // - Ist 'a' größer als 10 und 'b' kleiner als 5?
        result = a > 10 && b < 5;

        // - Ist 'a' kleiner als 20 oder 'b' größer als 0?
        result = a < 20 || b > 0;

        // Weise die Ergebnisse der Bedingungen der Variable 'result' zu.

        // Gib den Wert von 'result' auf der Konsole aus.
        System.out.println("Ergebnis 1: " + result);
        System.out.println("Ergebnis 2: " + result);
    }
}
