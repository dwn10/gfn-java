package _200_290;

import java.util.Random;

public class _210_Switch {
    public static void main(String[] args) {

        // switch case
        // ohne break wird auch der nächste case ausgeführt

        Random rnd = new Random();
        int num = rnd.nextInt(1, 7);
        System.out.println("num = " + num);

        switch (num) {
            default:
                System.out.println("Fehler!!");
                break;
            case 6:
                System.out.println("ungenügend");
                break;
            case 1:
                System.out.println("sehr gut");
                break;
            case 2:
                System.out.println("gut");
                break;
            case 3:
                System.out.println("befriedigend");
                break;
            case 4:
                System.out.println("ausreichend");
                break;
            case 5:
                System.out.println("mangelhaft");
                break;

        }
    }
}
