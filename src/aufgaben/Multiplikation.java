package aufgaben;

import java.util.ArrayList;

public class Multiplikation {

    public static void main(String[] args) {
        // Das Produkt 8.420.000 besteht aus den Faktoren 8420 und 1000.
        // Der Multiplikator kann also zwischen 1 und 8420 liegen,
        // der Multiplikand kann also zwischen 1 und 1000 liegen.

        // Erstelle eine ArrayList, um alle möglichen Kombinationen zu speichern.
        ArrayList<Pair<Integer, Integer>> combinations = new ArrayList<>();

        // Iteriere über alle möglichen Werte für den Multiplikator.
        for (int i = 1; i <= 8420; i++) {
            // Iteriere über alle möglichen Werte für den Multiplikand.
            for (int j = 1; j <= 1000; j++) {
                // Füge die Kombination zur ArrayList hinzu.
                combinations.add(new Pair<>(i, j));
            }
        }

        // Gib die Anzahl der Kombinationen aus.
        System.out.println("Es gibt " + combinations.size() + " Kombinationen.");
    }

    // Eine Klasse, die ein Paar aus zwei Integer-Werten darstellt.
    static class Pair<X, Y> {
        X x;
        Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
