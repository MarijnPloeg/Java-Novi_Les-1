package nl.novi.opdrachten.lijsten;

import java.util.ArrayList;
import java.util.List;

public class GeheimeCode {

    public static void main(String[] secret) {

        List<String> laResistanceMembers = new ArrayList<>();

        laResistanceMembers = addMembers(laResistanceMembers, "Alex");
        laResistanceMembers = addMembers(laResistanceMembers, "Arie");
        laResistanceMembers = addMembers(laResistanceMembers, "Sjaak");
        laResistanceMembers = addMembers(laResistanceMembers, "Henrie");
        laResistanceMembers = addMembers(laResistanceMembers, "Piet");
        laResistanceMembers = addMembers(laResistanceMembers, "LeDroitCestMoi");

        /*
        Opdracht 1: Hierboven zijn via de methode addMembers, leden aan de lijst toegevoegd. Pas de Methode zo aan dat
         er alleen unieke namen in voor mogen komen.
         */



        /*
        Opdracht 2: La Resistance wil niet dat de lijst met namen zo in handen komt te vallen van de bezetter. Versleutel
        Maak een methode die de lijst op de volgende manier versleuteld:
        a) Verander elke letter naar het nummer in het alfabet. Voeg na elke veranderde letter een - toe
        (behalve de laatste). Dus a wordt 1, b wordt 2 et cetera.
        Wanneer een letter een hoofdletter is, moet je beginnen met tellen bij 100. Dus A wordt 101, B wordt 102.
        Voorbeeld: Alex wordt versleuteld naar: 101-12-5-24
        b) Als de positie in de lijst een even getal is, dan moet de cijfercombinatie omgedraaid worden.
         */

        for (String memberName : laResistanceMembers) {
            encryptNames(memberName);
        }

        /*
        Opdracht 3:
        Schrijf een methode die de versleutelde lijst kan omzetten naar de ontsleutelde lijst.
         */


    }

    public static final int NUM = 31;

    static void printList(List<String> laResistanceMembers) {
        int counter = 0;

        for (String name : laResistanceMembers){
            System.out.println(counter + ": " + name);
            counter++;
        }
    }

    static void encryptNames(String memberName){

        for (int i = 0; i < memberName.length(); i++) {
            int number = (memberName.charAt(i) & NUM);
            if(Character.isUpperCase(memberName.charAt(i))){
                number += 100;
            }
            System.out.print(number);
            while (i != memberName.length() - 1){
                System.out.print("-");
                break;
            }
        }
        System.out.println();

    }

    private static List<String> addMembers(List<String> members, String name) {
        while(!members.contains(name)){
            members.add(name);
            break;
        }
        return members;
    }
}
