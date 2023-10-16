package _010_090;

public class _080_IfElse {
    public static void main(String[] args) {
        // if else
        // Kontrollstruktur

        int x = 7;

        // if
        if (x == 7) {
            System.out.println("In x ist eine Sieben");
        }

        // if else
        if (x != 7) {
            System.out.println("In x ist keine Sieben");
        } else {
            System.out.println("In x ist eine Sieben");
        }

        // if else if

        if (x != 7) {
            System.out.println("In x ist keine Sieben");
        } else if (x == 7) {
            System.out.println("In x ist eine Sieben");
        }

        // if, else-if, else
        x = 11;

        if (x == 7) {
            System.out.println("In x ist keine Sieben");
        } else if (x == 8) {
            System.out.println("In x ist eine Acht");
        } else if (x == 17) {
            System.out.println("In x ist eine Siebzehn");
        } else {
            System.out.println("x ist keine 7 und keine 8 und keine Siebzehn");
        }

        // Verschachteln
        // else gehört zu dem if das am nächsten drann ist
        if (x != 7) {
            System.out.println("x ist nicht 7");
            if (x == 8) {
                System.out.println("x ist 8");
                if (x != 11) {
                    System.out.println("x keine 11");
                } else {
                    System.out.println("innerstes else");
                }
            } else {
                System.out.println("mittleres else");
            }
        }
    }
}
