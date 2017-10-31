package assignment7; //Package Declaration is necessary
//import packages
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
/*
 This program will find all anagram sets from a list of words.
 */
public class Asssignment7_4 
{

    public static void main(String args[]) // main method starts 
    {
    	// Declaring String array
        String[] arr = { "listen", "pot", "part", "opt", "trap", "silent", "top", "this", "hello", "hits", "what", "shit"};
        
        HashMap<Integer, List<String>> mapList = new HashMap<Integer, List<String>>();// HashMap for key,value pair

        // loop for getting hashcode of each word and appending to list
        for (int i = 0; i < arr.length; i++) 
        {
            int hashcode = gethashcode(arr[i]);

            List<String> list = mapList.get(hashcode);
            
            // creating ArrayList & putting it into HashMap
            if (list == null) 
            {
                list = new ArrayList<String>();
                mapList.put(hashcode, list);
            }
            list.add(arr[i]);
        }

        printMap(mapList); // calling printMap method for each mapList

     
    }

    // Function for iterating through  HashMap
    public static void printMap(HashMap<Integer, List<String>> mapList) 
    {

        if (mapList != null && mapList.size() > 0) 
        {
        	// iterating through HashMap using keys
            for (Integer key : mapList.keySet()) 
            {
                List<String> list = mapList.get(key);

                System.out.print("{"); // appending { before each anagram set
                if (list != null && list.size() > 0) 
                {
                    for (int k = 0; k < list.size(); k++) 
                    {
                        System.out.print(list.get(k) + " ");
                    }
                }
                System.out.print("}"); // appending } after each anagram set
            }
        }

    }

    // function to return the hashcode
    public static int gethashcode(String str) 
    {
        int hashcode = 0;
        char ch[] = str.toCharArray();

        // loop to iterate through characters of each word and compute the hashcode
        for (int i = 0; i < ch.length; i++) 
        {
            if (hashcode != 0) 
            {
                hashcode = hashcode + String.valueOf(ch[i]).hashCode();
            } 
            else 
            {
                hashcode = String.valueOf(ch[i]).hashCode();
            }
        }
        return hashcode; //returning hashcode
    }
}

