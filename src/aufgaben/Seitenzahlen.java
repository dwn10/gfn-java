package aufgaben;

import java.util.ArrayList;

public class Seitenzahlen {
    public static void main(String[] args) {
        int seiten = 11; // Hier die Anzahl der Seiten eintragen
        ArrayList<Integer> ziffern = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            ziffern.add(0);
        }
        for (int i = 5; i <= seiten; i++) {
            String seitenString = Integer.toString(i);
            for (int j = 0; j < seitenString.length(); j++) {
                int ziffer = Character.getNumericValue(seitenString.charAt(j));
                ziffern.set(ziffer, ziffern.get(ziffer) + 1);
            }
        }
        System.out.println("Für " + seiten + " Seiten benötigst du folgende Ziffern:");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ": " + ziffern.get(i));
        }
    }
}
