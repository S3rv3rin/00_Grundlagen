import java.util.Scanner;

public class MasterMind {

    public static int geheimZahl = 375, einer = geheimZahl % 10, zehner = (geheimZahl/10) % 10, hunderter = (geheimZahl/100) % 10;

    public static boolean schloss(int zahl) {
        int richtigeZiffer = 0;
        int richtigeStelle = 0;
        if (zahl == geheimZahl)
            return true;
        else {
            if (zahl % 10 == einer) richtigeStelle++;
            if (zahl % 10 == zehner) richtigeZiffer++;
            if (zahl % 10 == hunderter) richtigeZiffer++;

            if ((zahl / 10) % 10 == zehner) richtigeStelle++;
            if ((zahl / 10) % 10 == einer) richtigeZiffer++;
            if ((zahl / 10) % 10 == hunderter) richtigeZiffer++;

            if ((zahl / 100) % 10 == hunderter) richtigeStelle++;
            if ((zahl / 100) % 10 == einer) richtigeZiffer++;
            if ((zahl / 100) % 10 == zehner) richtigeZiffer++;

            if (richtigeStelle>0){
                if (richtigeStelle == 1)
                    System.out.println("Eine Zahl ist an der richtigen Stelle");
                else
                    System.out.println(richtigeStelle +" Zahlen sind an der richten Stelle");
            }
            if (richtigeZiffer > 0) {
                if (richtigeZiffer == 1)
                    System.out.println("Eine Zahl ist richtig.");
                else
                    System.out.println(richtigeZiffer +" Zahlen sind richtig.");
            }
            return false;
        }
    }

    public static void main(String[] args) {
        //        int geheimeZahl = 375;
        int tipp;
        Scanner eingabe = new Scanner(System.in);
        do {
            System.out.print("Bitte Tipp eingeben: ");
            tipp = eingabe.nextInt();
        } while ( !schloss(tipp) );
        System.out.println("Yeah, richtig geraten");

    }
}
