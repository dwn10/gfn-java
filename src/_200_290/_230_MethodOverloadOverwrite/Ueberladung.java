package _200_290._230_MethodOverloadOverwrite;

public class Ueberladung {

    void addiere(int x){
        System.out.println(x);
    }
    void addiere(int x, int y){
        System.out.println(x + y);
    }
    void addiere(int x, String y){
        System.out.println(x + y);
    }

    public static void main(String[] args) {
        Ueberladung ueberladung = new Ueberladung();

        ueberladung.addiere(5);
        ueberladung.addiere(5, 5);
        ueberladung.addiere(5, "string");

    }
}
