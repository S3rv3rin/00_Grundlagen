import java.util.Scanner;

public class AusgabeSterne {
    public static void main(String[] args) {
        // Eingabe:
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte Zeilenanzahl eingeben: ");
        int zeilenAnzahl = eingabe.nextInt();

        // Verarbeitung:
        for (int zeile = 1; zeile <= zeilenAnzahl; zeile++) {
            for (int sternenAnzahl = 1; sternenAnzahl <= zeile; sternenAnzahl++) {
        // Ausgabe:
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*  Meine Lösung in der Verarbeitung:
        // Verarbeitung:
        for (int zeile = 0; zeile < zeilenAnzahl; zeile++) {
            for (int sternenAnzahl = 1; sternenAnzahl <= zeile; sternenAnzahl++) {
                // Ausgabe:
                if (sternenAnzahl < zeile) {
                    System.out.print("* ");
                } else System.out.println("*");
            }
        }
 */