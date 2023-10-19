package _200_290._240_Encapsulation.anderOrdner;

import _200_290._240_Encapsulation.BaseKlass;

public class ChildClass extends BaseKlass {
    public static void main(String[] args) {
        BaseKlass base = new BaseKlass();
//        System.out.println(base.privateAtt); // an private komm ich nicht rann
//        System.out.println(base.packagePrivatAtt); // an PackagPrivate komm ich nicht rann
//        System.out.println(base.protecteAtt); // an protected komm ich nicht rann
        System.out.println(base.publicAtt);
    }
}
