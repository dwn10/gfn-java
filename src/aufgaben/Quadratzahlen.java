package aufgaben;

public class Quadratzahlen {

    public static void main(String[] args) {
        // Initialisiere eine Variable für die aktuelle Zahl
        int n = 1;

        // Initialisiere eine Variable für die Anzahl der gefundenen Quadratzahlen
        int anzahl = 0;

        // Berechne die Quadratzahlen
        while (n * n < 100) {
            // Gebe die aktuelle Quadratzahl aus
            System.out.println(n * n);

            // Erhöhe die Anzahl der gefundenen Quadratzahlen
            anzahl++;

            // Erhöhe die aktuelle Zahl
            n++;
        }

        // Gebe die Anzahl der gefundenen Quadratzahlen aus
        System.out.println("Anzahl der gefundenen Quadratzahlen: " + anzahl);
    }
}
