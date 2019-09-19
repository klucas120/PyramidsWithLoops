/* 
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
		
		for (int i = 0; i <= 5; i++) {
			
        for (int j = 0; j < i; j++) {
        	System.out.print(""+ i);
            }
            System.out.println("");
        
		}
		
	}

}

// https://javaconceptoftheday.com/how-to-create-pyramid-of-numbers-in-java/


/*
public static void main(String[] args) {
int lines = 5;
for (int i = 0; i < lines; i++) {
	for (int j = 0; j < i+1; j++) {
		System.out.print(j);
	}
	System.out.println("");
*/