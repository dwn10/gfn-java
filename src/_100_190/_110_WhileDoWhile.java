package _100_190;

public class _110_WhileDoWhile {
    public static void main(String[] args) {

        // while Schleife
        // Kopfgesteuerte Schleife
        int i = 0;
        while (i < 10){
            System.out.println(i);
            i++;
        }

        // do while Schleife
        // Fußgesteuerte Schleife
        // wird mindestens einmal durchlaufen
        int j = 0;
        do {
            System.out.println(j);
//            j++;
        } while (j < 0);
    }
}
