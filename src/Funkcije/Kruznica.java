package Funkcije;

import java.util.Scanner;

public class Kruznica {

    static Scanner s = new Scanner (System.in);

    public static void main(String[] args) {

        System.out.println("Unesite polumjer kružnice:");
        float r = s.nextFloat();

        izracunajPovrsinu(r);
        izracunajOpseg(r);
    }

    static void izracunajPovrsinu(float r){
        float pov = (float) (r*r*Math.PI);
        System.out.println("POV:" + pov);
    }

    static void izracunajOpseg(float r){
        float opseg = (float) (2*r*Math.PI);
        System.out.println("OPSEG:" + opseg);
    }
}
