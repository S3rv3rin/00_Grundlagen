import java.util.Scanner;

public class AusgabeSterneDiamant {
    public static void main(String[] args) {
        // Eingabe:
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte Zeilenanzahl eingeben: ");
        int zeilenAnzahl = eingabe.nextInt();
        int zeile;
        int leerzeichen;
        int sternenAnzahl;
        // Verarbeitung:
        for (zeile = 0; zeile < zeilenAnzahl; zeile++) {
            for (leerzeichen = 0; leerzeichen < zeilenAnzahl - zeile - 1; leerzeichen++)
                System.out.print(" ");

            for (sternenAnzahl = 0; sternenAnzahl <= zeile; sternenAnzahl++)
                // Ausgabe:
                System.out.print("* ");

            System.out.println("");
        }
        for (zeile = zeilenAnzahl - 2; zeile >= 0; zeile--) {
            for (leerzeichen = 0; leerzeichen < zeilenAnzahl - zeile -1 ; leerzeichen++)
                System.out.print(" ");
            for (sternenAnzahl = 0; sternenAnzahl <= zeile; sternenAnzahl++)
                // Ausgabe:
                System.out.print("* ");

            System.out.println("");
        }
    }
}

