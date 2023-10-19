package _100_190;

public class _170_OperatorenRangfolge {
    public static void main(String[] args) {

        // Operatoren Rangfolge

        // Punkt vor Strich
        System.out.println(3 + 4 * 5);  // 23

        // Klammern haben eine höhere Priorität als Punkt und Strich
        System.out.println((3 + 4) * 5);    // 35

        // AND - OR
        // Erst AND dann OR
        System.out.println(true && false || true);  // true
        System.out.println(true && false || false); // false
        System.out.println(false || true && false); // false
        System.out.println(false && false || true); // true

        // String verkettung
        System.out.println("test" + 7 * 8); // test56
        System.out.println("test" + 7 + 8); // test78
        System.out.println("test" + (7 + 8)); // test15
    }
}
