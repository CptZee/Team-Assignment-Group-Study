/**
Inventory Module (3 Functions)

A program that has three (3) basic functions;
(S)ales, (I)nventory, and (C)hange Pin. 


Disclaimer: There are several ways of doing this, some
are easier and some are a bit harder. This code is
created in a sense that it will use all the methods that
were previously discussed.

Steps In Making This Program (EASIEST)
1) Create an algorithm. (See ppt)
2) Create a flowchart. (See ppt)
3) Start programming your program. <-This part!

Created and demonstrated by CptZ. All rights reserved!
*/

import java.util.Scanner;

public class InventoryModule {
    public static void main(String[] args) {
    	Scanner userNameInput = new Scanner(System.in);
    	Scanner userPassInput = new Scanner(System.in);
    	Scanner userChoiceInput = new Scanner(System.in);
    	Scanner userSalesInput = new Scanner(System.in);
    	Scanner userDoMoreInput = new Scanner(System.in);
    	Scanner userNewPass = new Scanner(System.in);
		boolean isLogout = false;
    	boolean isLogin = false;
    	boolean isDone = false;
    	String userName;
    	String userPass;
    	String reqName = "user";
    	String reqPass = "GroupStudyS4";
    	String userChoice;
    	int userSales;
    	int userInventory = 500000;
    	String userDoMore;
    	String lines = "-----------------------------------";
    	
    	
    	//Authentication Loop
    	do{
			boolean isWantToContinue = true;
    		do{
			//A friendly welcome message.
    		System.out.println(lines);
    		System.out.println("Welcome to CptZ Inventory System!");
    		System.out.println("Please Login!");
    		System.out.println(lines);
    	
    		System.out.print("Username: ");
    		userName = userNameInput.nextLine();
    		System.out.print("Password: ");
    		userPass = userPassInput.nextLine();
    	
    		if(userName.equals(reqName) && userPass.equals(reqPass)){
    			isLogin = true;
    		}else{
    			System.out.println("Invalid Credentials!");
    		}
    		}while(isLogin == false);
    	
    		System.out.println("You have successfully login!");
    	
    		//Choices Loop
    		while(isWantToContinue == true){
    			System.out.println(lines);
    			System.out.println("What do you want to do today?");
    			System.out.println("(S)ales - Enter a sale.");
    			System.out.println("(I)nvetory - Check the supply.");
    			System.out.println("(C)hange Pin - Change the user password.");
    			System.out.println(lines);
    			userChoice = userChoiceInput.nextLine();
    	
    			switch(userChoice.toLowerCase()){
    				case "s":
    					System.out.print("Amount of Sales: ");
    					userSales = userSalesInput.nextInt();
    					userInventory = userInventory - userSales;
    				
    					System.out.println("Successfully deducted " + userSales + " from your inventory");
    					System.out.println("Current Inventory: " + userInventory);
    					do{
    						System.out.println("Do you want to do something else? (Y/N)");
    						userDoMore = userDoMoreInput.nextLine();
							//Continue...
    						if(userDoMore.equalsIgnoreCase("Y")){
    							System.out.println("Returning to main menu...");
    							isDone = true;
	    					}else if(userDoMore.equalsIgnoreCase("N")){
	    						isWantToContinue = false;
	    						isDone = true;
	    						isLogout = true;
	    					}else{
	    						System.out.println("Invalid Response! '" + userDoMore + "', Please Try Again!");
	    					}
	    				}while(isDone == false);
	    				break;
	    			case "i":
	    				System.out.println("Current Inventory: " + userInventory);
	    				do{
	    					System.out.println("Do you want to do something else? (Y/N)");
	    					userDoMore = userDoMoreInput.nextLine();
	    					//Continue...
	    					if(userDoMore.equalsIgnoreCase("Y")){
	    						System.out.println("Returning to main menu...");
	    						isDone = true;
	    					}else if(userDoMore.equalsIgnoreCase("N")){
	    						isWantToContinue = false;
	    						isDone = true;
	    						isLogout = true;
	    					}else{
	    						System.out.println("Invalid Response! '" + userDoMore + "', Please Try Again!");
	    					}
	    				}while(isDone == false);
	    				break;
	    			case "c":
	    				System.out.print("New Password: ");
	    				reqPass = userNewPass.nextLine();
	    				System.out.println("User '" + userName + "' password is set to '" + reqPass + "'!");
	    				isWantToContinue = false;
	    				break;
	    			default:
	    				System.out.println("Invalid Response! '" + userChoice + "', Please Try Again!");	
	    		}
	    	}
    	}while(isLogout == false);
		
		//A friendly good bye message
    	System.out.println(lines);
    	System.out.println("Thank you for using CptZ Inventory System!");
    	System.out.println("Have a great day!");
    	System.out.println(lines);
		
    	/*
    	End of Program.
    	If you have any concerns or suggestions PM Cpt.Z#0404
    	Have a great day!
    	*/
    }
}