import java.util.Scanner;

public class Methodentraining {

    public static int quadratZahl(int zahl){
        int quadrat = zahl * zahl;
        return quadrat;
    }

    public static int fakultaet(int counter){
        int ergebnis = 1;
        do {
            ergebnis = ergebnis * counter;
            counter--;
        } while (counter > 0);
        return ergebnis;
    }
    public static int fakultaet2(int n){
        if (n <= 0) return 1;                              //  <-  Terminierung der Rekursion => Sonst Endlos => StackOverflow
        return n = n * fakultaet2 (n-1);                //  <-  Selbstaufruf! Rekursion
    }

    public static int fibonacci(int fibonaccistelle){
        int a = 0, b = 1, fibonaccizahl;
        for (int counter = 1; counter <= fibonaccistelle; counter++ ){
            fibonaccizahl = a + b;
            b = a;
            a = fibonaccizahl;
        }
        if (a > b) return a;
        else return b;
    }
    public static int fibonacci2(double n){
        double goldenRatio = 1.618034;
        n = (Math.pow(goldenRatio, n) - Math.pow( (1 - goldenRatio), n))/(Math.sqrt(5));
        return (int)n;
    }

    public static int fibonacci3(int fi){
        if (fi < 3) return 1;
        return fibonacci3(fi - 1) + fibonacci3(fi - 2);
    }

    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        while (true){
            System.out.print("Ganzzahl eingeben: ");
            int zahl = eingabe.nextInt();
            System.out.println("Was soll berechnet werden? Zum Abbruch 0 eingeben");
            System.out.println("1 = Quadratzahl");
            System.out.println("2 = Fakultät");
            System.out.println("3 = Fibonacci");
            int auswahl = eingabe.nextInt();
            if (auswahl == 1)
                System.out.println("Das Quadrat von "+zahl+" = "+ quadratZahl(zahl));
            else if (auswahl == 2)
                System.out.println(zahl +" Fakultät ist " + fakultaet(zahl) +"     zweite Methode "+ fakultaet2(zahl) );
            else if (auswahl == 3) {
                System.out.println("Die " + zahl + ". Stelle der Fibonaccifolge ist:");
                System.out.println("Erste Methode " + fibonacci(zahl));
                System.out.println("Zweite Methode " + fibonacci2(zahl));
                System.out.println("Dritte Methode " + fibonacci3(zahl));
            }
            else break;
        }
    }
}
