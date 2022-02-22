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
                izracunajOpseg(r);
                break;
            case "P":
                System.out.println(izracunajPovrsinu(r));
                break;
            default:
                System.out.println("Krivi odabir");
        }

     /*   System.out.println("POV:" + izracunajPovrsinu(r));
        float pov = izracunajPovrsinu(r);
        System.out.println("POV:" + pov);

        System.out.println("POV1:" + izracunajPovrsinu(r,Math.PI));

        izracunajOpseg(r);*/
    }

    static float izracunajPovrsinu(float r){
        float pov = (float) (r*r*Math.PI);
        return pov;
    }

    static float izracunajPovrsinu(float r, double pi){
        return (float)(r*r*Math.PI);
    }

    /* static double izracunajPovrsinu(float r, double pi){
        return (float)(r*r*Math.PI);
    }
    u potpis metode ide ime metode i argumenti*/

    static void izracunajOpseg(float r){
        float opseg = (float) (2*r*Math.PI);
        System.out.println("OPSEG:" + opseg);
    }
}
