package assignment7; //Package Declaration is necessary
import java.util.Arrays; // import Arrays class
/*
This program will help you understand the concepts of String class and its methods
 */
public class Assignment7_2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String str=new String("My name is XYZ");  // Initialize string 
		String[] parts = str.split(" "); // splitting the string
		Arrays.sort(parts);  // sorting the words
		StringBuilder sb = new StringBuilder();  // declaring StringBuilder
		
		// logic to append the sorted words
		for(String s:parts)
		{  
		   sb.append(s);  
		   sb.append(" ");
		}
		
		System.out.println(sb); // printing the combined sorted string 
		
		// logic for sorting individual words of string
		for(String s:parts)
		{  
			char[] word=s.toCharArray();
			Arrays.sort(word); // sorting the word
			String sortedWord = new String(word);
			System.out.println(sortedWord); // printing the sorted word
		}
	
	}

}
