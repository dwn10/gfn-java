package _010_090;

public class _070_LogicalOperators {
    public static void main(String[] args) {
        // Logische Operatoren
        // Boolische Operatoren
        // && || ^ !

        // && - UND (sowohl als auch)
        System.out.println(3 >= 2 && 7 != 9);

        // Nur true wenn beide true sind
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false

        // || und/oder
        // immer true wenn eins true ist
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false

        // ^ XOR entweder oder
        // nur einer der beiden darf true sein
        System.out.println(true ^ true); // false
        System.out.println(true ^ false); // true
        System.out.println(false ^ true); // true
        System.out.println(false ^ false); // false

        // (! nicht)
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(!(1 == 1)); // false
    }
}
