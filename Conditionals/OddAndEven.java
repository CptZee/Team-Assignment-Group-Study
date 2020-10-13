/*
0. Write a Java program to get a number from the user and print whether it is odd or even.

Test Data
Input number: 2
Expected Output :
Number is even
*/

import java.util.Scanner;

public class OddAndEven {

    public static void main(String[] args){
		System.out.print("Input number: ");
		Scanner inputScanner = new Scanner(System.in);
		int inputNumber = inputScanner.nextInt();

		if(inputNumber %2 == 0){
			System.out.println("Number is even");
		}else {
			System.out.println("Number is odd");
		}
    }
}