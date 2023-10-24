package lzk;

public class Equals {
    public static void main(String[] args) {

        String string1 = "Hallo";
        String string2 = "Hallo";
        String string3 = new String("Hallo");

        System.out.println(string1 == string2);
        System.out.println(string1 == string3);
        System.out.println(string1.equals(string3));
    }
}
