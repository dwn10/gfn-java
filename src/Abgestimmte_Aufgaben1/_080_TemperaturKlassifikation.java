package Abgestimmte_Aufgaben1;

public class _080_TemperaturKlassifikation {
    public static void main(String[] args) {
        // Deklariere eine Integer-Variable 'temperatur' und weise ihr einen Wert zu.
        int temperatur = 25;

        // Deklariere eine String-Variable 'ausgabe' und weise ihr den leeren String ""
        // zu.
        String ausgabe = "";

        // Verwende if-else-if-else Anweisungen, um die 'temperatur' zu klassifizieren:
        // - ausgabe = "Heiß" wenn temperatur > 30
        // - ausgabe = "Warm" wenn temperatur zwischen 21 und 30
        // - ausgabe = "Gemäßigt" wenn temperatur zwischen 11 und 20
        // - ausgabe = "Kalt" wenn temperatur <= 10

        if (temperatur > 30) {
            ausgabe = "Heiß";
        } else if (temperatur >= 21 && temperatur <= 30) {
            ausgabe = "Warm";
        } else if (temperatur >= 11 && temperatur <= 20) {
            ausgabe = "Gemäßigt";
        } else {
            ausgabe = "Kalt";
        }

        // Gib die 'ausgabe' auf der Konsole aus.
        System.out.println("\nDie Temperatur ist " + temperatur + " Grad. Die Klassifikation ist: " + ausgabe);
    }
}
