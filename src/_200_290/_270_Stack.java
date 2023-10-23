package _200_290;

import java.util.Stack;

public class _270_Stack {
    public static void main(String[] args) {
        // Stack
        // Grundbaustein der Appentwicklung

        Stack<String> stack = new Stack<>();

        // Elemente hinzufügen
        stack.push("Window1");
        stack.push("Window2");
        stack.push("Window3");

        // Ausgabe des Stacks
        System.out.println("Stack: " + stack);

        // Oberstes Element abrufen (peek)
        String top = stack.peek();
        System.out.println("Oberstes element: " + top);
        System.out.println("Oberstes element: " + stack.peek());

        // Oberstes Element entfernen (pop)
        String removed = stack.pop();
        System.out.println("Entferntes Element: " + removed);
        System.out.println("Stack nach pop(): " + stack);
    }
}
