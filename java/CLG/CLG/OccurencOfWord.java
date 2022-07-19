// Java program to count the number
// of occurrence of a word in
// the given string
import java.io.*;
import java.util.*;

class OccurenceOfWord {

static int countOccurrences(String str, String word)
{
	// split the string by spaces in a
	String a[] = str.split(" ");

	// search for pattern in a
	int count = 0;
	for (int i = 0; i < a.length; i++)
	{
	// if match found increase count
	if (word.equals(a[i]))
		count++;
	}

	return count;
}

// Driver code
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your string : ");  
    String str = sc.nextLine();  
    System.out.println("Name is: " +str);             
    sc.close();
	//String str = "GeeksforGeeks A computer science portal for geeks ";
	String word = "portal";
	System.out.println(countOccurrences(str, word));
}
}

/*This code is contributed by Nikita Tiwari.*/
