package lzk;

public class Aufgabe_17 {

    public static void main(String[] args) {
        String s1 = "Hallo";
        String s2 = "Welt";
        String s3 = s1 + " " + s2 + "!";
        String s4 = s3.substring(6);
        System.out.println(s4);
    }
}

/*
 * A) Hallo Welt!
 * B) Welt! ***
 * C) Hallo
 * D) Hallo
 */
