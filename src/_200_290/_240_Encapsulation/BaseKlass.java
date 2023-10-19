package _200_290._240_Encapsulation;

public class BaseKlass {

    // private ist nur in der Klasse sichtbar
    // packagPrivate ist nur im Package sichtbar
    // protected ist in den Kindklassen sichtbar
    // public ist im ganzen Project sichtbar

    private String privateAtt = "private";
    String packagePrivatAtt = "PackagPrivate";

    protected String protecteAtt = "protected";

    public String publicAtt = "public";


    public static void main(String[] args) {
        BaseKlass base = new BaseKlass();
        System.out.println(base.privateAtt);
        System.out.println(base.packagePrivatAtt);
        System.out.println(base.protecteAtt);
        System.out.println(base.publicAtt);
    }
}
