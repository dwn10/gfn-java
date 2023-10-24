package lzk;

public class Aufgabe_6 {

    // verändere die Werte von a, b und c für die Aufgabe

    public static void main(String[] args) {

        int a = 42, b = 42, c = 42;
        int j = 0, k = 0;
        for (int i = 0; i < a; i++) {
            do {
                k = 0;
                while (k < c) {
                    k++;
                    System.out.print(k + " ");
                }
                System.out.println();
                j++;
            } while (j < b);
            System.out.println("#######");
        }
    }
}

// Welche Werte für a, b und c werden die folgende Ausgabe erzeugen?

// 1 2 3 4
// 1 2 3 4
// 1 2 3 4
// #######
// 1 2 3 4
// #######

// 1) a = 2, b = 3, c = 4
// 2) a = 3, b = 2, c = 3
// 3) a = 4, b = 3, c = 2 ***
// 4) a = 2, b = 3, c = 3
// 5) a = 4, b = 2, c = 3
