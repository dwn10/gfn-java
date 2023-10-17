package aufgaben;

import java.util.Scanner;

public class Zinseszins {

    public static void main(String[] args) {

        // Eingabe
        double startkapital;
        double zinssatz;
        System.out.println("Startkapital: ");
        System.out.print("€");
        Scanner scanner = new Scanner(System.in);
        startkapital = scanner.nextDouble();
        System.out.println("Zinssatz: ");
        System.out.print("%");
        zinssatz = scanner.nextDouble();

        // Initialisierungen
        double kapitalwert = startkapital;
        int jahre = 0;

        // Schleife
        while (kapitalwert < 2 * startkapital) {

            // Berechnung des Kapitalwerts
            kapitalwert = kapitalwert * (1 + zinssatz / 100);

            // Inkrementierung der Anzahl Jahre
            jahre++;
        }

        // Ausgaben
        System.out.println("Kapitalwert: " + kapitalwert + " €");
        System.out.println("Anzahl Jahre: " + jahre);

    }

}
