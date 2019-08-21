/**********************************************************************
* Program:          PRG/420 Week 2 
* Purpose:          Week 2 Coding Assignment
* Programmer:       Veselin Miskeljin         
* Class:            PRG/420       
* Creation Date:    08/21/2019
*********************************************************************
*
**********************************************************************
*  Program Summary: This program demonstrates these basic Java concepts:
*                           - defining variables of different types
*                           - if-then and if-then-else logic
*                           - constructing a string to display onscreen
*                           - switch logic
*
* To complete this assignment, you will add code where indicated. The
* behavior of your completed assignment should be to accept an input
* value for the number of sides of a two-dimensional figure. Based on that value, 
* your code should display the type of figure that corresponds to the number of polygon angles
* indicated (3=triangle, 4=rectangle, etc.)
*
* Here are the specific requirements:
*
* After the user types in a value from 3 to 5 inclusive (i.e., 3, 4, or 5):
*
* 1. Your code determines whether the input value is out of range (less than 3 or more than 5)
* and, if so, displays a meaningful error message on the screen and ends the program.
*
* 2. Because you will be comparing a single expression (the input value) to multiple constants (3, 4, and 5),
* your code should use a switch statement to display the following message onscreen:
*
*     If user inputs 3, onscreen message should say "A triangle has 3 sides."  
*     If user inputs 4, onscreen message should say "A rectangle has 4 sides."
*     If user inputs 5, onscreen message should see "A pentagon has 5 sides."
*
* 3. Be sure to test your program. This means running your program multiple
* times with test values 3, 4, 5, as well as at least two values that fall outside that range
* (one lower than the lowest and one higher than the highest) and making sure
* that the correct message displays for each value you input. Also be sure
* that running your program does not cause any compiler errors.
***********************************************************************/
package veselinmiskeljin_prg420_codingassignment.prg420_week2;

/**
 *
 * @author centurion
 */

import java.util.Scanner;

public class Main {
   
    public static void main(String[] args){
    
        // User input
        String userInput;
        
        // Number of angles
        int numberOfAngles;
        
        Scanner myInput = new Scanner(System.in);
        System.out.println("Please provide with an integer 3, 4 or 5 and press ENTER: ");
        userInput = myInput.next();
        numberOfAngles = Integer.parseInt(userInput);
        
        switch (numberOfAngles){
            case 3: 
                System.out.println("A triangle has 3 sides.");
                break;
            case 4:
                System.out.println("A rectangle has 4 sides.");
                break;
            case 5:
                System.out.println("A pentagon has 5 sides.");
                break;
            default:
                System.out.println("Out of range. Invalid input.");
        }
        
    }
}

