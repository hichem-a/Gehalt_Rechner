import java.util.Scanner;

public class Gehalt_Rechner {
    public static void main(String[] args) {
        double fs = 0;  // Frühschicht
        double ms = 0;  // Mittelschicht
        double ss = 0;  // Spätschicht

        Scanner input = new Scanner(System.in);

        // Eingabe der Schichtparameter
        System.out.println("Willkommen im Gehaltsrechner-Programm");
        System.out.println("Bitte geben Sie die folgenden Parameter ein:");
        System.out.println("Bitte beachten Sie: 15 Minuten entsprechen 25, 30 Minuten entsprechen 50 und 45 Minuten entsprechen 75.");



        double fsz;
        double msz;
        double ssz;

        System.out.println("Wie viele Stunden hat Ihre Frühschicht?");

            fsz = input.nextDouble();

        System.out.println("Wie viele Stunden hat Ihre Mittelschicht?");

            msz = input.nextDouble();


        System.out.println("Wie viele Stunden hat Ihre Spätschicht?");

            ssz = input.nextDouble();



        System.out.println("Geben Sie ein, wie viele Schichten Sie diesen Monat gearbeitet haben:");

        System.out.println("Wie viele Frühschichten haben Sie in diesem Monat gearbeitet?");
        do {
            fs = input.nextDouble();
        } while (fs < 0 || fs > 99.99);

        System.out.println("Wie viele Mittelschichten haben Sie in diesem Monat gearbeitet?");
        do {
            ms = input.nextDouble();
        } while (ms < 0 || ms > 99.99);

        System.out.println("Wie viele Spätschichten haben Sie in diesem Monat gearbeitet?");
        do {
            ss = input.nextDouble();
        } while (ss < 0 || ss > 99.99);

        // Verdienst pro Stunde eingeben
        System.out.println("Wie viel verdienen Sie pro Stunde?");
        double stunde = input.nextDouble();

        // Umrechnung der Schichten in finanzielle Werte
        // Diese Werte können je nach der Anzahl der gearbeiteten Stunden pro Schicht angepasst werden
        fs = fs * fsz;
        ms = ms * msz;
        ss = ss * ssz;

        // Gehalt berechnen
        double gehalt = stunde * (fs + ms + ss);

        // Ergebnis anzeigen
        System.out.println("Sie haben:");
        System.out.println("Frühschichten Stunden: " + fs + " gearbeitet");
        System.out.println("Mittelschichten Stunden: " + ms + " gearbeitet");
        System.out.println("Spätschichten Stunden: " + ss + " gearbeitet");
        System.out.println("Sie verdienen: " + stunde + " Euro pro Stunde");
        System.out.println("Ihr Gehalt beträgt " + gehalt + " Euro in diesem Monat");

        input.close();
    }
}
