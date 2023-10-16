package _010_090;

public class _040_EscapingUndUnicode {
    public static void main(String[] args) {

        // Verwendung von Escapesequenzen
        System.out.println("Neue Zeile: Vorher\nNachher"); // Zeilenumbruch
        System.out.println("Tabulator: Vorher\tNachher"); // Tabulatorzeichen
        System.out.println("Backslash: \\"); // Backslah selbst

        // Unicodebeispiele
        System.out.println("Integralzeichen: \u222B"); // ∫
        System.out.println("Alpha: \u03B1"); // α
        System.out.println("Eurozwichen: \u20AC"); // €
        System.out.println("Copyright: \u00A9"); // ©
        System.out.println("Pfeil nach rechts: \u2192"); // →
        System.out.println("Schachbrett-König: \u2654"); // ♔
    }
}
