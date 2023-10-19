package aufgaben;

public class Zahlenabfolge_3 {

    public static void main(String[] args) {
        // Initialisiere eine Variable für die aktuelle Zahl
        double n = 2.0;

        // Ausgabe der Zahlen
        for (int i = 0; i < 7; i++) {
            // Gebe die aktuelle Zahl aus
            System.out.println(n);

            // Verringere die aktuelle Zahl um 0.5
            n -= 0.5;
        }
    }
}
