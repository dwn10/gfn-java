package lzk;

public class Aufgabe_13 {

    public static void main(String[] args) {
        int produkt = 1;
        for (int i = 2; i <= 4; i++) {
            produkt *= i;
            // i = 2, produkt = 1*2 = 2
            // i = 3, produkt = 2*3 = 6
            // i = 4, produkt = 6*4 = 24
        }
        System.out.println(produkt);
    }
}

/*
 * A) 6
 * B) 8
 * C) 12
 * D) 24 ***
 */
