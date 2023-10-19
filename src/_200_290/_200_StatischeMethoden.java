package _200_290;

public class _200_StatischeMethoden {

    public static void main(String[] args) {

        gibAus();   // ich bin in der Methode gibAus()!
        gibAus();   // ich bin in der Methode gibAus()!
        gibAus();   // ich bin in der Methode gibAus()!

        int i = addiere(100, 200); // das hier ist der sogenannte caler
        System.out.println(i);

        int y = addiere(500, 1); // das hier ist der sogenannte caler
        System.out.println(y);
    }

    // void ist der Returntyp
    static void gibAus() {
        System.out.println("ich bin in der Methode gibAus()!");
    }

    // int ist der Returntyp
    static int addiere(int bratwurs, int y){
        if(bratwurs > y) {
            int returnWert = bratwurs + y;
            // return verlässt die Methode, genau wie break
            return returnWert;
        }
        else{
            int test = bratwurs - y;
            return test;
        }
    }

}
