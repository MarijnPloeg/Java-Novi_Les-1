package nl.novi.opdrachten.methodes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Gegeven: een lijst met namen zonder hoofdletters van klanten.
 * Opdracht: Een luie stagiair heeft alle klanten in het systeem gezet, maar deze kon de Shift-knop niet vinden.
 * Het is aan jou om alle namen van een hoofdletter aan het begin te voorzien. Maak een methode die een List als
 * parameter ontvangt en de inhoud vervolgens van hoofdletters voorziet.
 *
 * Bonus 1: Zorg ervoor dat tussenvoegsels geen hoofdletter krijgen.
 * Bonus 2: Zorg ervoor dat de eerste letter na een '-' wel een hoofdletter krijgt.
 *
 *
 */

public class Hoofdletters {

    public static void main(String[] args) {
        List<String> curstomerNames = new ArrayList<>();

        curstomerNames.add("nick piraat");
        curstomerNames.add("michael jackson");
        curstomerNames.add("glennis grace");
        curstomerNames.add("dreetje hazes");
        curstomerNames.add("robbie williams");
        curstomerNames.add("michiel de ruyter");
        curstomerNames.add("sjaak polak");
        curstomerNames.add("jan van jansen");
        curstomerNames.add("henk den hartog");
        curstomerNames.add("mo el-mecky");
        curstomerNames.add("fredje kadetje");

        hoofdletterGenerator(curstomerNames);
    }

    static void hoofdletterGenerator(List<String> customerNames){

        //Bonus: Niet super content met de manier, maar het werkt :-)
        for(String name : customerNames){
            int firstSpace = name.indexOf(" ");
            int dashLocation = name.indexOf("-");
            String firstLetter = name.substring(0, 1).toUpperCase();
            String firstName = name.substring(1, name.lastIndexOf(" "));
            String lastLetter = name.substring(name.lastIndexOf(" ") + 1, name.lastIndexOf(" ") + 2).toUpperCase();
            String lastName = name.substring(name.lastIndexOf(" ")+ 2);
            if (name.contains("-")){
                lastLetter.toLowerCase();
                lastLetter = name.substring(dashLocation + 1, dashLocation + 2).toUpperCase();
                lastName = name.substring(name.lastIndexOf("-")+ 2);
                String beforeDash = name.substring(name.lastIndexOf(" ") + 1, name.lastIndexOf("-")).toUpperCase();
                System.out.println(firstLetter + firstName + " " + beforeDash.toLowerCase() + "-" + lastLetter + lastName);;
            }
            System.out.println(firstLetter + firstName + " " + lastLetter + lastName);
        }


        // Deze manier maakt alleen hoofdletters na een spatie
        for (int index = 0; index < customerNames.size(); index++) {
            String name = customerNames.get(index);
            String[] names = name.split("\\s+");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < names.length; i++) {
                if (i != 0) {
                    sb.append(' ');
                }
                sb.append(Character.toUpperCase(names[i].charAt(0)));
                sb.append(names[i].substring(1).toLowerCase());
            }
            customerNames.set(index, sb.toString());
        }
        System.out.println(customerNames);
    }
}
