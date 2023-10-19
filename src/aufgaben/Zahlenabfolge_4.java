package aufgaben;

public class Zahlenabfolge_4 {

    public static void main(String[] args) {
        // Initialisiere eine Variable für die aktuelle Zahl
        int n = 1;
        int m = 2;

        // Ausgabe der Zahlen
        for (int i = 0; i < 9; i++) {
            // Gebe die aktuellen Zahlen aus
            System.out.println(n + "," + m);

            // Erhöhe die aktuellen Zahlen
            n += 2;
            m += 2;
        }
    }
}
