package _200_290._221_Wiederholung;

public class Elternklasse {
    String defaultWert;
//    String defaultWert = null; // gleichbedeutend
    String wert;
    Elternklasse(){ this.wert = "value"; }
    void info(){
        System.out.println("ElterklassenMethode wurde aufgerufen"); }
}
