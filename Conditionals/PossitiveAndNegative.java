/*
1. Write a Java program to get a number from the user and print whether it is positive or negative.

Test Data
Input number: 35
Expected Output :
Number is positive
*/

import java.util.Scanner;

public class PossitiveAndNegative {

    public static void main(String[] Args){
    	//Object Identifier = new ObjectMethod;
    	Scanner userInput = new Scanner(System.in);
    	
    	System.out.print("Input number: ");
    	byte userNumber = userInput.nextByte();
    	
    	if(userNumber >= 0){
    		System.out.println("Number is possitive");
    	}else {
    		System.out.println("Number is negative");
    	}
    	
    }
    
    
}