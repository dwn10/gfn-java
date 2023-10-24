package aufgaben;

public class BubbleSort_1 {
    public static void main(String[] args) {
        int[] array = { 65, 21, 42, 38, 55 };

        bubbleSort(array);

        System.out.println("\nSortiertes Feld:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    /**
     * Sortiert ein Array in aufsteigender Reihenfolge mithilfe des
     * Bubble-Sort-Algorithmus.
     *
     * @param array Das zu sortierende Array
     */
    private static void bubbleSort(int[] array) {
        // Schleife über alle Elemente des Arrays
        for (int i = 0; i < array.length - 1; i++) {
            // Hilfsvariable für den Tausch von Elementen
            boolean swapped = false;

            // Schleife über alle Elemente des Arrays ab dem aktuellen Element
            for (int j = 0; j < array.length - i - 1; j++) {
                // Wenn das aktuelle Element größer als das nächste Element ist, werden die
                // beiden Elemente getauscht
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // Wenn keine Elemente getauscht wurden, ist das Array bereits sortiert und die
            // Schleife kann abgebrochen werden
            if (!swapped) {
                break;
            }
        }
    }
}
