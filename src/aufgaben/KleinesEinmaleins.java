package aufgaben;

import java.util.Arrays;

public class KleinesEinmaleins {

    public static void main(String[] args) {
        // Erstelle ein Array mit den Zahlen von 1 bis 10
        int[] zahlen = Arrays.stream(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }).toArray();

        // Initialisiere zwei Zähler
        int x = 0;
        int y = 0;

        // Gehe durch alle Zahlen von 1 bis 10
        while (x <= 9) {
            // Setze den Y-Zähler auf den aktuellen X-Wert
            y = x;

            // Gehe durch alle Zahlen von 1 bis 10
            while (y <= 9) {
                // Gib die Multiplikation von X und Y aus
                System.out.printf("%02d %02d | %02d%n", x, y, x * y);

                // Erhöhe den Y-Zähler
                y++;
            }

            // Erhöhe den X-Zähler
            x++;
        }
    }
}
