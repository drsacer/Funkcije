package SwitchFunkcije;

import java.util.Scanner;

public class Switch {

    static int opseg = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c, d, e;

        System.out.println("unesite broj kuteva: 3,4,5");
        int brojKuteva = s.nextInt();

        System.out.println("Stranica a:");
        a = s.nextInt();
        System.out.println("Stranica b:");
        b = s.nextInt();
        System.out.println("Stranica c:");
        c = s.nextInt();

        switch (brojKuteva) {
            case 3:
                izracunajOpsegMnogokuta(a, b, c);
                break;
            case 4:
                System.out.println("Stranica d:");
                d = s.nextInt();
                System.out.println(izracunajOpsegMnogokuta(a, b, c, d));
                break;
            case 5:
                System.out.println("Stranica d:");
                d = s.nextInt();
                System.out.println("Stranica e:");
                e = s.nextInt();
                System.out.println(izracunajOpsegMnogokuta(a, b, c, d));
                break;
            default:
                System.out.println("Krivi odabir");
        }
    }


    public static void izracunajOpsegMnogokuta(int a, int b, int c) {
        opseg = a + b + c;
        System.out.println("Opseg trokuta:" + opseg);
    }

    public static int izracunajOpsegMnogokuta(int a, int b, int c, int d) {
        opseg = a + b + c + d;
        System.out.println("Opseg četverokuta:" + opseg);
        return opseg;
    }

    public static int izracunajOpsegMnogokuta(int a, int b, int c, int d, int e) {
        opseg = a + b + c + d + e;
        return opseg;
    }
}
