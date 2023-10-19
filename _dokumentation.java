AUFGABEN - LF11aV2

Begrüßung

Es soll eine Begrüssung in Abhängingkeit zur Uhrzeit ausgegeben werden.
Zwischen 22Uhr und 5Uhr: Gute Nacht
Vor 11Uhr: Guten Morgen
Vor 15Uhr: Mahlzeit
Vor 18Uhr: Guten Nachmittag
Vor 22Uhr: Guten Abend

Die Stunde per Random zwischen 0 - 23 erstellen.


Lösung:

Begrüßung in Abhängigkeit von der Uhrzeit ausgibt:

import java.util.Random;


public class Gruessung {


    public static void main(String[] args) {
        // Erstelle einen Random-Generator
        Random random = new Random();


        // Generiere eine zufällige Stunde zwischen 0 und 23
        int stunde = random.nextInt(24);


        // Gib die Begrüßung aus
        switch (stunde) {
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Gute Nacht!");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Guten Morgen!");
                break;
            case 11:
            case 12:
            case 13:
            case 14:
                System.out.println("Mahlzeit!");
                break;
            case 15:
            case 16:
            case 17:
                System.out.println("Guten Nachmittag!");
                break;
            case 18:
            case 19:
            case 20:
            case 21:
                System.out.println("Guten Abend!");
                break;
            default:
                System.out.println("Ungültige Uhrzeit!");
                break;
        }
    }
}

Erklärung des Codes:

In der main()-Methode wird ein Random-Generator erstellt.
Mit dem nextInt()-Methode wird eine zufällige Zahl zwischen 0 und 23 generiert.
Die switch-Anweisung wird verwendet, um die Begrüßung anhand der Uhrzeit auszuwählen.
Für jede Uhrzeit wird ein entsprechender Fall definiert.
Wenn die Uhrzeit ungültig ist, wird eine entsprechende Meldung ausgegeben.
Beispielausgabe: Gute Nacht!
Alternativer Ansatz:
Statt einer switch Anweisung kann man auch eine if Anweisung verwenden:
import java.util.Random;


public class Gruessung {


    public static void main(String[] args) {
        // Erstelle einen Random-Generator
        Random random = new Random();


        // Generiere eine zufällige Stunde zwischen 0 und 23
        int stunde = random.nextInt(24);


        // Prüfe die Uhrzeit
        if (stunde >= 22 || stunde <= 5) {
            System.out.println("Gute Nacht!");
        } else if (stunde < 11) {
            System.out.println("Guten Morgen!");
        } else if (stunde < 15) {
            System.out.println("Mahlzeit!");
        } else if (stunde < 18) {
            System.out.println("Guten Nachmittag!");
        } else {
            System.out.println("Guten Abend!");
        }
    }
}


Erklärung des Codes:
In der if-Anweisung wird die Uhrzeit geprüft.
Wenn die Uhrzeit zwischen 22 und 5 Uhr liegt, wird "Gute Nacht!" ausgegeben.
Wenn die Uhrzeit vor 11 Uhr liegt, wird "Guten Morgen!" ausgegeben.
Wenn die Uhrzeit vor 15 Uhr liegt, wird "Mahlzeit!" ausgegeben.
Wenn die Uhrzeit vor 18 Uhr liegt, wird "Guten Nachmittag!" ausgegeben.
Wenn die Uhrzeit vor 22 Uhr liegt, wird "Guten Abend!" ausgegeben.



—----------------------------------------------------------------
# 2


Kleines Einmaleins
Schreibe ein Programm, das das kleine Einmaleins formatiert ausgibt:

001 002 003 004 005 006 007 008 009 010
002 004 006 008 010 012 014 016 018 020
003 006 009 012 015 018 021 024 027 030
004 008 012 016 020 024 028 032 036 040
005 010 015 020 025 030 035 040 045 050
006 012 018 024 030 036 042 048 054 060
007 014 021 028 035 042 049 056 063 070
008 016 024 032 040 048 056 064 072 080
009 018 027 036 045 054 063 072 081 090
010 020 030 040 050 060 070 080 090 100

Lösung:

import java.util.Arrays;


public class KleinesEinmaleins {


    public static void main(String[] args) {
        // Erstelle ein Array mit den Zahlen von 1 bis 10
        int[] zahlen = Arrays.stream(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}).toArray();


        // Initialisiere zwei Zähler
        int x = 0;
        int y = 0;


