package Abgestimmte_Aufgaben1;

public class _120_DoWhileModuloBreak {

    public static void main(String[] args) {
        // Deklariere und initialisiere eine Integer-Variable 'num' mit dem Wert 1.
        int num = 1;

        // Verwende eine do-while Schleife, die solange durchläuft, bis 'num' größer als
        // 50 ist.
        do {
            // Erhöhe 'num' um 1.
            num++;

            // Überprüfe, ob 'num' durch 7 teilbar ist.
            if (num % 7 == 0) {
                // Wenn ja, setze 'num' auf 51.
                num = 51;
            }
        } while (num <= 50);

        // Gib den Wert von 'num' auf der Konsole aus.
        System.out.println("num = " + num);
    }
}