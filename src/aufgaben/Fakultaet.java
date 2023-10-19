package aufgaben;

public class Fakultaet {

    public static void main(String[] args) {
        // Erstelle ein Array mit den Fakultäten
        int[] fakultaeten = new int[10];

        // Initialisiere die Fakultäten
        for (int i = 0; i < fakultaeten.length; i++) {
            fakultaeten[i] = 1;
        }

        // Berechne die Fakultäten
        for (int i = 2; i < fakultaeten.length; i++) {
            for (int j = 1; j <= i; j++) {
                fakultaeten[i] *= j;
            }
        }

        // Suche die größte Zahl, ohne dass ihre Fakultät über 1.000.000.000 ist
        int i = 0;
        while (i < fakultaeten.length && fakultaeten[i] <= 1_000_000_000) {
            i++;
        }

        // Gib die Ergebnisse aus
        System.out.println("Die größte Zahl, ohne dass ihre Fakultät über 1.000.000.000 ist, ist " + (i - 1) + ".");
        for (int j = 0; j < i; j++) {
            System.out.println(j + "! = " + fakultaeten[j]);
        }
    }
}
