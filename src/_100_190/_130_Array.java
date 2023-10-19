package _100_190;

import java.util.Arrays;

public class _130_Array {
    public static void main(String[] args) {

        // Array
        // Array ist eine begrenzte Liste
        // Arrays müssen eine Länge haben.
        // diese Länge kann nicht verändert werden.
        // Arrays sind 0-Index-basiert

        int[] intArray = new int[3];
        System.out.println(intArray);
        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);
//        System.out.println(intArray[3]); // Index 3 out of bounds for length 3

        String [] stringArray = new String[2];
        System.out.println(stringArray[0]);

        // Array befüllen
        intArray[0] = 48;
        intArray[1] = 488;
        intArray[2] = 848;
        intArray[1] = 848;

        // Array ausgeben
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        System.out.println(Arrays.toString(intArray));

        // andere schreibweisen
        int[] standartschreibweise = new int[8];
        int andereschreibweise[] = new int[8];
        // C- Style Array-Deklaration
        int cStyle[] = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(cStyle));

        // Andere Datentypen und deren Defaultwerte
        char[] ca = new char[7];
        System.out.println(Arrays.toString(ca)); // [ ,  ,  ,  ,  ,  ,  ]

        boolean[] bo = new boolean[7];
        System.out.println(Arrays.toString(bo)); // [false, false, false, false, false, false, false]

        double[] dou = new double[7];
        System.out.println(Arrays.toString(dou)); // [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]


    }
}
