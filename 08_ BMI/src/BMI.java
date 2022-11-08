import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.print("Bitte Name eingeben:");
        String name = eingabe.nextLine();
        System.out.print("Bitte Geburtstag eingeben:");
        int geburtsjahr = eingabe.nextInt();
        System.out.print("Bitte Größe in Meter eingeben:");
        double groesse = eingabe.nextDouble();
        System.out.print("Bitte Gewicht eingeben:");
        double gewicht = eingabe.nextDouble();

        System.out.println();
        System.out.println();


        System.out.println("Ihr Name ist "+name+".");
        int alter = 2021 - geburtsjahr;
        System.out.println("Sie sind " + alter + " Jahre alt.");
        System.out.println("Sie sind " + groesse + "m groß");
        System.out.println("und wiegen " + gewicht + "Kg.");
        double bmi = gewicht /(groesse * groesse);

        System.out.println("Ihr BMI ist " + bmi + ",");
        System.out.print("was bedeutet, sie sind ");
        if (bmi <= 20) System.out.print("zu dünn.");
        else if ( bmi <= 25)  System.out.print("normalgewichtig.");
        else if ( bmi <= 30)  System.out.print("kräftig.");
        else System.out.print("übergewichtig.");
    }
}
