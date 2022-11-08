import java.util.Scanner;
/*
Alle Primzahlen bis zu einem Grenzwert.
Alle Primzahlenzwillinge bis zu einem bestimmten Grenzwert
Primzahlenzwillinge = Primzahlen, zwischen den nur eine gerade Zahl liegt.
 */
public class Primzahlenzwillinge {
    public static void main(String[] args) {
        // E - Eingabe
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte Grenzwert eingeben: ");
        int grenzwert = eingabe.nextInt();
        int a = 0, b = 0;
        // V - Verarbeitung
        if (grenzwert <= 1) {
            System.out.println("Zahl zu klein, keine Primzahl");
        }
        int zahl;
        for (zahl = 2; zahl < grenzwert; zahl++) {
            int teiler;
            for (teiler = 2; teiler < zahl; teiler++) {
                if (zahl % teiler == 0)
                    break;
            }
            // A - Ausgabe
            if (teiler == zahl) {
                a = zahl;

                if ( a - b <= 2 && b != 0)
                    System.out.println(b + " und " + a + " sind Zwillinge");
                b = a;
            }
        }
    }
}

