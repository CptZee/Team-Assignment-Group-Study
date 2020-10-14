/*
Exercise 2: Write a Java program to determine whether an input number is an even number.
*/
import java.util.Scanner;

public class EvenAndOdd {

    public static void main(String[] args) {
    	Scanner userInput = new Scanner(System.in);
    	System.out.print("Enter a number: ");
    	byte userNumber = userInput.nextByte();
    	
    	if(userNumber %2 == 0) {
    		System.out.println("The number is even.");
    	} else {
    		System.out.println("The number is odd.");
    	}
    }
}