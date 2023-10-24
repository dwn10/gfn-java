package Abgestimmte_Aufgaben1;

public class _110_VariableManipulationWhile {

    public static void main(String[] args) {
        // Deklariere zwei Integer-Variablen: 'x' mit dem Wert 10 und 'y' mit dem Wert
        // 20.
        int x = 10;
        int y = 20;

        // Verwende eine while-Schleife, um 'x' zu erhöhen und 'y' zu verringern,
        // solange 'x' kleiner als 'y' ist.
        do {
            // Erhöhe 'x' um 1.
            x++;

            // Verringere 'y' um 1.
            y--;
        } while (x < y);

        // Gib die Werte von 'x' und 'y' nach der Schleife auf der Konsole aus.
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}