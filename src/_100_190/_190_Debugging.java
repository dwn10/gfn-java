package _100_190;

public class _190_Debugging {
    public static void main(String[] args) {

        // Fehlertypen

        // Logische Fehler  -> Da hilft der Debugger
        // Syntax Fehler    -> Da hilft die IDE
        // Runtime Fehler   -> Da helfen die Java - Fehlermeldungen

//        int a = 10 / 0;     // Division by Zero Error

        int x = 1, y = 7, i;

        for(i = 0; i < 11; i++){
            x++;
            y = x + 1;
        }

        x = 10;
        System.out.println(i + " - " + x + " - " + y);
    }
}
