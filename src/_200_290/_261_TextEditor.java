package _200_290;

import java.util.LinkedList;

/**
 * Simuliert eine einfache Texteditor-App mit Undo-Funktionalität.
 * Es wird eine LinkedList für die Undo-Operationen verwendet.
 */
public class _261_TextEditor {
    private String aktuellerText = ""; // Der aktuelle Text
    private LinkedList<String> undoVerlauf = new LinkedList<>(); // Der Undo-Verlauf

    public static void main(String[] args) {
        _261_TextEditor editor = new _261_TextEditor();
        editor.textHinzufuegen("Hallo"); // Fügt den Text "Hallo" hinzu
        editor.textHinzufuegen(" Welt "); // Fügt den Text " Welt" hinzu
        System.out.println("Aktueller Text: " + editor.aktuellerText); // Gibt den aktuellen Text aus
        editor.undo(); // Führt die letzte Undo-Operation aus
        System.out.println("Nach Undo: " + editor.aktuellerText); // Gibt den aktuellen Text nach dem Undo aus
        editor.textHinzufuegen(" Leute "); // Fügt den Text " Leute" hinzu
        System.out.println("Aktueller Text: " + editor.aktuellerText); // Gibt den aktuellen Text nach dem Hinzufügen
                                                                       // von " Leute" aus
        editor.undo(); // Führt die letzte Undo-Operation aus
        System.out.println("Nach Undo: " + editor.aktuellerText); // Gibt den aktuellen Text nach dem zweiten Undo aus
        editor.historyZeigen(); // Gibt den Undo-Verlauf aus
    }

    /**
     * Fügt den angegebenen Text am Anfang des aktuellen Textes an.
     *
     * @param neuerText Der Text, der hinzugefügt werden soll.
     */
    public void textHinzufuegen(String neuerText) {
        // Fügt den angegebenen Text am Anfang des aktuellen Textes an
        aktuellerText = neuerText + aktuellerText;
        // Fügt die aktuelle Textversion in den Undo-Verlauf ein
        undoVerlauf.addLast(aktuellerText);
    }

    /**
     * Führt die letzte Undo-Operation zurück.
     */
    public void undo() {
        // Prüft, ob der Undo-Verlauf leer ist
        if (!undoVerlauf.isEmpty()) {
            // Entfernt die letzte Textversion aus dem Undo-Verlauf
            aktuellerText = undoVerlauf.removeLast();
        }
    }

    /**
     * Gibt den Inhalt des Undo-Verlaufs aus.
     */
    public void historyZeigen() {
        // Gibt den Undo-Verlauf aus
        System.out.println("Undo-Verlauf:");
        for (String text : undoVerlauf) {
            System.out.println(text);
        }
    }
}