package Abgestimmte_Aufgaben1;

public class _121_KombinierteSchleifen {

    public static void main(String[] args) {
        // Deklariere eine String-Variable 'result' und weise ihr den leeren String ""
        // zu.
        String result = "";

        // Verwende eine for-Schleife, die 3 Mal durchläuft.
        for (int i = 0; i < 3; i++) {

            // Innerhalb der for-Schleife, verwende eine while-Schleife, die solange
            // durchläuft, bis 'zaehler' 5 erreicht.
            for (int zaehler = 0; zaehler < 5; zaehler++) {

                // In jeder Iteration der while-Schleife, füge den Wert von 'zaehler' an
                // 'result' an.
                result += zaehler;
            }
        }

        // Gib den Wert von 'result' auf der Konsole aus.
        System.out.println(result);
    }
}