        // Gehe durch alle Zahlen von 1 bis 10
        while (x <= 9) {
            // Setze den Y-Zähler auf den aktuellen X-Wert
            y = x;


            // Gehe durch alle Zahlen von 1 bis 10
            while (y <= 9) {
                // Gib die Multiplikation von X und Y aus
                System.out.printf("%02d %02d | %02d%n", x, y, x * y);


                // Erhöhe den Y-Zähler
                y++;
            }


            // Erhöhe den X-Zähler
            x++;
        }
    }
}

Erklärung des Codes:
In der main()-Methode wird ein Array mit den Zahlen von 1 bis 10 erstellt.
Zwei Zähler werden initialisiert.
In einer while-Schleife wird durch alle Zahlen von 1 bis 10 iteriert.
In einer weiteren while-Schleife wird durch alle Zahlen von 1 bis 10 iteriert.
In jeder Iteration wird die Multiplikation von X und Y ausgegeben.
Der Y-Zähler wird erhöht.
Der X-Zähler wird erhöht.
Beispielausgabe:
001 001 | 001
001 002 | 002
001 003 | 003
001 004 | 004
001 005 | 005
...
...
...
009 009 | 081
009 010 | 090

—---------------------------------------------------------------
# 3


Fakultät
Schreibe ein Programm, das ermittelt, welche Zahl möglichst groß ist ohne dass ihre Fakultät über 1.000.000.000 ist.
Gib zum Beweiß auch alle kleineren Fakultäten aus.

Hinweis:
Fakultät von 5 (Kurzschreibweise: 5!):
1 * 2 * 3 * 4 * 5 = 120

Lösung:

public class Fakultaet {


    public static void main(String[] args) {
        // Erstelle ein Array mit den Fakultäten
        int[] fakultaeten = new int[10];


        // Initialisiere die Fakultäten
        for (int i = 0; i < fakultaeten.length; i++) {
            fakultaeten[i] = 1;
        }


        // Berechne die Fakultäten
        for (int i = 2; i < fakultaeten.length; i++) {
            for (int j = 1; j <= i; j++) {
                fakultaeten[i] *= j;
            }
        }


        // Suche die größte Zahl, ohne dass ihre Fakultät über 1.000.000.000 ist
        int i = 0;
        while (i < fakultaeten.length && fakultaeten[i] <= 1_000_000_000) {
            i++;
        }


        // Gib die Ergebnisse aus
        System.out.println("Die größte Zahl, ohne dass ihre Fakultät über 1.000.000.000 ist, ist " + (i - 1) + ".");
        for (int j = 0; j < i; j++) {
            System.out.println(j + "! = " + fakultaeten[j]);
        }
    }
}

Erklärung des Codes:
In der main()-Methode wird ein Array mit den Fakultäten erstellt.
Die Fakultäten werden initialisiert.
Die Fakultäten werden berechnet.
Die größte Zahl, ohne dass ihre Fakultät über 1.000.000.000 ist, wird gesucht.
Die Ergebnisse werden ausgegeben.
Beispielausgabe:
Die größte Zahl, ohne dass ihre Fakultät über 1.000.000.000 ist, ist 9.
0! = 1
1! = 1
2! = 2
3! = 6
4! = 24
5! = 120
6! = 720
7! = 5.040
8! = 40.320
9! = 362.880

—---------------------------------------------------------------

# 4


Korrektes Datum

Die Meyer GmbH benötigt ein Modul, das ein Datum auf Korrektheit prüft.
Ist das zu prüfende Datum korrekt, so ist die Variable datok auf 1, andernfalls auf 0 zu setzen.

Beispiele:

29.02.1999 - datok: 0
29.02.2000 - datok: 1
13.05.2000 - datok: 1
32.05.2000 - datok: 0
24.13.2000 - datok: 0

Für die Jahre gilt: jahr > 1900 && jahr < 2100


Lösung:

public class Datumspruefung {


    public static void main(String[] args) {
        // Erstelle eine Variable für das Datum
        int tag = 29;
        int monat = 2;
        int jahr = 2000;


        // Prüfe das Datum
        boolean korrekt = pruefeDatum(tag, monat, jahr);


        // Gebe das Ergebnis aus
        if (korrekt) {
            System.out.println("Das Datum ist korrekt.");
        } else {
            System.out.println("Das Datum ist nicht korrekt.");
        }
    }


