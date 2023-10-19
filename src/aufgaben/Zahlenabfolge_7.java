package aufgaben;

public class Zahlenabfolge_7 {

    public static void main(String[] args) {
        // Initialisiere eine Variable für die aktuelle Zahl
        int n = 13;

        // Ausgabe der Zahlen
        for (int i = 0; i < 7; i++) {
            // Gebe die aktuelle Zahl aus
            System.out.println(n);

            // Erhöhe die aktuelle Zahl um 4
            n += 4;
        }
    }
}