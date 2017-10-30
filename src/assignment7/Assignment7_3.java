package assignment7; //Package Declaration is necessary
/*
This class shows how the capacity is changing in StringBuffer or in StringBuilder if we
append the string.
 */

public class Assignment7_3 
{

	public static void main(String[] args) // Main method starts
	{
		// TODO Auto-generated method stub
		
		// Capacity change logic for StringBuffer class
		StringBuffer sb=new StringBuffer();
		
		sb.append("Hello");
		System.out.println("Initial Capacity of StringBuffer = "+sb.capacity()); // Initial capacity
	
		sb.append("I want to learn advacne java");
		System.out.println("New Capacity of StringBuffer = "+sb.capacity()); // now capacity =Initial_capacity*2+2 (16*2+2=34)
		
		// Capacity change logic for StringBuilder class
		StringBuilder sbd=new StringBuilder();
		
		sbd.append("Hi");
		System.out.println("Initial Capacity of StringBuilder = "+sbd.capacity()); // Initial capacity
	
		sbd.append("I want to learn Bigdata");
		System.out.println("New Capacity of StringBuilder = "+sbd.capacity()); // now capacity =Initial_capacity*2+2 (16*2+2=34)
	}
	

}
