/*
Exercise 1: Write Java program to allow the user to input his/her age. Then the program will show if the person is eligible to vote. A person who is eligible to vote must be older than or equal to 18 years old.

Enter your age: 18
You are eligible to vote.
*/

import java.util.Scanner;

public class VotingAge {
    public static void main(String[] args) {
 		Scanner userInput = new Scanner(System.in);
 		System.out.print("Enter an age: ");
 		Byte userAge = userInput.nextByte();
 		
 		if(userAge >= 18){
 			System.out.println("You are eligible to vote");
 		} else {
 			System.out.println("You are not eligible to vote");
 		}	
    }
    
    
}