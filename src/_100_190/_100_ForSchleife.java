package _100_190;

public class _100_ForSchleife {
    public static void main(String[] args) {
        // for Schleife
        // Zählerscheife
        // Kopfgesteuert
        // for (Initialisierung (start); Bedingung; Interation (Veränderung))

        for(int i = 0; i < 10; i++){
            System.out.println("i ist jetzt: " + i);
            System.out.println("hello");
        }

        // Endlosschleife
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            i--;
        }
    }
}
