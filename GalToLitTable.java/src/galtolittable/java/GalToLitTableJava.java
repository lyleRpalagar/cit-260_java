/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package galtolittable.java;

/**
 *
 * @author admin
 */
public class GalToLitTableJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double gallons, liters;
        int counter;
        
        counter = 0; // line counter is set to zero
        
        for(gallons = 1; gallons <= 100; gallons ++){
            liters = gallons * 3.7854; // converts to liters 
            System.out.println(gallons + " gallons is " + liters + " liters.");
            
        counter++; // increment the line counter with each loop itteration.
        
        //every 10th line, print a blank line 
        if(counter == 10) { //if counter is 10 output a blank line
            System.out.println();
            counter = 0; //reset the line counter
        }
        }
    }
    
}
