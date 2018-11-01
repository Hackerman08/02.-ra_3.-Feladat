
package feladat_3;

import java.util.Scanner;


public class Feladat_3 {

    public static void main(String[] args) {
        
        
        
        
        double szam ;
        Scanner input = new Scanner(System.in);
       
        
        System.out.println("Kérem adja meg a számot");
         szam= input.nextDouble();
        
        
        int decimal = (int) szam; 
        double fractional = szam - decimal ;
        
        double a = decimal;
        double b = decimal+1;
        double c = szam;
        double closer = Math.abs(c - a) < Math.abs(c - b) ? a : b;
          System.out.println("A megadott szám a "+(decimal)+" és a "+(decimal+1)+" egész számok között van,és ezek közül a " +closer+" számhoz van közelebb.");
          System.out.println("A szám egész része: "+decimal);
          System.out.println("A szám törtrésze: "+fractional);
          
    }
    
}
