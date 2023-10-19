package aufgaben;

public class Kreis_1 {

    public static void main(String[] args) {
        // **Definition der Konstante PI**
        final double PI = 3.14159265358979323846;

        // **Eingabe des Radius**
        System.out.println("Bitte geben Sie den Radius ein:");
        double radius = Double.parseDouble(System.console().readLine());

        // **Berechnung der Kreisfläche**
        double flaeche = PI * radius * radius;

        // **Berechnung des Kreisumfangs**
        double umfang = 2 * PI * radius;

        // **Ausgabe der Ergebnisse**
        System.out.println("Die Kreisfläche beträgt: " + flaeche);
        System.out.println("Der Kreisumfang beträgt: " + umfang);
    }
}
