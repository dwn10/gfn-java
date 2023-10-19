package _100_190;

public class _150_Wrapper {
    public static void main(String[] args) {

        // Wrapper-Klassen
        // Wrappen (umwickeln) die primitiven Datentypen
        // es entstehen dabei Objekte
        // Objekte brauchen mehr Speicherplatz als die primitiven Datentypen

        /*
        byte - Byte
        short - Short
        int - Integer
        long - Long
        float - Float
        double - Double
        boolean - Boolean
        char - Character
         */

        Integer int1 = 777;
        Double dou1 = 123.456789;

        System.out.println(int1);
        System.out.println(int1+int1); // verhält sich wie ein Primitver typ

        String str1 = int1.toString();
        int intPrimitive = 0;
//        String str2 = intPrimitive.toString();
        String str3 = String.valueOf(intPrimitive);

        int[] intDefault = new int[1];
        System.out.println(intDefault[0]);
        Integer[] integerDefault = new Integer[1];
        System.out.println(integerDefault[0]);


    }
}
