/*
 * Kirsten Lucas
 * lucaskt@mail.uc.edu
 * Assignment 03
 * Due Date: 09/26/2019
 * Description: Pyramids with loops
 * Citations: https://javaconceptoftheday.com/how-to-create-pyramid-of-numbers-in-java/
 * Course: IS 4010
 */

/* Original Documentation via GitHub:
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu  
 * Printing pyramids using loops. It kind-of works. 
 * What I really want is
        1
       222
      33333 
     4444444
    555555555  
*/


package main;

public class Main {

	public static void main(String[] args) {
        int rowCount = 1; // Counts the number of rows beginning at 1

		 for (int i = 1; i <= 5; i++) // Increments the number in each row by 1
	        {
	 
	            for (int j = 0; j <= 5 - i; j++) // Determines the number of spaces at beginning of rows
	            {
	                System.out.print(" ");  //Prints i no. of spaces at the beginning of each row
	                						// before the numbers begin
	            }
	 
	            for (int j = 1; j <= i + i-1; j++) 
	            {
	                System.out.print(rowCount);  // Prints 'rowCount' number that specific amount of 
	                							 // times in each row
	            }
	 
	            System.out.println(); 
	 

	            rowCount++; // Increments row numbers
		
	        }
	
	}
}
		
