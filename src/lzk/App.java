// Was ist der erwartete Output von folgendes Code?

package lzk;

public class App {
    private int i;

    void disp() {
        while (i <= 5) {
            for (int i = 1; i <= 5;) {
                System.out.print(i + "");
                i++;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        new App().disp();
    }
}

// Printed sechsmal 12345 (Richtig)
// Printed einmal 135
// Printed einmal 12345
// Printed fünfmal 12345
