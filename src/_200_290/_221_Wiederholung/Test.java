package _200_290._221_Wiederholung;

public class Test {
    public static void main(String[] args) {
        Elternklasse ek = new Elternklasse();
        System.out.println(ek.defaultWert);
        System.out.println(ek.wert);
        ek.info();
//        System.out.println(ek.kindWert); // Attribut nicht gefunden

        Kindklasse kk = new Kindklasse();
        System.out.println(kk.defaultWert);
        System.out.println(kk.wert);
        kk.info();
        System.out.println(kk.kindWert);

        ZweiteKindklasse zkk = new ZweiteKindklasse();
//        System.out.println(zkk.kindWert); // Attribut nicht gefunden
    }
}
