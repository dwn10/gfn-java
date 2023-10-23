package _200_290;

import java.util.LinkedList;
import java.util.Queue;

public class _280_Queue {
    public static void main(String[] args) {
        // Queue
        // wird häufig in Webservern eingesetzt
        Queue<String> warteschlange = new LinkedList<>();

        // Elemente zur Queue hinzufügen.
        warteschlange.offer("Anfrage1");
        warteschlange.offer("Anfrage2");
        warteschlange.offer("Anfrage3");

        // das vorderste Element anzeigen ohne es zu entfernen
        System.out.println("\nErstes Element (peek): " + warteschlange.peek());

        // den gesamten Queue anzeigen
        System.out.println("\ngesamter Queue: " + warteschlange);

        // Das vorderste Element löschen und anzeigen
        String x = warteschlange.poll();
        System.out.println("\nErstes Element (poll): " + warteschlange.poll());

        // den gesamten Queue anzeigen
        System.out.println("\ngesamter Queue nach dem Poll: " + warteschlange);
    }
}
