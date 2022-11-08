import java.util.Scanner;

public class Schachbrett {
    public static void main(String[] args) {
        // Eingabe:
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte Zeilenanzahl eingeben: ");
        int zeilenAnzahl = eingabe.nextInt();
        // Verarbeitung:
        for (int zeile = 1; zeile <= zeilenAnzahl; zeile++) {
            int spalte = zeilenAnzahl;
            for (int zahl = zeile;spalte>0; zahl++,spalte--) {
                // Ausgabe:
                if (zahl<10) System.out.print(" ");
                System.out.print(" "+zahl);
            }
            System.out.println();
        }
    }
}