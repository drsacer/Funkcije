package Funkcije;

import java.util.Scanner;

public class Kruznica {

    static Scanner s = new Scanner (System.in);

    public static void main(String[] args) {

        System.out.println("Unesite polumjer kružnice:");
        float r = s.nextFloat();

        System.out.println("Opseg ili površina kružnica ?  O/P");
        String unos = s.next();

        switch (unos){
            case "O":
                double rr = s.nextDouble();
                izracunajOpseg(rr);   //  šaljemo double rr pa se pokreće funkcija static void izracunajOpseg(double r)
                break;
            case "P":
                System.out.println(izracunajPovrsinu(r));
                break;
            default:
                System.out.println("Krivi odabir");
        }
    }

    static float izracunajPovrsinu(float r){
        float pov = (float) (r*r*Math.PI);
        return pov;
    }

    static float izracunajPovrsinu(float r, double pi){
        return (float)(r*r*Math.PI);
    }

    // u potpis metode ide ime metode i argumenti

    static void izracunajOpseg(float r){
        float opseg = (float) (2*r*Math.PI);
        System.out.println("FLOAT - OPSEG:" + opseg);
    }

    static void izracunajOpseg(double r){
        float opseg = (float) (2*r*Math.PI);
        System.out.println("DOUBLE - OPSEG:" + opseg);
    }
}
