import java.io.IOException;  
import java.io.RandomAccessFile;  
  
public class RandomAccess{  
    static final String FILEPATH ="D:\\Manipal\\SEM-II\\JAVA\\ByteFilec.txt";  
    public static void main(String[] args) { 
        System.out.println("Vikas Sharma\n211020033"); 
        try {  
            System.out.println(new String(readFromFile(FILEPATH, 0, 18)));  
            writeToFile(FILEPATH, "I love Manipal", 15);  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
    private static byte[] readFromFile(String filePath, int position, int size) throws IOException
     {  
        RandomAccessFile file = new RandomAccessFile(filePath, "r");  
        file.seek(position);  
        byte[] bytes = new byte[size];  
        file.read(bytes);  
        file.close();  
        return bytes;  
    }  
    private static void writeToFile(String filePath, String data, int position) throws IOException 
    {  
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");  
        file.seek(position);  
        file.write(data.getBytes());  
        file.close();  
    }  
}