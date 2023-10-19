package aufgaben;

public class BubbleSort {

    public static int[] bubbleSort(int[] array) {
        // Initialisiere einen Zähler, der die Anzahl der Durchläufe des
        // Bubblesort-Algorithmus zählt.
        int durchlaeufe = 0;

        // Solange bei einem Durchlauf noch Zahlen getauscht werden müssen, fahre fort.
        while (true) {
            // Setze einen Flag, der angibt, ob bei einem Durchlauf Zahlen getauscht wurden.
            boolean getauscht = false;

            // Iteriere über das Array und vergleiche jede Zahl mit der jeweils
            // nachfolgenden Zahl.
            for (int i = 0; i < array.length - 1; i++) {
                // Wenn die nachfolgende Zahl kleiner ist, tausche die Zahlen.
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    // Setze den Flag, da bei diesem Durchlauf eine Zahl getauscht wurde.
                    getauscht = true;
                }
            }

            // Wenn bei einem Durchlauf keine Zahlen getauscht wurden, ist das Array
            // sortiert.
            if (!getauscht) {
                break;
            }

            // Erhöhe den Zähler, um die Anzahl der Durchläufe zu zählen.
            durchlaeufe++;
        }

        // Gib das sortierte Array zurück.
        return array;
    }

    public static void main(String[] args) {
        // Erstelle ein Array mit unsortierten Zahlen.
        int[] array = { 5, 3, 1, 9, 2, 4, 7, 8, 6 };

        // Rufe die Bubblesort-Methode auf und speichere das sortierte Array in einer
        // Variablen.
        int[] sortedArray = bubbleSort(array);

        // Gib das sortierte Array aus.
        System.out.println("Sortiertes Array:");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }
}
