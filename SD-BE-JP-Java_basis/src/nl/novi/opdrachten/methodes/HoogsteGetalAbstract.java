package nl.novi.opdrachten.methodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Schrijf een methode  die een List<Integer> ontvangt.
 *
 * Wanneer er twee getallen of meer in zijn:
 * Return het volgende:
 * "Het hoogste getal van de gegeven getallen is: %GETAL%"
 *
 * Je mag hier geen Collections.sort of java.streams gebruiken.
 *
 */
public class HoogsteGetalAbstract {

    public static void main(String[] args) {
        List<Integer> getallen = new ArrayList<Integer>();
        getallen.add(52);
        getallen.add(24);
        getallen.add(532);

        vindHoogste(getallen);
    }



    static void vindHoogste(List<Integer> getallen){
        int aantalGetallen = getallen.size();
        if (aantalGetallen > 1){
            System.out.println("Het hoogste getal van de gegeven getallen is: " + Collections.max(getallen));
        }
        else{
            System.out.println("Er zitten niet genoeg getallen in de list!");
        }
    }
}

