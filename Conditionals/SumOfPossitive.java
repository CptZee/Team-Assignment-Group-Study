/*
Exercise 3: Write a program that finds the sum of possitive numbers that the user give.
The program should not end until the user give a negative number.
*/
import java.util.Scanner;

public class SumOfPossitive {
	private static Scanner userInput = new Scanner(System.in);
	
    public static void main(String[] args){
    	System.out.println("Now using while loop...");
    	While();
    	System.out.println("Now using do while loop...");
    	doWhile();
    	System.out.println("Now using for loop...");
		For();
    }
    
    //Solution using the while loop
    public static void While(){
    	int userNumber = 0, sum = 0;
    	while(userNumber >= 0){
    		System.out.print("Enter a number: ");
    		userNumber = userInput.nextInt();
    		
    		if(userNumber >= 0){
    			sum = sum + userNumber;
    		}
    	}
    	System.out.println("The sum of all possitive numbers that the user gave is " + sum + ".");
    }
    
    //Solution using do while loop
    public static void doWhile(){
    	int userNumber, sum = 0;
    	do{
    		System.out.print("Enter a number: ");
    		userNumber = userInput.nextInt();
    		
    		if(userNumber >= 0){
    			sum = sum + userNumber;
    		}
    	}while(userNumber >= 0);
    	System.out.println("The sum of all possitive numbers that the user gave is " + sum + ".");
    }
    
    //Solution using for loop
    public static void For(){
    	int userNumber, sum = 0;
    	for(userNumber = 0; userNumber >= 0; sum = sum + userNumber){
    		System.out.print("Enter a number: ");
    		int userInputNumber = userInput.nextInt();
    		if(userInputNumber >= 0){
    			userNumber = userInputNumber;
    		}else{
    			break;
    		}
    	}
    	System.out.println("The sum of all possitive numbers that the user gave is " + sum + ".");
    }
}