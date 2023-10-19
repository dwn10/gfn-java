package _200_290._240_Encapsulation;

import _200_290._240_Encapsulation.anderOrdner.ChildClass;

public class EncapsuDemo {
    public static void main(String[] args) {
        BaseKlass base = new BaseKlass();
//        System.out.println(base.privateAtt); // an private komm ich nicht rann
        System.out.println(base.packagePrivatAtt);
        System.out.println(base.protecteAtt);
        System.out.println(base.publicAtt);

        ChildClass child = new ChildClass();
//        System.out.println(base.privateAtt); // an private komm ich nicht rann
        System.out.println(base.packagePrivatAtt);
        System.out.println(base.protecteAtt);
        System.out.println(base.publicAtt);
    }
}
