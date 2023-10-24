package Abgestimmte_Aufgaben1;

public class _100_SchleifeStringKonkatenation {
    public static void main(String[] args) {
        // Deklariere eine String-Variable 'result' und weise ihr den leeren String ""
        // zu.
        String result = "";

        // Verwende eine for-Schleife, um die Zahlen von 1 bis 5 als String an 'result'
        // anzuhängen.
        for (int i = 1; i <= 5; i++) {
            // Füge die Zahl als String an 'result' an.
            result += i;
        }

        // Nach der Schleife sollte 'result' den Wert "12345" haben.
        // Gib den Wert von 'result' auf der Konsole aus.
        System.out.println("\nErgebnis: " + result);
    }
}
