package Abgestimmte_Aufgaben1;

public class _090_TernaryChallenge {
    public static void main(String[] args) {
        // Deklariere eine Variable namens 'wert1' vom Typ double.
        double wert1;

        // Weise dieser Variable das Ergebnis des folgenden ternären Operators zu:
        // Ist 67.89 größer oder gleich 54.32? Wenn ja, weise den Wert 234.567 zu, sonst
        // den Wert 345.678.
        wert1 = 67.89 >= 54.32 ? 234.567 : 345.678;

        // Deklariere eine zweite Variable namens 'ergebnis'.
        double ergebnis;

        // Addiere zur 'wert1' den Wert 789.01 und weise das Ergebnis 'ergebnis' zu.
        ergebnis = wert1 + 789.01;

        // Gib den Wert von 'ergebnis' auf der Konsole aus.
        System.out.println("\nErgebnis: " + ergebnis);
    }
}
