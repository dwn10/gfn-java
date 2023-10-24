package Abgestimmte_Aufgaben1;

public class _090_TernaryOperator {
    public static void main(String[] args) {
        // siehe _090_TernaryOperator
        // Deklariere eine Integer-Variable 'zahl' und weise ihr einen Wert zu.

        int zahl = 5;

        // Verwende den ternären Operator, um zu überprüfen, ob 'zahl' gerade oder
        // ungerade ist.
        // Speichere das Ergebnis als String in einer Variable namens 'ergebnis'.

        String ergebnis = zahl % 2 == 0 ? "gerade" : "ungerade";

        // Gib das 'ergebnis' auf der Konsole aus.
        System.out.println("\nDie Zahl ist " + ergebnis);
    }
}
