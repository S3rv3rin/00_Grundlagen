import java.util.Scanner;

public class PrimzahlenAufgabe1 {
    public static void main(String[] args) {
        // E - Eingabe
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte eingeben, wie viele Primzahlen ausgegeben werden sollen eingeben: ");
        int anzahl = eingabe.nextInt();
        System.out.println("Bitte Zahl eingeben: ");
        int zahl = eingabe.nextInt();
        // V - Verarbeitung
        if (zahl <=1){
            System.out.println("Zahl zu klein, keine Primzahl");
        }

        while (anzahl > 0){
            int teiler;

            for ( teiler = 2; teiler < zahl; teiler++){
                if (zahl % teiler == 0){
                    break;
                }
            }

            // A - Ausgabe
            if (teiler == zahl){
                System.out.println(zahl + " ist eine Primzahl");
                anzahl--;
            }
            zahl++;
        }
    }
}
