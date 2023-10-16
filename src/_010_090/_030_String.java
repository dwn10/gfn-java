package _010_090;

public class _030_String {
    public static void main(String[] args) {
        // String - Zeichenkette
        // Objekt einer Klasse
        // Kein Primitiver Datentyp
        // Referenz-Typ
        // Doppelten Anführungszeichen

        String text = "Hello World!";
        System.out.println(text); // Hello World!
        // So gehts auch
        String text2 = new String("So gehts auch!");
        System.out.println(text2);

        // String Verkettung - Konkatenation
        System.out.println(text + "Peter");
        String name = "Barbara";
        System.out.println(text + name);

        System.out.println(42 + 42 + text + 21 + 21);
        System.out.println(text + 21 + 21);
        System.out.println("String " + 21 + 21);

    }
}
