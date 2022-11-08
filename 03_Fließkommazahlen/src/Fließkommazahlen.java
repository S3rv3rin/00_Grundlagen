public class Fließkommazahlen {
    public static void main(String[] args) {

        /**  Java will aus floats immer einen double machen.
         *    float meineFließkommaZahl = 3.1415;
         *     Diese syntaktisch richtige Codezeile wirft Java als fehlerhaft aus.
         *   3 Lösungen:
         *       - double x = 3.1415;        => Ist aber eine Problemverschiebung, weil es später bei anderen Floats zu Problemen kommen kann,
         *       - float x = 3.1415F         => Bei dem nachgestellten "f" ist die Groß/Kleinschreibung egal => Lieber Groß, um von Hex-Zahlen zu unterscheiden.
         *       - float x = (float) 3.1415; => eplizite Typenkonvertierung =>   Man zwingt Java dazu, die Zahl als Float zu interpretieren.
         *                                                                       schon galanter, aber nicht optimal
         *       - float x = 3               => implizite Typenkonvertierung =>  Die 3 wird als Integer interpretiert. Ein Integer passt in einen Float.
         *                                                                       Für den Compiler ist somit alles in Ordnung.
         */
        float meineFließkommaZahl = 3.1415F;
        System.out.println("meineFließkommaZahl\t" + meineFließkommaZahl);

        /**
         *  Bei der Berechnung zweier Zahlen schaut Java immer, was es für eine Zahl ist, bzw, zu welchem Zahlentyp die jeweilige Zahl gehört.
         *  Bei der Berechnung "double x = 1 / 2;" wird die Variable "x" als Double erstellt und mit den beiden Zahlen 1 und 2 berechnet.
         *  1 und 2 sind aber für Java Integer, somit werden sie auch so interpretiert, da durch die implizite Konvertierung ein Int in ein Double passt.
         *  Bei Integern gibt es aber keine Nachkommastellen. Somit ist das Ergebnis der Division 1 / 2 = 0.
         *  Man muss also den Dividend oder den Divisor als Float kennzeichnen, da dann die Berechnung mit Nachkommastellen durchgeführt wird.
         */
        double ergebnisInteger = 1 / 2;
        System.out.println("ergebnisInteger\t\t\t" + ergebnisInteger);
        double ergebnisDouble = 1F / 2;
        System.out.println("ergebnisDouble\t\t\t" + ergebnisDouble);

        /**
         *  float einZehntel = 0.1F * 10_000_000_000;
         *  führt zu einem Fehler, da die Zahl 10_000_000_000 nicht in den Zahlenbereich Int passt. Maximale Zahl mit Vorzeichen ist 2.147.483.648
         *  Also muss die Zahl durch die explizite Konvertierung in ein Long konvertiert werden.
         */
        float einZehntel = 0.1F * 10_000_000_000L;
        System.out.println("einZehntel\t\t\t\t" + einZehntel);

        /**
         * Floats sind immer ungenauer als Double, da ein Double mehr Kommastellen zur Annäherung hat.
         * Deshalb will Java bei Kommazahlen immer mit Double rechnen, da die Ergebnisse genauer sind.
         * Wenn man mit Exponentialzahlen von 2 rechnet, ist es egal.
         */
        float einzelWert = 0.1F;
        float summenWert = 0.0F;
        // Zählschleifen, da wir die Anzahl Wiederholungen vorher kennen
        for (int i = 0 ; i < 10_000_000 ; i ++) {
            summenWert += einzelWert;
        }
        System.out.println("summenWert\t\t\t\t" + summenWert);

        double einzelWertDouble = 0.1;
        double summenWertDouble = 0.0;
        // Zählschleifen, da wir die Anzahl Wiederholungen vorher kennen
        for (int i = 0 ; i < 10_000_000 ; i ++) {
            summenWertDouble += einzelWertDouble;
        }
        System.out.println("summenWertDouble\t\t" + summenWertDouble);

        float zweiterEinzelWert = 0.125F;
        float zweiterSummenWert = 0.0F;
        // Zählschleifen, da wir die Anzahl Wiederholungen vorher kennen
        for (int i = 0 ; i < 10_000_000 ; i ++) {
            zweiterSummenWert += zweiterEinzelWert;
        }
        System.out.println("zweiterSummenWert\t\t" + zweiterSummenWert);
    }
}
