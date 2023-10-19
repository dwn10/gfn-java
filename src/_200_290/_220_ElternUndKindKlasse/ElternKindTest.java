package _200_290._220_ElternUndKindKlasse;

import java.util.ArrayList;

public class ElternKindTest {
    public static void main(String[] args) {

        // hier wird ein Objekt erzeugt
        Fahrzeug fahr1 = new Fahrzeug();
        Fahrzeug fahr2 = new Fahrzeug("weiß");
        System.out.println(fahr1.getHersteller());
        fahr1.setHersteller("Mercedes");
        System.out.println(fahr1.getHersteller());

        System.out.println(fahr1);

        PKW pkw = new PKW();
        System.out.println(pkw);

        PKW pkwBlau = new PKW("blau");
        System.out.println(pkwBlau);

        fahr1.starten();


        // Polymorphie
        Fahrzeug fahr3 = new Fahrzeug();
        PKW pkw2 = new PKW();
        Quad quad = new Quad();

        Fahrzeug demo = new Quad();
//        PKW demo2 = new Fahrzeug();// Casting Error

        ArrayList<Fahrzeug> fahrzeuge = new ArrayList<>();
        fahrzeuge.add(fahr3);
        fahrzeuge.add(pkw2);
        fahrzeuge.add(quad);
        fahrzeuge.add(demo);

        for (int i = 0; i < fahrzeuge.size(); i++) {
            fahrzeuge.get(i).starten();
        }



    }
}
