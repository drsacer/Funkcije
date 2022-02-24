package Kruznica;

import java.util.Scanner;

public class Kruznica {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Unesite polumjer kružnice:");
        float r = s.nextFloat();

        izracunajPovrsinu(r);
        izracunajPovrsinu(r, Math.PI);
        izracunajPovrsinu(r, Math.PI, "Circle");
        System.out.println(izracunajOpseg(r));
    }

    public static void izracunajPovrsinu(float r){
        float p =  (float) (r * r * Math.PI);
        System.out.println("Površina:" + p);
    }

    public static void izracunajPovrsinu(float r, double pi){
        float p =  (float) (r * r * pi);
        System.out.println("Površina:" + p);
    }

    public static int izracunajPovrsinu(float r, double pi, String name){
        float p =  (float) (r * r * pi);
        System.out.println("Površina:" + p);
        return 10;
    }
    public static float izracunajOpseg(float r){
        float o =  (float) (2 * r * Math.PI);
        return o;
    }

}
