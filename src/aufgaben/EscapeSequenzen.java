package aufgaben;

public class EscapeSequenzen {

    public static void main(String[] args) {
        // **Tabulatorzeichen**
        System.out.println("Tabulatorzeichen: \t");

        // **Neue Zeile**
        System.out.println("Neue Zeile: \n");

        // **Anführungszeichen**
        System.out.println("Anführungszeichen: \"");

        // **Backspace**
        System.out.println("Backspace: \b");

        // **Neue Zeile**
        System.out.println("Neue Zeile: \n");

        // **Formfeed**
        System.out.println("Formfeed: \f");

        // **Carriage Return**
        System.out.println("Carriage Return: \r");

        // **Backslash**
        System.out.println("Backslash: \\");

        // **Zeichensatz-Escape-Sequenzen**
        System.out.println("Zeichensatz-Escape-Sequenzen: \\u0041, \\u0020, \\u0061");

        // **Formatierungs-Escape-Sequenzen**
        System.out.println("Formatierungs-Escape-Sequenzen: \\t\\n\\u0041\\u0020\\u0061");

        // **Unicode-Escape-Sequenzen**
        System.out.println("Unicode-Escape-Sequenzen: \\u0041, \\u0020, \\u0061");

        // **Benutzerdefinierte Escape-Sequenzen**
        System.out.println("Benutzerdefinierte Escape-Sequenzen: \\e[1m, \\e[0m");
    }
}
