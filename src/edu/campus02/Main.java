package edu.campus02;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // neue Übung

        int preis;
        int steuerKlasse;
        int steuerKlasse1;
        int steuerKlasse2;
        int steuerKlasse3;
        int total;


        preis = 200;
        steuerKlasse1 = 20;
        steuerKlasse2 = 16;
        steuerKlasse3 = 8;
        steuerKlasse = steuerKlasse2;

        if (steuerKlasse == steuerKlasse1)
            total = preis + ( preis * steuerKlasse1 / 100);
        else if ( steuerKlasse == steuerKlasse2)
            total = preis + ( preis * steuerKlasse2 / 100 );
        else
            total = preis + ( preis * steuerKlasse3 / 100);

        System.out.println( "Total Preis: " + total);

    }
}
