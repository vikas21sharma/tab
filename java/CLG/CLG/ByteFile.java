import java.io.FileOutputStream; 
import java.io.IOException; 
 
class ByteFile
{
    public static void main(String args[]) 
 	{ 
 	 	System.out.println("OMJI\n 211020020"); 
 	 	try
         { 
 	 	 	FileOutputStream fos = new FileOutputStream("D:\\Manipal\\SEM-II\\JAVA\\ByteFilec.txt"); 
 	 	 	String msg = "Welcome to Java Programming hahahhaha....";  
            byte b[] = msg.getBytes(); 
            fos.write(b);
            fos.close(); 
 	 	} 
 	 	catch (IOException e) { 
 	 	 	System.out.println(e); 
 	 	} 
 	} 
} 
