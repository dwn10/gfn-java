package _100_190;

public class _120_BreakContinue {
    public static void main(String[] args) {

        // break
        // kann in Schleifen und im Switch auftauchen
        // Beendet die Schleife komplett
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("i = " + i);
        }

        // continue
        // kann nur in Schleifen auftauchen
        // Beendet den aktuellen Schleifendurchlauf (die Iteration) vorzeitig
        // und führt die Schleife fort
        for (int i = 0; i < 10; i++) {
            if(i == 2){
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
