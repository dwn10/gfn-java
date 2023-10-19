package _200_290._220_ElternUndKindKlasse;

public class PKW extends Fahrzeug{

    // Konstruktoren werden nicht vererbt
    // Sobald wir einen Konstruktor haben. Schreibt der Compiler nicht mehr den Default-Konstruktor für dich.
    // Default Konstruktor = Konstruktor ohne Parameter
   PKW(){
      super();
   }

   // Das Keyword super verweist auf den Konstruktor der Elternklasse
   PKW(String farbe){
      super(farbe);
   }

   @Override
   public void starten(){
      System.out.println("PKW startet");
   }
}
