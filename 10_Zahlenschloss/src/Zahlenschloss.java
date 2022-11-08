import java.util.Scanner;
/*
public class Zahlenschloss {
    /*  Aufgabe:
    Es soll eine im Programm hinterlegte geheime 3- stellige Zahl erraten werden.
    Erst wenn die Zahl korrekt erraten wurde, beendet das Programm,
    ansonsten soll vom Anwender einen neuen Tipp abgegeben werden.
     * /
    public static int geheimzahl = 375;

    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        int tipp = 0;
        do {
            System.out.println("Gib deinen Tipp ein:");
            tipp = eingabe.nextInt();
            /* Wenn man lieb sein will:
            if (tipp > geheimzahl && (tipp - geheimzahl)> 100) System.out.println("Weit gefehlt! Geheimzahl ist viel kleiner als dein Tipp");
            else if (tipp > geheimzahl && (tipp - geheimzahl) < 10) System.out.println("Knapp daneben! Geheimzahl ist ein wenig kleiner als dein Tipp");
            else if (tipp > geheimzahl) System.out.println("Geheimzahl ist  kleiner als dein Tipp");
            else if (tipp < geheimzahl && (geheimzahl - tipp) > 100) System.out.println("Weit gefehlt! Geheimzahl ist viel größer als dein Tipp");
            else if (tipp < geheimzahl && (geheimzahl - tipp) < 10) System.out.println("Knapp daneben! Geheimzahl ist ein wenig größer als dein Tipp");
            else if (tipp < geheimzahl) System.out.println("Geheimzahl ist größer als dein Tipp");
            * /
        } while (tipp != geheimzahl);
        System.out.println("Gratulation! Du hast die Zahl gefunden!");
    }
}
*/

import java.util.Scanner;

public class Zahlenschloss {

    /* Aufgabe:
     *  Es soll eine im Programm hinterlegte geheime 3-stellige Zahl erraten werden.
     *  Erst wenn die Zahl korrekt erraten wurde, beendet das Programm,
     *  ansonsten soll vom Anwender ein neuer Tipp abgegeben werden.
     */

    public static int geheimeZahl = 375;        // wieso darf das hier draußen stehen?

    public static boolean schloss(int zahl) {
        if (zahl == geheimeZahl)
            return true;
        else
            return false;
    }


    public static void main(String[] args) {
//        int geheimeZahl = 375;

        Scanner eingabe = new Scanner(System.in);

        int tipp;
        do {
            System.out.print("Bitte Tipp eingeben: ");
            tipp = eingabe.nextInt();
        } while ( !schloss(tipp) );
        System.out.println("Yeah, richtig geraten");

    }
}
