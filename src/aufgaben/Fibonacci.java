package aufgaben;

public class Fibonacci {

    public static void main(String[] args) {
        // Hardcodiere die ersten beiden Zahlen
        int n1 = 0;
        int n2 = 1;

        // Initialisiere eine Variable für die aktuelle Zahl
        int n = 0;

        // Gib die ersten beiden Zahlen aus
        System.out.println(n1);
        System.out.println(n2);

        // Berechne die restlichen Zahlen der Folge
        for (int i = 0; n < 500; i++) {
            // Addiere die beiden vorherigen Zahlen
            n = n1 + n2;

            // Gebe die aktuelle Zahl aus, wenn sie unter 500 ist
            if (n < 500) {
                System.out.println(n);
            }

            // Setze die aktuellen Zahlen auf die nächsten beiden Zahlen
            n1 = n2;
            n2 = n;
        }
    }
}
