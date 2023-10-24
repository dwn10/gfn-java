package lzk;

public class Aufgabe_18 {

    public static void main(String[] args) {
        String vorname = "Anna";
        String nachname = "Müller";
        String initialen = vorname.charAt(0) + "." + nachname.charAt(0) + ".";
        System.out.println(initialen);
    }
}

/*
 * A) A.M. ***
 * B) AM
 * C) Anna.Müller.
 * D) AnnaMüller
 */
