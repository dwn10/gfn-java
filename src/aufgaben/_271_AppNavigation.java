package aufgaben;

import java.util.Stack;

/**
 * Erstelle die Methoden der App. Beachte das bereits ein Stack als Attribut
 * vorgegeben ist
 */
public class _271_AppNavigation {
    public static void main(String[] args) {
        _271_AppNavigation app = new _271_AppNavigation();
        app.seiteOeffnen(new Seite("Startseite", "Willkommen in unserer App!"));
        app.seiteOeffnen(new Seite("Menü", "1. Option A\n2. Option B\n3. Option C"));
        app.seiteOeffnen(new Seite("Detailseite", "Details zu Option B"));

        app.aktuelleSeiteAnzeigen();
        app.zurueckGehen();
        app.aktuelleSeiteAnzeigen();
        app.zurueckGehen();
        app.aktuelleSeiteAnzeigen();
    }

    private Stack<Seite> seitenHistorie = new Stack<>();

    /**
     * Öffnet eine neue Seite und speichert sie in der Historie.
     *
     * @param aktuelleSeite Die neue Seite
     */
    public void seiteOeffnen(Seite aktuelleSeite) {
        // Fügt die aktuelle Seite in die Historie ein
        seitenHistorie.push(aktuelleSeite);
    }

    /**
     * Navigiert zur vorherigen Seite in der Historie.
     */
    public void zurueckGehen() {
        // Prüft, ob die Historie nicht leer ist
        if (!seitenHistorie.isEmpty()) {
            // Entfernt die oberste Seite aus der Historie
            seitenHistorie.pop();
        }
    }

    /**
     * Gibt die aktuelle Seite aus.
     */
    public void aktuelleSeiteAnzeigen() {
        // Prüft, ob die Historie nicht leer ist
        if (!seitenHistorie.isEmpty()) {
            // Gibt die oberste Seite aus der Historie aus
            System.out.println(seitenHistorie.peek());
        } else {
            // Gibt eine leere Zeile aus
            System.out.println();
        }
    }

    private static class Seite {
        private String seitenName;
        private String inhalt;

        public Seite(String seitenName, String inhalt) {
            this.seitenName = seitenName;
            this.inhalt = inhalt;
        }

        @Override
        public String toString() {
            return "\"" + seitenName + "\" - " + inhalt;
        }
    }
}