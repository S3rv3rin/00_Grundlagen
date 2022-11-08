import java.util.Scanner;
/*
Alle Primzahlen bis zu einem Grenzwert.
 */
public class PrimzahlenAufgabe2 {
    public static void main(String[] args) {
        // E - Eingabe
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte Grenzwert eingeben: ");
        int grenzwert = eingabe.nextInt();

        // V - Verarbeitung
        if (grenzwert <=1){
            System.out.println("Zahl zu klein, keine Primzahl");
        }
        int zahl;
        for ( zahl = 2; zahl < grenzwert; zahl++){
            int teiler;
            for ( teiler = 2; teiler < zahl; teiler++){
                if (zahl % teiler == 0){
                    break;
                }
            }

            // A - Ausgabe
            if (teiler == zahl){
                System.out.println(zahl + " ist eine Primzahl");

            }
        }
    }
}
