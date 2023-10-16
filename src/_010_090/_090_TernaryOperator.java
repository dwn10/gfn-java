package _010_090;

public class _090_TernaryOperator {
    public static void main(String[] args) {
        int zahl1 = 5, zahl2 = 10;

        // Verwendung des ternären Operators, um die größere Zahl zu ermitteln
        // Der Ausdruck vor dem '?' wird ausgewertet. Wenn er wahr ist, wird der Wert
        // vor dem ':' zurückgegeben,
        // ansonsten der Wert nach dem ':'.

        int groessereZahl = (zahl1 > zahl2) ? zahl1 : zahl2;
        System.out.println(groessereZahl);

        String ausgabe = (zahl1 > zahl2)
                ? "zahl1 ist groeßer"
                : "zahl2 ist groeßer";
        System.out.println(ausgabe);
    }
}