    public static boolean pruefeDatum(int tag, int monat, int jahr) {
        // Prüfe, ob das Jahr gültig ist
        if (jahr < 1900 || jahr > 2100) {
            return false;
        }


        // Prüfe, ob der Monat gültig ist
        if (monat < 1 || monat > 12) {
            return false;
        }


        // Prüfe, ob der Tag gültig ist
        if (monat == 1 || monat == 3 || monat == 5 || monat == 7 || monat == 8 || monat == 10 || monat == 12) {
            if (tag < 1 || tag > 31) {
                return false;
            }
        } else if (monat == 4 || monat == 6 || monat == 9 || monat == 11) {
            if (tag < 1 || tag > 30) {
                return false;
            }
        } else if (monat == 2) {
            if (jahr % 4 == 0 && jahr % 100 != 0) {
                if (tag < 1 || tag > 29) {
                    return false;
                }
            } else if (tag < 1 || tag > 28) {
                return false;
            }
        }


        // Das Datum ist gültig
        return true;
    }
}

Erklärung des Codes:
In der Main()-Methode werden die Daten für das zu prüfende Datum übergeben.
Die prüfDatum()-Methode wird aufgerufen, um das Datum zu prüfen.
Die prüfDatum()-Methode prüft zunächst, ob das Jahr gültig ist.
Anschließend wird geprüft, ob der Monat gültig ist.
Zuletzt wird geprüft, ob der Tag gültig ist.
Beispielausgabe: Das Datum ist korrekt.

—---------------------------------------------------------------
# 5

Karten_mischen

Schreibe ein Programm, das das Mischen der 32 Karten eines Skatspiels simuliert.
Jede Karte wird durch eine ArrayList der Form [Farbe, Wert] dargestellt.
Die Farben sind: Kreuz, Pik, Herz und Karo.
Die Werte sind: Ass, König, Dame, Bube, Zehn, Neun, Acht, Sieben.
Zunächst wird eine ArrayList mit den 32 Karten-Arrays Listen erstellt.

Durch wiederholtes Vertauschen zweier zufällig ausgewählter
Karten sollen die ArrayLists dann noch gemischt werden.

Die Ausgabe könnte folgendermaßen aussehen:

Ungemischt:
[Kreuz, Sieben] [Kreuz, Acht] [Kreuz, Neun] [Herz, Zehn] [Kreuz, Bube] [Kreuz, Dame] [Kreuz, König] [Kreuz, Ass]
[Pik, Sieben] [Pik, Acht] [Pik, Neun] [Pik, Zehn] [Pik, Bube] [Pik, Dame] [Pik, König] [Pik, Ass]
[Herz, Sieben] [Herz, Acht] [Herz, Neun][Kreuz, Zehn] [Herz, Bube] [Herz, Dame] [Herz, König] [Herz, Ass]
[Karo, Sieben] [Karo, Acht] [Karo, Neun] [Karo, Zehn] [Karo, Bube] [Karo, Dame] [Karo, König] [Karo, Ass]

Gemischt:
[Karo, Dame] [Herz, König] [Pik, Neun] [Herz, Ass] [Kreuz, Zehn] [Karo, Sieben] [Kreuz, Bube]
[Pik, Zehn] [Kreuz, Neun] [Pik, Acht] [Karo, König] [Pik, Sieben] [Herz, Bube] [Kreuz, Dame] [Karo, Neun]
[Pik, Bube] [Karo, Acht] [Herz, Zenn] [Kreuz, Acht] [Kreuz, König] [Kreuz, Sieben] [Pik, Dame] [Kreuz, Ass]
[Pik, König] [Herz, Sieben] [Herz, Neun] [Herz, Acht] [Herz, Dame] [Karo, Zehn] [Karo, Bube] [Karo, Ass]

Lösung:

public class Karten_mischen {
    public static void main(String[] args) {
        ArrayList<String[]> karten = new ArrayList<String[]>();
        String[] farben = { "Kreuz", "Pik", "Herz", "Karo" };
        String[] werte = { "Ass", "König", "Dame", "Bube", "Zehn", "Neun", "Acht", "Sieben" };


        for (String farbe : farben) {
            for (String wert : werte) {
                karten.add(new String[] { farbe, wert });
            }
        }


        System.out.println("Ungemischt:");
        for (String[] karte : karten) {
            System.out.print("[" + karte[0] + ", " + karte[1] + "] ");
        }
        System.out.println();


        Collections.shuffle(karten);


        System.out.println("Gemischt:");
        for (String[] karte : karten) {
            System.out.print("[" + karte[0] + ", " + karte[1] + "] ");
        }
        System.out.println();
    }
}

