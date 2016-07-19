package loopyplanettress;

import javax.swing.JOptionPane;
import java.util.Scanner;
import java.awt.Dialog;
import java.util.Arrays;
/**
 *
 * @author Tress Idehen
 */
public class LoopyPlanetTress {

    static Scanner user_input = new Scanner(System.in);
    
    static int planet_select;
    static double user_weight;
    static double answer;
    
    static String intro = "Wecome to My Loopy Planet Game";
     static  String intro_one = "Please Enter a value From 1 to 8 of Your Planet of Choice, or enter 9 to exit the program";   
      static String[] planet = {
          "Menu",
          " Mercury",
          " Jupiter", 
          " Mars",
          " Neptune",
          " Venus", 
          " Uranus",
          " Saturn",
          " Pluto",
          " Quit"};
     static  double []weight = {0.00, 0.37, 2.64, 0.38, 1.12, 0.88, 1.15, 1.15, 0.04};
    
    
        
    public static void main(String[] args) {
       
    System.out.println(intro);
        System.out.println(intro_one);
        System.out.println(Arrays.toString(planet)); 
        
              
//        JOptionPane.showMessageDialog(null, intro);
//        JOptionPane.showMessageDialog(null, intro_one);
//        JOptionPane.showMessageDialog(null, planet);
//        JOptionPane.showInputDialog(null,planet_select);
        
        
        
        
        
        
        
        
        
        
        planet_select = user_input.nextInt(); 
                
        switch (planet_select){
            case 1:
                System.out.println("You Selected " + planet[1]);
                break;
        
            case 2:
                System.out.println("You Selected " + planet[2]);
                break;
                
            case 3:
                System.out.println("You Selected " + planet[3]);
                break;
                
            case 4:
                System.out.println("You Selected " + planet[4]);               
                break;
                
            case 5:
                System.out.println("You Selected " + planet[5]);
                break;
                
            case 6:
                System.out.println("You Selected " + planet[6]);
                break;
                
            case 7:
                System.out.println("You Selected " + planet[7]);
                break;
                
            case 8:
                System.out.println("You Selected " + planet[8]);
                break;
                
            case 9:
                System.exit(0);
                break;
            default:
                System.out.println("Please enter a recognizable value");
                System.exit(0);
        } 
        System.out.println("What is your current weight on earth? ");
        user_weight = user_input.nextDouble();
        System.out.println("Your weight of " + user_weight + " on earth, on " + planet[planet_select] + " would be: ");
        answer = weight[planet_select] * user_weight;
        System.out.println(answer);
    System.exit(0);  
         
           
        
    }
    
}
