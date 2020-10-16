/*
4. Write a Java program that asks the user what flavor of ice cream do they want

Test Data
Ice Cream Flavor: Chocolate
Expected Output :
The user picked Chocolate
*/

import java.util.Scanner; 
public class IceCreamFlavo {

    public static void main(String[] args) {
    	Scanner userInput = new Scanner (System.in);
    	
    	System.out.print("Ice Cream Flavor:");
    	String Icecreamflavor = userInput.nextLine();
    	
    	switch(Icecreamflavor){
    		case "Chocolate":
    			System.out.println("The user picked Chocolate");
    			break;
    		case "Strawberry":
    			System.out.println("The user picked Strawberry");
    			break;
    		case "Cocomelon":
    			System.out.println("The user picked Cocomelon");
    			break;
    		case "Pinipig":
    			System.out.println("The user picked Pinipig");
    			break;
    		case "Ampalaya":
    			System.out.println("The user picked Ampalaya");
    			break;
    		default:
    			System.out.println("Sorry out of gatas");
    			
    	}
    }
    
    
}