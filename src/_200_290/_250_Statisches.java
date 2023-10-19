package _200_290;

public class _250_Statisches {

    // static gehört der Klasse

    static String info = "info";
    static int counter = 0;
    String objektAttribut = "Objektattribut";

    _250_Statisches(){
        counter++;
    }


    static void staticMethod(){
        System.out.println("diese Methode gehöhrt der Klasse");
    }

    public static void main(String[] args) {

        System.out.println(_250_Statisches.info);
        _250_Statisches.staticMethod();

        _250_Statisches object = new _250_Statisches();

        // Objekte kommen an Statisches
        System.out.println(object.info);

        // Klassen kommen aber nicht an die ObjektAttribute und -Methoden
//        System.out.println(_250_Statisches.objektAttribut); // objektAttribut ist nicht statisch

        System.out.println("static Counter Test");
        System.out.println(_250_Statisches.counter);
        _250_Statisches object1 = new _250_Statisches();
        _250_Statisches object2 = new _250_Statisches();
        _250_Statisches object3 = new _250_Statisches();
        System.out.println(_250_Statisches.counter);
    }
}
