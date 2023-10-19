package _100_190;

import java.util.ArrayList;

public class _160_Arraylist {
    public static void main(String[] args) {

        // Arraylist
        // Die Größe ist veränderbar

        // Arraylist kann nur Objekte fassen
        ArrayList<Integer> nums = new ArrayList();
        System.out.println(nums);

        // add(element) - hinzufügen
        nums.add(1);
        nums.add(7);
        nums.add(9);
        nums.add(42);
        System.out.println(nums);

        // add(index, element)
        nums.add(2, 42);
        System.out.println(nums);

        // size() = Länge der Arraylist
        // get(index) = einzelnes Element der ArrayList
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        // set(index, element)
        nums.set(0, 23);
        System.out.println(nums);

        // indexOf(Object)
        // ERmittelt den Index (des ersten Fundes) eines Elements
        System.out.println(nums.indexOf(42));
        System.out.println(nums.indexOf(88)); // -1 Fehlermeldung

        // contains(Object)
        System.out.println(nums.contains(42));  // true
        System.out.println(nums.contains(88));  // false

        // remove(Object)
        ArrayList<String> names = new ArrayList<>();
        names.add("Peter");
        names.add("Claudia");
        names.add("Brunhild");
        names.remove("Claudia");
        System.out.println(names);
        // remove() hat zusätzlich noch einen Returnwert
        System.out.println(names.remove("Claudia")); // false
        System.out.println(names.remove("Brunhild")); // true

        // clear()
        names.clear();
        System.out.println(names);
    }
}
