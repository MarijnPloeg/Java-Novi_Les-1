package nl.novi.opdrachten.lijsten;

import java.io.*;
import java.rmi.server.ExportException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VersleutelNamenLijst {

    /**
     * Bijgevoegd is verzetsleden.txt
     * Maak een programma dat verzetsleden.txt uitleest.
     * Versleutel de namen op dezelfde manier als in GeheimeCode.java
     * En sla de versleutelde namen op in secret.txt
     */

    static void printList(List<String> laResistanceMembers) {
        int counter = 0;

        for (String name : laResistanceMembers){
            System.out.println(counter + ": " + name);
            counter++;
        }
    }
    public static void main(String[] args) throws FileNotFoundException {

        Scanner s = new Scanner(new File("verzetsleden.txt"));
        ArrayList<String> verzetsleden = new ArrayList<String>();
        while (s.hasNext()) {
            verzetsleden.add(s.next());
        }
        s.close();

        for (String memberName : verzetsleden) {
            encryptNames(memberName);
        }
        printList(verzetsleden);
    }

    public static final int NUM = 31;

    static void encryptNames(String memberName) {

        for (int i = 0; i < memberName.length(); i++) {
            int number = (memberName.charAt(i) & NUM);
            if (Character.isUpperCase(memberName.charAt(i))) {
                number += 100;
            }
            System.out.print(number);
            while (i != memberName.length() - 1) {
                System.out.print("-");
                break;
            }
        }
        System.out.println();
    }
}
