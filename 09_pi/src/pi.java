import java.text.DecimalFormat;
import java.util.Scanner;

public class pi {
    public static void main(String[] args) {
        // Eingabe:
        System.out.println("Bitte einen Radius in cm eingeben:");
        Scanner eingabe = new Scanner(System.in);
        double r = eingabe.nextDouble();
        // Verarbeitung:
        DecimalFormat x = new DecimalFormat("0.00");
        double pi = (Math.PI);
        double a = pi * r * r;
        double u = 2 * pi * r;
        double v = 4/3D * pi * Math.pow(r, 3); // 4/3D => 3D, damit die 4/3 nicht als Integer, sondern als Double gesehen werden!
        // Ausgabe:
        System.out.println("Die Kreisfläche beträgt: "+ x.format(a) + " cm².");
        System.out.println("Der Kreisumfang beträgt: "+ x.format(u) + " cm.");
        System.out.println("Das Kugelvolumen beträgt: "+ x.format(v) + " cm³.");
    }
}