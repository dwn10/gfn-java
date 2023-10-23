package lzk;

public class Aufgabe_2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int result = verdopple(a) + halbiere(b);
        System.out.println(result);

    }

    public static int verdopple(int num) {
        return num * 2;
    }

    public static int halbiere(int num) {
        return num / 2;
    }
}
