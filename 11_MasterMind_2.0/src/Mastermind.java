import java.util.Scanner;

public class Mastermind {

    private static int anzahlZuErratenenZiffern;
    private static int geheimeZahl;

    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);

        do {
            System.out.print("Wieviele Ziffern sollen erraten werden: ");
            anzahlZuErratenenZiffern = eingabe.nextInt();
        } while (anzahlZuErratenenZiffern <= 2 || anzahlZuErratenenZiffern >= 8);

        do {
            geheimeZahl = (int) (Math.random() * Math.pow(10, anzahlZuErratenenZiffern));
        } while ( istKeineGeeigneteGeheimzahl() );

        int anzahlVersuche = 0;
        boolean zahlGefunden = false;
        do {
            System.out.print("Bitte Tipp eingeben: ");
            int rateZahl = eingabe.nextInt();
            // Hintertürchen
            if (rateZahl < 0) break;
            anzahlVersuche++;
            zahlGefunden = überprüfe(rateZahl);
        } while( !zahlGefunden );

        if (zahlGefunden)
            System.out.println("Gratulation, da war die richtige Zahl!");
        else {
            System.out.println("Die gesuchte Zahl ist " + geheimeZahl);
            System.out.println("Sorry, Pech gehabt. Mehr Glück beim nächsten Mal.");
        }
        System.out.println("Sie haben " + anzahlVersuche + " Versuche gebraucht.");
    }

    public static boolean istKeineGeeigneteGeheimzahl() {
        if (geheimeZahl < (int)Math.pow(10, anzahlZuErratenenZiffern-1) ) return true;

        int anzahlVerschiedeneZiffern = 0;
        for (int ziffer = 0; ziffer < 10; ziffer++) {
            if (zifferVorhanden(ziffer))
                anzahlVerschiedeneZiffern++;
        }

        return ( anzahlVerschiedeneZiffern != anzahlZuErratenenZiffern );
    }

    // z.B. geheimeZahl = 753
    //      rateZahl    = 123
    //  erzeugt Tipp    : eine Ziffer ist korrekt

    // z.B. geheimeZahl = 753
    //      rateZahl    = 321
    //  erzeugt Tipp    : eine Ziffer ist vorhanden

    // z.B. geheimeZahl = 753
    //      rateZahl    = 531
    //  erzeugt Tipp    : zwei Ziffern sind vorhanden

    // z.B. geheimeZahl = 753
    //      rateZahl    = 723
    //  erzeugt Tipp    : zwei Ziffern sind korrekt

    // z.B. geheimeZahl = 753
    //      rateZahl    = 731
    //  erzeugt Tipp    : eine Ziffer ist korrekt, eine Ziffer ist vorhanden

    public static boolean überprüfe(int rateZahl) {
        boolean zahlenStimmenÜberein = (geheimeZahl == rateZahl);
        int kopieDerGeheimenZahl = geheimeZahl;
        int anzahlKorrekterZiffern = 0;
        int anzahlVorhandenerZiffern = 0;

        while (rateZahl > 0) {
            int zifferDerRateZahl = rateZahl % 10;
            int zifferDerGeheimenZahl = kopieDerGeheimenZahl % 10;

            if (zifferDerRateZahl == zifferDerGeheimenZahl)
                anzahlKorrekterZiffern++;
            else if (zifferVorhanden(zifferDerRateZahl))
                anzahlVorhandenerZiffern++;

            rateZahl /= 10;     // rateZahl = rateZahl / 10
            kopieDerGeheimenZahl /= 10;
        }
        System.out.println(anzahlKorrekterZiffern + " Ziffern sind korrekt");
        System.out.println(anzahlVorhandenerZiffern + " Ziffern sind vorhanden");
        return zahlenStimmenÜberein;
    }

    public static boolean zifferVorhanden(int zifferDerRateZahl) {
        int kopieDerGeheimenZahl = geheimeZahl;     // lokale Variable
        while (kopieDerGeheimenZahl > 0) {
            int zifferDerGeheimenZahl = kopieDerGeheimenZahl % 10;

            if (zifferDerRateZahl == zifferDerGeheimenZahl)
                return true;

            kopieDerGeheimenZahl /= 10;
        }
        return false;
    }
}