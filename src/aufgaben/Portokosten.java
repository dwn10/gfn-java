package aufgaben;

import java.util.Random;

public class Portokosten {

    public static void main(String[] args) {
        // Erstelle eine Zufallszahl für den Bestellwert.
        Random random = new Random();
        int bestellwert = random.nextInt(130) + 1;

        // Ermittele die Portokosten.
        double portokosten = 0;
        if (bestellwert <= 39.99) {
            portokosten = 3.99;
        } else if (bestellwert <= 69.99) {
            portokosten = 2.99;
        } else if (bestellwert <= 99.99) {
            portokosten = 1.99;
        }

        // Berechne den Gesamtbetrag.
        double gesamtbetrag = bestellwert + portokosten;

        // Gib die Ergebnisse aus.
        System.out.println("Bei einem Bestellwert von " + bestellwert + " € betragen die Portokosten " + portokosten
                + " €. Der Gesamtbetrag beträgt somit " + gesamtbetrag + " €.");
    }
}