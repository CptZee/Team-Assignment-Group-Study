public class DataCasting {

    public static void main(String[] Args) {
    	//Widening
    	byte Grade = 90;
    	float gradeInDecimal = Grade; //90.0
    	
    	System.out.println("The grade 90 in float is " + gradeInDecimal);
    	//Narrowing
    	float Percentage = 99.99f;
    	byte WholeNumber = (byte) Percentage; //99
    	
    	System.out.print("The percentage "+Percentage+" in byte is "+WholeNumber);
    }
}