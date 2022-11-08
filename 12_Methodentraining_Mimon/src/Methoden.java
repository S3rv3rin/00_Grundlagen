import java.util.Scanner;

public class Methoden {

    //Methode quadriert!

    public static int quadriere(int q){
        return q = q * q;
    }

    //Methode berechnet Fakultät!
    public static int fakultät(int fa){
        int x = fa;
        int y = fa -1;
        do {
            x = x * y;
            y = y-1;
        } while (y>1);
        return x;
    }

    //Methode berechnet Fibonaccizahl!
    public static int fibonacci(int fi){
        
        return fi = (fi * 2) - 3;
    }

    public static void main(String[] args) {
        //Eingabeaufforderung
        Scanner eingabe = new Scanner(System.in);

        System.out.println("Wählen Sie eine Berechnungsmethode aus: ");
        System.out.println("Für Berechnung    e²       wählen Sie -  1 ");
        System.out.println("Für Berechnung  Fakultät   wählen Sie -  2 ");
        System.out.println("Für Berechnung  Fibonacci  wählen Sie -  3 ");
        System.out.print("Eingabe: ");

        int auswahl = eingabe.nextInt();

        //Abfangschleife
        if (auswahl > 3) {
            do {
                System.out.println("Eingabe falsch - nur Bereich 1-3 möglich!!!");
                System.out.print("Erneute Eingabe: ");
                int auswahl2 = eingabe.nextInt();
                auswahl = auswahl2;
            } while (auswahl > 3);
        }
        int a = 1; //Variablenwert für Eingabewert "1"
        int b = 2; //Variablenwert für Eingabewert "2"
        int c = 3; //Variablenwert für Eingabewert "3"

        //Eingabewert mit Variablenwert vergleichen und Methodenaufruf
        if (auswahl == a) {
            System.out.println("Für Berechnung e² bitte Zahl eingeben!: ");
            int q = eingabe.nextInt();
            quadriere(q);
            System.out.println("Ihr Ergebnis lautet "+quadriere(q));
        }else if (auswahl == b) {
            System.out.println("Für Berechnung der Fakultät bitte Zahl eingeben!: ");
            int fa = eingabe.nextInt();
            fakultät(fa);
            System.out.println("Ihr Ergebnis lautet "+fakultät(fa));
        }else if (auswahl == c) {
            System.out.println("Für Berechnung der Fibonaccizahl bitte Zahl eingeben!: ");
            int fi = eingabe.nextInt();
            fibonacci(fi);
            System.out.println("Ihr Ergebnis lautet "+fibonacci(fi));
        } else System.out.println("Sie haben die `0` gewählt, das macht kein Sinn");
    }
}