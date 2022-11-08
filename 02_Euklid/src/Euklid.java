import java.util.Scanner;

public class Euklid {

    public static void main(String[] args) {

        /**
         * Um den Deklarationsteil variabel zu gestalten, benötigt man zur Deklaration eine Dateneingabe.
         * Das ist etwas trickreich, damit auch genau die Daten eingegeben werden, die wir wollen.
         * mit der Eingabe "Scanner" können wir die Library "java.util.Scanner" importieren (Siehe Zeile 1).
         */
        Scanner eingabe = new Scanner(System.in);

        /**
         * while    =>  kopfgesteuert   =>  Das bedeutet, dass sich im Kopf der Funktion alle Bedingungen/ Parameter befinden.
         * do-while =>  fußgesteuert    =>  Die Schleife wird durch den im Kopf befindenden Befehl "do" aufgerufen, und minimum einmal durchlaufen.
         *                                  Im Fuß der Schleife werden dann Bedingungen abgefragt, um zu prüfen ob die Schleife nochmal durchgeführt
         *                                  werden soll/muss.
         *
         * In einer do-while-Schleife kann mann im Gegenzug zur while-Schleife, mit Parametern arbeiten, die erst durch die Funktion im Schleifenkörper
         * abgefragt/definiert werden. Bei der while-Schleife müssen schon zuvor alle Parameter zuvor feststehen.
         * Sprich, man kann dem Algorithmus sagen:  - "Wiederhole so oft, bis ein Ergebnis kommt, was mir passt/gefällt".
         *                              oder aber:  - "Ich frage so oft nach und starte den Algorithmus neu, bis du mir das definierte "Abbruchkennwort"
         *                                             als Eingabe lieferst"
         */
        int a, b;
        do {
            /**
             * Durch eine Ausgabe wird der Benutzer aufgefordert etwas zu tun/einzugeben. Dann wird gewartet,
             * bis der Benutzer in diesem Fall eine Zahl eingegeben hat. Diese Eingabe wird der Variablen zugeordnet,
             * mit denen dann der Algorithmus rechnet.
             */
            //  Deklarationsteil
            System.out.print("Bitte Zahl a eingeben: ");
            a = eingabe.nextInt();
            System.out.print("Bitte Zahl b eingeben: ");
            b = eingabe.nextInt();
            if ( a > 0 & b > 0) {
                //  Verarbeitung
                while (a != b) {
                    if (a > b) {
                        a = a - b;      // a -= b;
                    } else {
                        b = b - a;      // b -= a;
                    }
                }
            }

            // Ausgabe
            System.out.println("ggT = " + a);   // ggT = größter gemeinsamer Teiler

        } while ((a | b) != 0);
    }
}

