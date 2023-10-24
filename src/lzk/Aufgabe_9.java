package lzk;

public class Aufgabe_9 {
    public static void main(String[] args) {
        for (int j = 1; j < 5; j++) {
            System.out.println("j = " + j);
            j = j + 2;
        }
    }
}

// Was ist der erwartete Output von folgendem Code?
/*
 * A) j =
 * B) j = 1 ***
 * j = 4
 * C) Compilation error
 * D) j = 1
 * j = 2
 * j = 3
 * j = 4
 */