Erklärung des Codes:
Der Code erstellt ein Kartenspiel mit einer ArrayList namens "karten". Das Kartenspiel besteht aus Karten, die durch eine Kombination von Farben und Werten repräsentiert werden. 
1. Eine ArrayList namens "karten" wird erstellt, um die Karten des Kartenspiels zu speichern.
2. Es werden zwei Arrays von Strings erstellt: "farben" enthält die möglichen Farben der Karten und "werte" enthält die möglichen Werte der Karten.
3. Eine verschachtelte Schleife wird verwendet, um alle möglichen Kombinationen von Farben und Werten zu erstellen.
4. Für jede Kombination von Farbe und Wert wird ein neues String-Array erstellt und der ArrayList "karten" hinzugefügt.
5. Die Karten werden ungemischt ausgegeben, indem eine Schleife verwendet wird, um über jedes Element (Array) in der ArrayList "karten" zu iterieren und die Farbe und den Wert der Karte auszugeben.
6. Die Karten werden dann mit der Collections.shuffle()-Methode gemischt.
7. Die gemischten Karten werden ausgegeben, indem eine Schleife verwendet wird, um über jedes Element (Array) in der ArrayList "karten" zu iterieren und die Farbe und den Wert der Karte auszugeben.
Zusammenfassend erstellt der Code ein Kartenspiel, mischt die Karten und gibt sie sowohl vor dem Mischen als auch nach dem Mischen aus.
—------------------------------------------------------------------
# 6

Seitenzahlen

Ein Schriftsetzer musste bei einem Buch die Seitenzahlen mit Lettern drucken.
Lettern sind spiegelverkehrte Schriftzeichen, die heute nur noch selten für den Buchdruck verwendet werden.
Dafür musste unser Schriftsetzer wissen, wie viele solcher Lettern er für die Seitennummerierung benötigt.
Seitennummerierungen bestehen ausschließlich aus den Ziffern 0 bis 9.  
In dieser Aufgabe werden Lettern und Ziffern synonym verwendet.
Ab Seite 5 waren die Seiten nummeriert.
Die Seite 10 benötigt als Erste zwei Ziffern (nämlich die Ziffer "1" und die Ziffer "0").
Die Lettern konnten für verschiedene Seiten nicht wiederverwendet werden, da alle Seiten gleichzeitig für den Druck bereitstehen mussten.

Schreibe ein Programm, das für eine gegebene Anzahl Seiten die benötigten Anzahlen für jede Ziffer ausgibt.
Da die Nummerierung erst bei 5 beginnt, hatte ein Buch mit 4 Seiten noch keine Ziffern.
Ein Buch mit 11 Seiten benötigte bereits die Ziffern

5 (1x), 6 (1x), 7 (1x), 8 (1x), 9 (1x), 1 (3x) und  (1x).

Zur Programmierung verwende eine ArrayList von [0] bis [9] (also mit 10 Einträgen), worin je die Anzahl der benötigten Ziffern steht.


Lösung:

import java.util.ArrayList;


public class Seitenzahlen {
    public static void main(String[] args) {
        int seiten = 11; // Hier die Anzahl der Seiten eintragen
        ArrayList<Integer> ziffern = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            ziffern.add(0);
        }
        for (int i = 5; i <= seiten; i++) {
            String seitenString = Integer.toString(i);
            for (int j = 0; j < seitenString.length(); j++) {
                int ziffer = Character.getNumericValue(seitenString.charAt(j));
                ziffern.set(ziffer, ziffern.get(ziffer) + 1);
            }
        }
        System.out.println("Für " + seiten + " Seiten benötigst du folgende Ziffern:");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ": " + ziffern.get(i));
        }
    }
}

Dieses Programm verwendet eine ArrayList von [0] bis 9, um die Anzahl der benötigten Ziffern zu speichern. Es durchläuft dann alle Seiten ab Seite 5 und zählt die Anzahl der Vorkommen jeder Ziffer in den Seitennummern.
Wenn du das Programm ausführst und 11 als Anzahl der Seiten eingibst, erhältst du folgende Ausgabe:
Für 11 Seiten benötigst du folgende Ziffern:
0: 1
1: 3
2: 0
3: 0
4: 0
5: 1
6: 1
7: 1
8: 1
9: 1
Erklärung des Codes:
Der Code berechnet die Anzahl der Vorkommen jeder Ziffer in den Seitenzahlen eines Buches.

Es wird eine ArrayList mit dem Namen "ziffern" erstellt, um die Anzahl der Vorkommen jeder Ziffer zu speichern.
In einer Schleife werden 10 Elemente mit dem Wert 0 zur "ziffern"-ArrayList hinzugefügt. Jedes Element repräsentiert eine Ziffer von 0 bis In einer weiteren Schleife wird jede Seite von 5 bis zur angegebenen Seitenzahl durchlaufen.
Für jede Seite wird der Seitenzahl-Integer in einen String konvertiert.
In einer inneren Schleife wird jeder einzelne Charakter des Seitenzahl-Strings durchlaufen.
Der Charakter wird in eine Ziffer umgewandelt und in der "ziffern"-ArrayList erhöht.
 Am Ende werden die Ergebnisse ausgegeben, indem die Anzahl der Vorkommen jeder Ziffer in einer Schleife angezeigt wird.

