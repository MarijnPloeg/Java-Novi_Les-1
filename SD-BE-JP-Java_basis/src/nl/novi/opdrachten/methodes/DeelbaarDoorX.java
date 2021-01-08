package nl.novi.opdrachten.methodes;

import java.util.Scanner;

/**
 * Schrijf een methode die twee Integers ontvangt.
 * De eerste parameter heet 'number', de tweede 'divisible'
 *
 * Het is de bedoeling dat je checkt of 'number' deelbaar is door 'divisible'
 *
 * Wanneer het deelbaar is, return het volgende:
 * Het getal: %HIER GETAL% is deelbaar door %HIER DIVISIBLE%.
 * Wanneer het niet deelbaar is:
 * Het getal: %HIER GETAL% is niet deelbaar door %HIER DIVISIBLE%. Verlaag of verhoog het getal
 * %HET GETAL WAARMEE HET VERHOOGT OF VERLAAGD MOET WORDEN%
 *
 * VOORBEELD:
 *
 * De methode ontvangt de getallen 13 en 3, dan zou het resultaat moeten zijn:
 * Het getal: 13 is niet deelbaar door 3. Verlaag het getal met 1.
 *
 * VOORBEELD 2:
 * De methode ontvangt de getallen 14 en 3, dan zou het resultaat moeten zijn:
 * Het getal: 14 is niet deelbaar door 3. Verhoog het getal met 1.
 *
 */

public class DeelbaarDoorX {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geef twee getallen: ");
        int getal1 = input.nextInt();
        int getal2 = input.nextInt();
        deelbaar(getal1, getal2);
    }

    static void deelbaar(int number, int divisible){
        int result = number / divisible;

        int closestDivisibleDown = number - (number % divisible);
        int closestDivisbleUp = (number + divisible) - (number % divisible);

        int verlagingsGetal = number - closestDivisibleDown;
        int verhogingsGetal = closestDivisbleUp - number ;


        if (result % 1 != 0){
            System.out.println("Het getal " + number + " is deelbaar door " + divisible);
        }
        else {
            if (verhogingsGetal > verlagingsGetal) {
                System.out.println("Het getal " + number + " is niet deelbaar door " + divisible + ". Verlaag het getal met " + verlagingsGetal);
            }
            else if (verhogingsGetal < verlagingsGetal){
                System.out.println("Het getal " + number + " is niet deelbaar door " + divisible + ". Verhoog het getal met " + verhogingsGetal);
            }
        }


    }
}
