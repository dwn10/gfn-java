package aufgaben;

public class Kreis_2 {

    public static void main(String[] args) {
        // **Eingabe des Radius**
        System.out.println("Bitte geben Sie den Radius ein:");
        double radius = Double.parseDouble(System.console().readLine());

        // **Berechnung der Kreisfläche**
        double flaeche = Math.PI * radius * radius;

        // **Berechnung des Kreisumfangs**
        double umfang = 2 * Math.PI * radius;

        // **Ausgabe der Ergebnisse**
        System.out.println("Die Kreisfläche beträgt: " + flaeche);
        System.out.println("Der Kreisumfang beträgt: " + umfang);
    }
}