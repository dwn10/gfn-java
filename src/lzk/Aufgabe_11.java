package lzk;

public class Aufgabe_11 {
    public static void main(String[] args) {
        int x = 7;
        int y = 3;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x = " + x + ", y = " + y);
    }
}

/*
 * A) x = 7, y = 3
 * B) x = 10, y = 3
 * C) x = 3, y = 7 ***
 * D) x = 10, y = 10
 */
