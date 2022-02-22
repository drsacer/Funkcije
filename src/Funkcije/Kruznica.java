package Funkcije;

import java.util.Scanner;

public class Kruznica {

    static Scanner s = new Scanner (System.in);

    public static void main(String[] args) {

        System.out.println("Unesite polumjer kružnice:");
        float r = s.nextFloat();

        System.out.println("POV:" + izracunajPovrsinu(r));
        float pov = izracunajPovrsinu(r);
        System.out.println(pov);

        izracunajOpseg(r);
    }

    static float izracunajPovrsinu(float r){
        float pov = (float) (r*r*Math.PI);
        return pov;
    }

    static void izracunajOpseg(float r){
        float opseg = (float) (2*r*Math.PI);
        System.out.println("OPSEG:" + opseg);
    }
}
