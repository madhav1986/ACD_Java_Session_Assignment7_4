package assignment7; // package declaration is compulsory.
import java.util.Scanner; // import scanner class

/*
 This program will help you understand the concepts of String class and its methods
 */
public class Assignment7_1 
{

	public static void main(String[] args) // main method starts
	{
		// TODO Auto-generated method stub
		//variable declaration
		int num;
		
		Scanner input=new Scanner(System.in); // Scanner to take input from user.
		System.out.println("Enter the integer : ");
		num=input.nextInt(); // initialize the number
		input.close();
		
		String s=String.valueOf(num); // converting integer variable to String.
		
		System.out.println("String representation of integer is : "+s);
	}

}
