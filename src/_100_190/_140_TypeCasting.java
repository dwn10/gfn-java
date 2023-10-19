package _100_190;

public class _140_TypeCasting {
    public static void main(String[] args) {

        // Type-Casting - Typen Umwandlung
        byte b1 = 100;
        int int1 = 10;

        // Datentyp in größeren Container ist erlaubt
        int castInt1 = b1;
        // Datentyp in kleineren Container ist nicht erlaubt
//        byte castbyte1 = int1; // Inkompatible Typen

        // Explizites Casting
        int int2 = 73;
        byte byte2 = (byte) int2;
        System.out.println(byte2);
        // Bei größeren Werten gibt es einen Überlauf
        int int3 = 130;
        byte byte3 = (byte) int3;
        System.out.println(byte3);


        // int <-> double
        double dou1 = 1234.56789;
        int int4 = (int) dou1;
        System.out.println(int4); // 1234
        double dou2 = int4;
        System.out.println(dou2); // 1234.0

    }
}
