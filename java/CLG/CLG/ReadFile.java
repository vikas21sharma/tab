import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path; 
import java.nio.file.Paths; 
import java.util.Arrays; 
 
public class ReadFile { 
 
 	public static void main(String[] args) throws IOException 
 	{ 
 	 	System.out.println("Lokesh Naga\n 211020016 \n "); 
 	 	Path p = Paths.get("D:\\Manipal\\SEM-II\\JAVA\\ByteFilec.txt"); 
 
 	 	byte[] array = Files.readAllBytes(p); 
 
 	 	System.out.println(Arrays.toString(array)); 
 	} 
} 
