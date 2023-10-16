package _010_090;

public class _020_PrimitivDatatypes {
    public static void main(String[] args) {
        // Das ist ein einzeiliger Kommentar
        /*
         * Das
         * ist ein
         * mehrzeiliger Kommentar
         */

        // Primitive Datentypen
        // Ganzzahlen

        // Byte 8 Bit (-128 bis 127)
        byte byte1 = 127;
        System.out.println(byte1);

        // Short 16 Bit (-32763 bis 32767)
        short short1 = 1654;
        System.out.println(short1);
        System.out.println(Math.pow(2, 16));

        // Integer 32 Bit (-2.147.483.646 bis 2.147.483.645)
        int int1 = 2_147_483_647;
        System.out.println(int1);
        System.out.println(Math.pow(2, 32));

        // Long 64 Bit
        long long1 = 5_000_000_000l;
        System.out.println(long1);
        System.out.println(Math.pow(2, 64));

        // Fließkommazahlen
        // Float 32 Bit
        float bratwurst = 1234.567f;
        System.out.println(bratwurst);
        System.out.println(Math.pow(2, 32));

        // Double 64 Bit
        double double1 = 123456789.123456789;
        System.out.println(double1);
        System.out.println(Math.pow(2, 64));

        // Boolean 8 Bit
        boolean boo1 = true;
        boolean boo2 = false;
        System.out.println(boo1);
        System.out.println(boo2);

        // Char
        // Charakter ist Grundsätzlich ein Zeichen.
        // Repräsentiert aber Zeichen der ASCII Tabelle
        // und kann deswegen auch als Zahl initialisiert werden
        char char1 = 'A';
        System.out.println(char1);
        char char2 = 66;
        System.out.println(char2);
        // Unicode
        char char3 = '\u0024';
        System.out.println(char3);

        // Unterstrich
        // Muss sinnvoll genutzt werden
        System.out.println(1_000_000_000);
        System.out.println(0.123_456_789);
        System.out.println(1___________0);

        // So gehts nicht!
        // System.out.println(_10); // Symbol nicht gefunden
        // System.out.println(10_); // Unzulässiger Unterstrich
    }
}
