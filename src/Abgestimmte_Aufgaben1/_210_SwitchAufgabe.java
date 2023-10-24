package Abgestimmte_Aufgaben1;

public class _210_SwitchAufgabe {

    public static void main(String[] args) {

        // Deklariere eine String-Variable 'wochentag' und weise ihr einen Tag der Woche
        // zu (z.B. "Montag").

        String wochentag = "Freitag";

        // Verwende einen switch-Block, um den Wert von 'wochentag' zu überprüfen.
        // - Für "Montag" gib "Start der Woche" auf der Konsole aus.
        // - Für "Mittwoch" gib "Wochenmitte" aus.
        // - Für "Freitag" gib "Fast Wochenende" aus.
        // - Für alle anderen Tage gib "Regulärer Tag" aus.

        switch (wochentag) {
            case "Montag":
                System.out.println("\nStart der Woche");
                break;
            case "Mittwoch":
                System.out.println("\nWochenmitte");
                break;
            case "Freitag":
                System.out.println("\nFast Wochenende");
                break;
            default:
                System.out.println("\nRegulärer Tag");
        }

        // Optional: Füge einen 'default'-Fall hinzu für ungültige Werte.
    }
}
