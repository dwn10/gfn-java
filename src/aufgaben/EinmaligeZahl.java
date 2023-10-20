package aufgaben;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class EinmaligeZahl {

    public static void main(String[] args) {
        // Erstelle eine ArrayList mit neun Zahlen
        ArrayList<Integer> zahlen = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            zahlen.add(i);
        }

        // Füge die Zahlen viermal zur ArrayList hinzu
        for (int i = 0; i < 4; i++) {
            zahlen.add(zahlen.get(i));
        }

        // Mische die ArrayList
        Collections.shuffle(zahlen);

        // Erstelle ein Hash-Set für die doppelt vorkommenden Zahlen
        HashSet<Integer> doppeltVorkommendeZahlen = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            doppeltVorkommendeZahlen.add(zahlen.get(i));
        }

        // Finde die Zahl, die nur einmal vorkommt
        int einmaligeZahl = zahlen.get(0);
        while (doppeltVorkommendeZahlen.contains(einmaligeZahl)) {
            einmaligeZahl = zahlen.get(zahlen.indexOf(einmaligeZahl) + 1);
        }

        // Gib die Zahl aus
        System.out.println("Die einmalige Zahl ist: " + einmaligeZahl);
    }
}