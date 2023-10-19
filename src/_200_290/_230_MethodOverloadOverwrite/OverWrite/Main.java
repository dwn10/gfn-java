package _200_290._230_MethodOverloadOverwrite.OverWrite;

public class Main {
    public static void main(String[] args) {
        Ueberschreibung ueberschreibung = new Ueberschreibung();
        ueberschreibung.methode();

        KindUeberschreibung kindUeberschreibung = new KindUeberschreibung();
        kindUeberschreibung.methode();
    }
}
