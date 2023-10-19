package _100_190;

import java.util.Arrays;

public class _180_StringMethoden {
    public static void main(String[] args) {

        // Stringmethoden

        String text = "ABCDEFG";

        // length()
        System.out.println(text.length()); // 7

        // toLowerCase() - toUpperCase()
        String s1 = "Hello World!";
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());

        // concat()
        String vorname = "Peter";
        String nachname = "Maffey";
        System.out.println(vorname.concat(nachname));

        // trim()
        // Entfernt sämtliche Whitespaces
        // Whitespaces: leerzeichen, Tabulatoren (\t), Zeilenumbrüche (\n)
        System.out.println("---" + "   Hello   ".trim() + "----");  // ---Hello----
        System.out.println("---" + "   \t\tHello   ".trim() + "----");  // ---Hello----
        System.out.println("---" + "   \n\n\t\tHello   ".trim() + "----");  // ---Hello----

        // indexOf(string | char)
        vorname = "Claudia";
        System.out.println(vorname.indexOf("udia"));    // 3
        System.out.println(vorname.indexOf('a'));       // 2

        // substring(index)
        // der erste Index is inclusive, der zweite ist exclusive
        text = "0123456789";
        System.out.println(text.substring(1));  // 123456789
        System.out.println(text.substring(2, 7));       // 23456

        // charAt(index)
        String satz = "heute ist Dienstag";
        char zeichen = satz.charAt(10);
        System.out.println(zeichen);

        // split(string)
        // Wandelt einen String in einen String-Array um.
        satz = "heute ist Dienstag";
        String[] satzArr = satz.split("e");
        System.out.println(Arrays.toString(satzArr));
    }
}
