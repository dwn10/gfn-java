package aufgaben;

public class Urlaubsanspruch {

    public static void main(String[] args) {

        // Eingabe
        int alter;
        int behinderungsgrad;
        int betriebszugehörigkeit;
        System.out.println("Alter: ");
        alter = Integer.parseInt(System.console().readLine());
        System.out.println("Behinderungsgrad: ");
        behinderungsgrad = Integer.parseInt(System.console().readLine());
        System.out.println("Betriebszugehörigkeit: ");
        betriebszugehörigkeit = Integer.parseInt(System.console().readLine());

        // Berechnung
        int grundurlaub = 26;
        if (alter < 18) {
            grundurlaub = 30;
        } else if (alter > 55) {
            grundurlaub = 28;
        }
        int zuschlagBehinderung = behinderungsgrad >= 50 ? 5 : 0;
        int zuschlagBetriebszugehörigkeit = betriebszugehörigkeit > 10 ? 2 : 0;
        int urlaubsanspruch = grundurlaub + zuschlagBehinderung + zuschlagBetriebszugehörigkeit;

        // Ausgabe
        System.out.println("Urlaubsanspruch: " + urlaubsanspruch);

    }

}
