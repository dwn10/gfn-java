package _200_290;

public class _251_Demo {

    // Prüfe Datum

    static boolean pruefeJahr(){
        // Jahr wird geprüft
        return true;
    }
    static boolean pruefeMonat(){
        // Monat wird geprüft
        return true;
    }
    static boolean pruefeTag(){
        // Tag wird geprüft
        return true;
    }

    public static void main(String[] args) {

        if(pruefeJahr() && pruefeMonat() && pruefeTag()){
            System.out.println("Datum ist korrekt");
        }
    }
}
