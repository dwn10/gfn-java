package lzk;

public class Aufgabe_8 {
    public static void main(String[] args) {
        String[] liste = { "xx", "yy", "zz", "ww" };

        for (String elem : liste) {
            int j = 0;
            while (j < liste.length - 1) {
                System.out.println(elem + " : " + j);
                j++;
            }
        }
    }
}
// Wie oft wird 2 als Teil der Ausgabe ausgegeben werden?
/*
 * A) 1 mal
 * B) 0 mal
 * C) 2 mal ***
 * D) 4 mal
 */