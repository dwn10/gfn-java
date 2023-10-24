package lzk;

public class Aufgabe_10 {

    // Was ist der erwartete Output von folgendem Code?

    public static void main(String[] args) {
        String[] array = { "ee", "ff", "gg", "hh" };

        for (String t : array) {
            if ("ff".equals(t)) {
                continue;
            }
            System.out.println(t);
            if ("gg".equals(t)) {
                break;
            }
        }
    }
}

/*
 * A) gg
 * hh
 * B) ee ***
 * gg
 * C) Compilation error
 * D) gg
 * E) ee
 * ff
 * gg
 */
