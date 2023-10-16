package _010_090;

public class _050_ArithmeticOperators {
    public static void main(String[] args) {
        // Rechenoperatoren
        // + - * / %

        System.out.println(3 + 7);
        System.out.println("3" + "7"); // String Konkatenation
        System.out.println("3" + 7); // String Konkatenation
        System.out.println("3" + 7 * 3); // String Konkatenation
        System.out.println("3" + (7 + 3)); // String Konkatenation
        System.out.println(19 - 7);
        System.out.println(21 / 3);
        // Modulo - Restwert
        System.out.println(20 % 3); // Restwertdivision

        System.out.println(10 / 2.0);
        System.out.println(11 / 2); // Integerdivision

        // Inkrement- & Dekrementoperator
        int x = 7;
        x++;
        System.out.println(x); // 8
        x--;
        System.out.println(x); // 7
        System.out.println(--x); // 6
        System.out.println(x++); // 6
        System.out.println(x); // 7
    }
}
