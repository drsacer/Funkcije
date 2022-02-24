package FunkcijeFaktorijelaRandom;

import java.util.Scanner;

public class FunRandomFakt {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Odaberite: F - faktorijela, R - random broj ");
        String odabir = s.next();

        switch (odabir) {
            case "F":
                System.out.println("Unesite broj:");
                int number = s.nextInt();
                System.out.println("Faktorijela broja " + number + " iznosi " + calculateFaktorijela(number));
                break;
            case "R":
                int randomBroj = (int) (Math.random() * 100);
                System.out.println("Trebalo vam je " + guessRandomNumber(randomBroj) + " pokušaja");
                break;
            default:
                System.out.println("Krivi odabir");
        }
    }

    public static int calculateFaktorijela(int num) {
        int niz = 1;
        for (int i = 1; i <= num; i++) {
            niz *= i;
        }
        return niz;
    }

    public static int guessRandomNumber(int randomBroj) {
        int brojac = 0;
        int mojBroj = -1;
        while (mojBroj != randomBroj) {
            System.out.println("Unesite broj:");
            mojBroj = s.nextInt();

            if (mojBroj > randomBroj) System.out.println("Broj je prevelik");
            else if (mojBroj < randomBroj) System.out.println("Broj je premali");
            else System.out.println("Pogodak");
            brojac++;
        }
        return brojac;
    }
}
