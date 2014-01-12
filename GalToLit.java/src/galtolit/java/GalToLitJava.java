/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package galtolit.java;

/**
 *
 * @author admin
 */
public class GalToLitJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double gallons; //holds the number of gallons
        double liters; //holds conversions to liters
        
        gallons = 10; // start with 10 gallons
        liters = gallons * 3.7854; // convert to liters 
        
        //display
        System.out.println(gallons + " gallons is " + liters+ " liters.");
        
        
    }
    
}
