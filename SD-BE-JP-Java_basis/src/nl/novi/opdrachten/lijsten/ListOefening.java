package nl.novi.opdrachten.lijsten;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOefening {

    static void printList(List<String> clubNames) {
        int counter = 0;

        for (String name : clubNames){
            System.out.println(counter + ": " + name);
            counter++;
        }
    }

    static void printPosition(List<String> clubNames, int positie){
        System.out.println(clubNames.get(positie));
    }

    static int clubPosition(List<String> clubNames, String clubName){
        return clubNames.indexOf(clubName);
    }

    static void sortList(List<String> clubNames){
        java.util.Collections.sort(clubNames);
    }

    public static void main(String[] uitlegList) {

        Scanner input = new Scanner(System.in);
        //We hebben een list die de namen van voetbalclubs bevat
        List<String> clubNames = new ArrayList<>();
        //Die vullen we alvast voor de opdracht
        clubNames.add("Ajax");
        clubNames.add("PSV");
        clubNames.add("Feyenoord");
        clubNames.add("Fc Utrecht");
        clubNames.add("Fc Groningen");
        clubNames.add("FC Twente");

        // Vraag -1: Maak een methode die al taak heeft om de list per regel uit te printen.

        printList(clubNames);


        // Vraag 0: Maak een methode die als taak heeft om de list uit te printen: positie + inhoud.

        System.out.println("Kies uit de lijst een positie waarvan u de naam wilt weten");
        int positie = input.nextInt();

        printPosition(clubNames, positie);

        // Bovenstaande list zou dan dit zijn:
        // 0 - Ajax
        // 1 - PSv
        // etc...

        // Vraag 1: Maak een methode die checkt of een club al in de lijst zit en voeg deze anders toe.
        System.out.println("Noem de naam van een voetbal club: ");
        String clubName = input.next();


        if (clubNames.contains(clubName)){
            System.out.println("Deze club staat al in de lijst!");
        }
        else if (!clubNames.contains(clubName)){
            clubNames.add(clubName);
            System.out.println("De club " + clubName + " is toegevoegd aan de lijst:");
            printList(clubNames);
        }

        // Vraag 2: Maak een methode die de positie van de club in de lijst teruggeeft.
        System.out.print("Noem de naam van de club waarvan je de positie wilt weten: ");
        String inClubNaam = input.next();

        System.out.println("De positie van de club is: " + clubPosition(clubNames, inClubNaam));


        // Vraag 3: Maak een methode die de lijst alfabetisch sorteert. Wanneer Ajax niet op positie 1 staat, moeten de
        // clubs die voor Ajax staan verwijderd worden.
        // We voegen nog wat clubs toe om de code te kunnen testen.
        clubNames.add("AA Aachen");
        clubNames.add("AFC Amsterdam");
        clubNames.add("AFC");

        sortList(clubNames);
        printList(clubNames);

        int ajax = clubNames.indexOf("Ajax");

        if (clubNames.get(1) != "Ajax"){
            clubNames.subList(1, ajax).clear();
            System.out.println("De lijst is aangepast en Ajax staat weer op positie 1: ");
            printList(clubNames);
        }
        else if(clubNames.get(1) == "Ajax") {
            System.out.println("Ajax staat al op positie 1!");
            printList(clubNames);
        }

        // Vraag 4: Kun je hetzelfde doen als hierboven, maar PSV moet dan laatste zijn.
        clubNames.add("Zlotty FC");
        clubNames.add("SC Eindhoven");

        sortList(clubNames);
        printList(clubNames);

        int psv = clubNames.indexOf("PSV");


        if (psv > -1){
            clubNames.subList(psv + 1, clubNames.size()).clear();
            System.out.println("De lijst is aangepast en PSV staat weer als laatste: ");
            printList(clubNames);
        }
        else{
            System.out.println("PSV staat al als laatste op de lijst!");
        }


    }

}
