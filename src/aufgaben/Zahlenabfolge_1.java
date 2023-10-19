package aufgaben;

public class Zahlenabfolge_1 {

    public static void main(String[] args) {
        // Initialisiere eine Variable für die aktuelle Zahl
        int n = 100;

        // Ausgabe der Zahlen
        for (int i = 0; i < 10; i++) {
            // Gebe die aktuelle Zahl aus
            System.out.println(n);

            // Verringere die aktuelle Zahl
            n -= 10;
        }
    }
}
