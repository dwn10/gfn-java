package aufgaben;

public class Zahlenabfolge_2 {

    public static void main(String[] args) {
        // Initialisiere eine Variable für die aktuelle Zahl
        int n = 2000;

        // Ausgabe der Zahlen
        for (int i = 0; i < 5; i++) {
            // Gebe die aktuelle Zahl aus
            System.out.println(n);

            // Erhöhe die aktuelle Zahl um 1000
            n += 1000;
        }
    }
}
