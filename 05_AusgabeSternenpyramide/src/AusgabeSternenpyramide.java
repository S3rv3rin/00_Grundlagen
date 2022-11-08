import java.util.Scanner;

public class AusgabeSternenpyramide {
    public static void main(String[] args) {
        // Eingabe:
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte Zeilenanzahl eingeben: ");
        int zeilenAnzahl = eingabe.nextInt();

        // Verarbeitung:
        for (int zeile = 0; zeile < zeilenAnzahl; zeile++) {
            for (int leerzeichen = 0; leerzeichen < zeilenAnzahl-zeile-1; leerzeichen++)
                System.out.print(" ");

            for (int sternenAnzahl = 0; sternenAnzahl <= zeile; sternenAnzahl++)
            // Ausgabe:
                System.out.print("* ");

            System.out.println("");
        }
    }
}