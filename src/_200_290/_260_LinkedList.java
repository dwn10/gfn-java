package _200_290;

import java.util.ArrayList;
import java.util.LinkedList;

public class _260_LinkedList {
    public static void main(String[] args) {
        // LinkedList
        // wird im BigData-Bereich bzw. dort wo ser viele Daten sind eingesetzt
        LinkedList<Integer> list = new LinkedList<>();

        // Elemente hinzufügen
        list.add(1);
        list.add(2);
        list.add(3);

        // Ausgabe der Liste
        System.out.println("ursprüngliche Liste: " + list);

        // Erstes und letztes Element abrufen
        int first = list.getFirst();
        int last = list.getLast();
        System.out.println("Erstes Element: " + first);
        System.out.println("Letztes Element: " + last);

        // Element entfernen
        list.remove(2);
        System.out.println("Liste nach Entfernung des Elemnts an Index 2: " + list);

        // Liste durchlaufen
        for( int item : list){
            System.out.println(item);
        }
    }
}
