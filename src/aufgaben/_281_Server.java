package aufgaben;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Erstelle die Methoden der ServerQueue,
 * beachte, dass bereits ein Queue als Attribut vorgegeben ist.
 */
public class _281_Server {

    public static void main(String[] args) {
        _281_Server serverQueue = new _281_Server();
        serverQueue.userHatWasGeclicked("GET");
        serverQueue.userHatWasGeclicked("POST");
        serverQueue.userHatWasGeclicked("DELETE");
        serverQueue.showQueue();
        System.out.println("erledigt: " + serverQueue.aufgabeErledigt());
        serverQueue.showQueue();
        System.out.println("Queue size: " + serverQueue.size());
    }

    private Queue<String> data = new LinkedList<>();

    /**
     * Fügt eine neue Aufgabe in die Queue ein.
     *
     * @param requestType Der Typ der Aufgabe
     */
    public void userHatWasGeclicked(String requestType) {
        // Fügt die neue Aufgabe in die Queue ein
        data.add(requestType);
    }

    /**
     * Markiert eine Aufgabe als erledigt.
     *
     * @return Der Typ der erledigten Aufgabe
     */
    public String aufgabeErledigt() {
        // Prüft, ob die Queue nicht leer ist
        if (!data.isEmpty()) {
            // Entfernt die erste Aufgabe aus der Queue
            String requestType = data.poll();
            // Gibt den Typ der erledigten Aufgabe zurück
            return requestType;
        } else {
            // Gibt einen leeren String zurück
            return "";
        }
    }

    /**
     * Gibt die Aufgaben in der Queue aus.
     */
    public void showQueue() {
        // Prüft, ob die Queue nicht leer ist
        if (!data.isEmpty()) {
            // Gibt alle Aufgaben in der Queue aus
            for (String requestType : data) {
                System.out.println(requestType);
            }
        } else {
            // Gibt eine leere Zeile aus
            System.out.println();
        }
    }

    /**
     * Gibt die Größe der Queue zurück.
     *
     * @return Die Größe der Queue
     */
    public int size() {
        // Gibt die Größe der Queue zurück
        return data.size();
    }
}