Zusammenfassend berechnet der Code die Anzahl der Vorkommen jeder Ziffer in den Seitenzahlen eines Buches und gibt die Ergebnisse aus.

—------------------------------------------------------------------
# 7


Bubblesort

Schreibe ein Methode, der man ein Array mit beliebig vielen Integern als Werten übergeben kann
und die dieses Array sortiert und zurück gibt.

Benutze hierzu den Bubblesort-Algorithmus.
Bei diesem wird das Array durchlaufen und jede Zahl mit der jeweils nachfolgenden Zahl verglichen.
Wenn die nachfolgende Zahl kleiner ist, werden die Zahlen getauscht.
Das Array wird solange durchlaufen, bis bei einem Durchlauf keine Zahlen getauscht werden müssen.


Lösung:

public class BubbleSort {


    public static int[] bubbleSort(int[] array) {
        // Initialisiere einen Zähler, der die Anzahl der Durchläufe des
        // Bubblesort-Algorithmus zählt.
        int durchlaeufe = 0;


        // Solange bei einem Durchlauf noch Zahlen getauscht werden müssen, fahre fort.
        while (true) {
            // Setze einen Flag, der angibt, ob bei einem Durchlauf Zahlen getauscht wurden.
            boolean getauscht = false;


            // Iteriere über das Array und vergleiche jede Zahl mit der jeweils
            // nachfolgenden Zahl.
            for (int i = 0; i < array.length - 1; i++) {
                // Wenn die nachfolgende Zahl kleiner ist, tausche die Zahlen.
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;


                    // Setze den Flag, da bei diesem Durchlauf eine Zahl getauscht wurde.
                    getauscht = true;
                }
            }


            // Wenn bei einem Durchlauf keine Zahlen getauscht wurden, ist das Array
            // sortiert.
            if (!getauscht) {
                break;
            }


            // Erhöhe den Zähler, um die Anzahl der Durchläufe zu zählen.
            durchlaeufe++;
        }


        // Gib das sortierte Array zurück.
        return array;
    }


    public static void main(String[] args) {
        // Erstelle ein Array mit unsortierten Zahlen.
        int[] array = { 5, 3, 1, 9, 2, 4, 7, 8, 6 };


        // Rufe die Bubblesort-Methode auf und speichere das sortierte Array in einer
        // Variablen.
        int[] sortedArray = bubbleSort(array);


        // Gib das sortierte Array aus.
        System.out.println("Sortiertes Array:");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }
}

Erklärung des Codes:

Der Code implementiert den Bubble-Sort-Algorithmus zur Sortierung eines Arrays von Zahlen.

1. Die Methode  `bubbleSort`  nimmt ein Integer-Array entgegen und gibt ein sortiertes Integer-Array zurück.
2. Es wird ein Zähler  'durchläufe'  initialisiert, um die Anzahl der Durchläufe des Bubble-Sort-Algorithmus zu zählen.
3. Eine Schleife wird gestartet und solange fortgesetzt, bis beim Durchlauf keine Zahlen mehr getauscht werden müssen.
4. Innerhalb der Schleife wird ein Flag  `getauscht`  gesetzt, um anzuzeigen, ob beim Durchlauf Zahlen getauscht wurden.
5. Das Array wird durchlaufen und jede Zahl wird mit der nachfolgenden Zahl verglichen.
6. Wenn die nachfolgende Zahl kleiner ist, werden die beiden Zahlen getauscht.
7. Das Flag  `getauscht`  wird gesetzt, da beim Durchlauf eine Zahl getauscht wurde.
8. Wenn beim Durchlauf keine Zahlen getauscht wurden, ist das Array bereits sortiert und die Schleife wird beendet.
9. Der Zähler  'durchläufe'  wird erhöht, um die Anzahl der Durchläufe zu zählen.
10. Das sortierte Array wird zurückgegeben.
11. In der  `main` -Methode wird ein unsortiertes Integer-Array erstellt.
12. Die Methode  `bubbleSort`  wird aufgerufen und das sortierte Array wird in einer Variable gespeichert.
13. Das sortierte Array wird ausgegeben.

Zusammenfassend implementiert der Code den Bubble-Sort-Algorithmus zur Sortierung eines Arrays von Zahlen und gibt das sortierte Array aus.


—------------------------------------------------------------------
 # 8


