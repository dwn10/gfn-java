package aufgaben;

import java.util.ArrayList;
import java.util.Collections;

public class Karten_mischen {
    public static void main(String[] args) {
        ArrayList<String[]> karten = new ArrayList<String[]>();
        String[] farben = { "Kreuz", "Pik", "Herz", "Karo" };
        String[] werte = { "Ass", "König", "Dame", "Bube", "Zehn", "Neun", "Acht", "Sieben" };

        for (String farbe : farben) {
            for (String wert : werte) {
                karten.add(new String[] { farbe, wert });
            }
        }

        System.out.println("Ungemischt:");
        for (String[] karte : karten) {
            System.out.print("[" + karte[0] + ", " + karte[1] + "] ");
        }
        System.out.println();

        Collections.shuffle(karten);

        System.out.println("Gemischt:");
        for (String[] karte : karten) {
            System.out.print("[" + karte[0] + ", " + karte[1] + "] ");
        }
        System.out.println();
    }
}
