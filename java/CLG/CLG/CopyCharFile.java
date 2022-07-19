import java.io.File;
 import java.io.FileInputStream; 
 import java.io.FileOutputStream; 
 import java.io.IOException; 
 public class CopyCharFile  
{ 
   public static void main(String[] args) throws IOException  
 	{ 
 	 	System.out.println("OMJI\n211020020"); 
 
       	File src = new File("D:\\Manipal\\SEM-II\\JAVA\\xyz.txt"); 
       	File dest= new File("D:\\Manipal\\SEM-II\\JAVA\\z.txt"); 
       	FileInputStream fis = new FileInputStream(src); 
       	FileOutputStream fos = new FileOutputStream(dest);
        int length = (int) src.length(); 
        byte[] buffer = new byte[length];
        while ((length = fis.read(buffer)) > 0) 
        {
            fos.write(buffer, 0, length); 
        } 
 
      fis.close(); 
      fos.close(); 
      System.out.println("File copied successfully......."); 
   } 
} 
