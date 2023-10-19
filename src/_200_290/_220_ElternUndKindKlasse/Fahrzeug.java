package _200_290._220_ElternUndKindKlasse;

public class Fahrzeug {

    // Elternklasse - Basisklasse - Superklasse

    // Attribute
    private String hersteller;
    private String farbe;

    // Konstruktoren
    Fahrzeug(){
        this.hersteller = "Volvo";
        this.farbe = "schwarz";
    }

    Fahrzeug(String farb){
        this();
        this.farbe=farb;
    }

    public String getHersteller() {
        return this.hersteller;
    }

    public void setHersteller(String bratwurst){
        this.hersteller = bratwurst;
    }

    public String getFarbe() {
        return this.farbe;
    }

    @Override
    public String toString(){
        return "Fahrzeug {hersteller: "
                + this.hersteller
                + " farbe: "
                + this.farbe
                + "}";
    }

    public void starten(){
        System.out.println("Fahrzeug startet");
    }




}
