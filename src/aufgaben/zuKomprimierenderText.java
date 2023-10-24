package aufgaben;

public class zuKomprimierenderText {
    public static void main(String[] args) {
        // Deklariere ein String-Array 'unkomprimiert' und weise ihm den Wert
        // "Z Z Z Z 7 7 7 7 7 7 7 7 7 7 M P P P P P H H" zu.
        String[] unkomprimiert = { "Z", "Z", "Z", "Z", "7", "7", "7", "7", "7", "7", "7", "7", "7", "M", "P", "P", "P",
                "P", "H", "H" };

        // Deklariere ein String-Array 'komprimiert'.
        String[] komprimiert = new String[unkomprimiert.length];

        // Komprimiere die Bilddaten.
        komprimiere(unkomprimiert, komprimiert);

        // Gib die komprimierten Daten auf der Konsole aus.
        for (String zeichen : komprimiert) {
            System.out.print(zeichen);
        }
    }

    private static void komprimiere(String[] unkomprimiert, String[] komprimiert) {
        // Initialisiere den Index für das komprimierte Array.
        int indexKomprimiert = 0;

        // Gehe über alle Zeichen im unkomprimierten Array.
        for (int i = 0; i < unkomprimiert.length; i++) {
            // Wenn das aktuelle Zeichen mit dem vorherigen Zeichen übereinstimmt,
            // erhöhe die Zählervariable.
            if (i == 0 || unkomprimiert[i].equals(unkomprimiert[i - 1])) {
                int zaehler = 1;
                while (i + 1 < unkomprimiert.length && unkomprimiert[i].equals(unkomprimiert[i + 1])) {
                    zaehler++;
                    i++;
                }

                // Wenn die Zählervariable größer als 4 ist, speichere die Lauflänge
                // und das Zeichen im komprimierten Array.
                if (zaehler > 4) {
                    komprimiert[indexKomprimiert++] = "%" + zaehler + unkomprimiert[i];
                } else {
                    // Andernfalls speichere das Zeichen einfach im komprimierten Array.
                    komprimiert[indexKomprimiert++] = unkomprimiert[i];
                }
            } else {
                // Wenn das aktuelle Zeichen nicht mit dem vorherigen Zeichen übereinstimmt,
                // speichere das Zeichen im komprimierten Array.
                komprimiert[indexKomprimiert++] = unkomprimiert[i];
            }
        }
    }
}
