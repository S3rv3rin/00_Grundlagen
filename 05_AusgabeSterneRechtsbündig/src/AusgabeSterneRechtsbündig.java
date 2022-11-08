import java.util.Scanner;

public class AusgabeSterneRechtsbündig {
    public static void main(String[] args) {
        // Eingabe:
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte Zeilenanzahl eingeben: ");
        int zeilenAnzahl = eingabe.nextInt();

        // Verarbeitung:
        for (int zeile = 1; zeile <= zeilenAnzahl; zeile++) {
            for (int leerzeichen = 1; leerzeichen <= zeilenAnzahl - zeile; leerzeichen++) {
                System.out.print("  ");
            }
            for (int sternenAnzahl = 1; sternenAnzahl <= zeile; sternenAnzahl++) {
               // Ausgabe:
               System.out.print("* ");
            }
            System.out.println();
        }
    }
}


