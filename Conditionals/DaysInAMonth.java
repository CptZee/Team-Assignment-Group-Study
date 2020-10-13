/*
4. Write a Java program to find the number of days in a month.

Test Data
Input a month number: 2
Input a year: 2016
Expected Output :
February 2016 has 29 days
*/

import java.util.Scanner;

public class DaysInAMonth {

    public static void main(String[] args) {
    	Scanner userInput = new Scanner(System.in);
    	
    	System.out.print("Input a month number: ");
    	byte monthNumber = userInput.nextByte();
    	System.out.print("Input a year: ");
    	short yearNumber = userInput.nextShort();
    	
    	if(yearNumber %4 == 0){
    		switch(monthNumber){
    			case 1:
    				System.out.println("January " + yearNumber + " has 31 days");
    				break;
    			case 2:
    				System.out.println("February " + yearNumber + " has 29 days");
    				break;
    			case 3:
    				System.out.println("March " + yearNumber + " has 31 days");
    				break;
    			case 4:
    				System.out.println("April " + yearNumber + " has 30 days");
    				break;
    			case 5:
    				System.out.println("May " + yearNumber + " has 31 days");
    				break;
    			case 6:
    				System.out.println("June " + yearNumber + " has 30 days");
    				break;
    			case 7:
    				System.out.println("July " + yearNumber + " has 31 days");
    				break;
    			case 8:
    				System.out.println("August " + yearNumber + " has 31 days");
    				break;
    			case 9:
    				System.out.println("September " + yearNumber + " has 30 days");
    				break;
    			case 10:
    				System.out.println("October " + yearNumber + " has 31 days");
    				break;
    			case 11:
    				System.out.println("November " + yearNumber + " has 30 days");
    				break;
    			case 12:
    				System.out.println("December " + yearNumber + " has 31 days");
    				break;
    			default:
    				System.out.println("Invalid Month Number!");	
    			
    		}
    	}else {
    		switch(monthNumber){
    			case 1:
    				System.out.println("January " + yearNumber + " has 31 days");
    				break;
    			case 2:
    				System.out.println("February " + yearNumber + " has 28 days");
    				break;
    			case 3:
    				System.out.println("March " + yearNumber + " has 31 days");
    				break;
    			case 4:
    				System.out.println("April " + yearNumber + " has 30 days");
    				break;
    			case 5:
    				System.out.println("May " + yearNumber + " has 31 days");
    				break;
    			case 6:
    				System.out.println("June " + yearNumber + " has 30 days");
    				break;
    			case 7:
    				System.out.println("July " + yearNumber + " has 31 days");
    				break;
    			case 8:
    				System.out.println("August " + yearNumber + " has 31 days");
    				break;
    			case 9:
    				System.out.println("September " + yearNumber + " has 30 days");
    				break;
    			case 10:
    				System.out.println("October " + yearNumber + " has 31 days");
    				break;
    			case 11:
    				System.out.println("November " + yearNumber + " has 30 days");
    				break;
    			case 12:
    				System.out.println("December " + yearNumber + " has 31 days");
    				break;
    			default:
    				System.out.println("Invalid Month Number!");
    	}
    }
}
}