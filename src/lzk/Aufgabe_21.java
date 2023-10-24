package lzk;

public class Aufgabe_21 {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        int result1 = a++ - --b;
        int result2 = ++a + b--;

        System.out.println(result1 + " " + result2);
    }
}

/*
 * A) 3 9 ***
 * B) 2 10
 * C) 3 10
 * D) 2 9
 */
