/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chapter3b;

/**
 *
 * @author admin
 */
public class Chapter3b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws java.io.IOException {
        // TODO code application logic here
        // Guess the letter game.
       char ch, answer = 'K';
       
       System.out.println("I'm thinking of a letter between A and Z.");
       System.out.print("Can you guess it: ");
       
       ch = (char) System.in.read(); //read a char from the keyboard
       if(ch == answer) System.out.println("** Right **"); //(IF the statement is true)
       else System.out.println("....Sorry, you're wrong."); // (Else if the statement is false)
    }
    
}
