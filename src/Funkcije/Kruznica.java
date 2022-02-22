package Funkcije;

import java.util.Scanner;

public class Kruznica {

    static Scanner s = new Scanner (System.in);

    public static void main(String[] args) {

        izracunajPovrsinu();
        izracunajOpseg();
    }

    static void izracunajPovrsinu(){
        System.out.println("Unesite polumjer kružnice:");
        float r = s.nextFloat();
        float pov = (float) (r*r*Math.PI);
        System.out.println("POV:" + pov);
    }
    static void izracunajOpseg(){
        System.out.println("Unesite polumjer kružnice:");
        float r = s.nextFloat();
        float opseg = (float) (2*r*Math.PI);
        System.out.println("OPSEG:" + opseg);
    }
}
