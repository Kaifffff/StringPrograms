package StringPrograms;

//import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConvertStringToStringArray2 {
	  public static String[] method(Set<String> string)
	    {
	        // Create String[] of size of setOfString
	        String[] string_array = new String[string.size()];

	        // Copy elements from set to string array
	        // using advanced for loop

	        int index = 0;

	        for (String str : string) {
	            string_array[index++] = str;
	        }

	        // Return the formed String[]
	        return string_array;
	    }

	    // Method 2
	    // Main driver method
	    public static void main(String[] args)
	    {
	        // Custom input string
	        String str = "Geeks for Geeks";

	        // Getting the Set of String
	        Set<String> string_set
	            = new HashSet<>(Arrays.asList(str));

	        // Printing  the setOfString
	        System.out.println("String: " + str);

	        // Converting Set to String array
	        String[] String_array = method(string_set);

	        // Lastly printing the arrayOfString
	        // using Arrays.toString() method
	        System.out.println("Array of String: " + Arrays.toString(String_array));
	    }
}
