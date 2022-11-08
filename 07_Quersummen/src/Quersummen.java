import java.util.Scanner;

public class Quersummen {
    // Musterlösung
    public static void main(String[] args) {

        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte Zahl >=1000 und <=9999 eingeben:");
        int zahl = eingabe.nextInt();

        int summe = 0;
        while (zahl > 0) {
            int ziffer = zahl % 10;
            summe = summe + ziffer;
            System.out.print(ziffer);
            zahl =zahl / 10;
            if (zahl > 0) System.out.print(" + ");
        }
        System.out.println(" = " + summe);
    }
/*
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte Zahl >=1000 und <=9999 eingeben:");
        int zahl = eingabe.nextInt();
        if (zahl > 9999) zahl = 9999;
        else if (zahl < 1000) zahl = 1000;
        int zahl2 = zahl; // ist nur zum zwischen Speichern der Zahl für den unteren Kot
        int teiler;
        int a;
        int b = 0;
        for (teiler = 1000; teiler>=1 ; teiler = teiler/10){
            a = zahl / teiler;
            zahl = zahl % teiler;
            b = b + a;
            System.out.print(a);
            if (teiler >=10 ) System.out.print("+");
        }
        System.out.print("="+b);


        System.out.println();
        System.out.println();


        teiler = 1000;
        int i = zahl2 / teiler;
        zahl2 = zahl2 % teiler;
        teiler = teiler /10;

        int j = zahl2 / teiler;
        zahl2 = zahl2 % teiler;
        teiler = teiler /10;

        int k = zahl2 / teiler;
        zahl2 = zahl2 % teiler;
        teiler = teiler /10;

        int l = zahl2 / teiler;
        zahl2 = zahl2 % teiler;

        b = i+j+k+l;
        System.out.println(l + "+" + k + "+" + j + "+" + i + "=" + b);

    }

 */
}


