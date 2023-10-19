package aufgaben;

public class Zahlenabfolge_6 {

    public static void main(String[] args) {
        // Initialisiere eine Variable für die aktuelle Zahl
        int n = 1;

        // Ausgabe der Zahlen
        for (int i = 0; i < 3; i++) {
            // Erstelle einen String aus der aktuellen Zahl, einem Buchstaben und einer Zahl
            String ausgabe = (char) (n + 'a') + Integer.toString(n) + "b" + Integer.toString(n + 3);

            // Gebe die aktuelle Zahl aus
            System.out.println(ausgabe);

            // Erhöhe die aktuelle Zahl um 4
            n += 4;
        }
    }
}
