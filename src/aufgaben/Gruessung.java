package aufgaben;

import java.util.Random;

public class Gruessung {

    public static void main(String[] args) {
        // Erstelle einen Random-Generator
        Random random = new Random();

        // Generiere eine zufällige Stunde zwischen 0 und 23
        int stunde = random.nextInt(24);

        // Prüfe die Uhrzeit
        if (stunde >= 22 || stunde <= 5) {
            System.out.println("Gute Nacht!");
        } else if (stunde < 11) {
            System.out.println("Guten Morgen!");
        } else if (stunde < 15) {
            System.out.println("Mahlzeit!");
        } else if (stunde < 18) {
            System.out.println("Guten Nachmittag!");
        } else {
            System.out.println("Guten Abend!");
        }
    }
}