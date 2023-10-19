package aufgaben;

public class Zahlenabfolge_9 {

    public static void main(String[] args) {
        // Initialisiere eine Variable für die Summe
        int summe = 0;

        // Summeiere alle Zahlen von 1 bis 20
        for (int i = 1; i <= 20; i++) {
            // Addiere die aktuelle Zahl zur Summe
            summe += i;
        }

        // Gebe die Summe aus
        System.out.println("Die Summe aller Zahlen von 1 bis 20 ist: " + summe);
    }
}