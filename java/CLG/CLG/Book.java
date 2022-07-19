import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Publication {
    String title, author;
    int price;
}

class Books extends Publication {
    int pcount;

    void GetData(String a, int b, String c, int d) {
        title = a;
        price = b;
        author = c;
        pcount = d;
    }

    void DisplayData() {
        System.out.println("\nBook Name:" + title + "\nPrice: " + price + "\nAuthor Name: " + author + "\nPage Count: " + pcount);
    }
}

class Ebooks extends Publication {
    int ptime;
    
    void GetData(String a, int b, String c, int d) {
        title = a;
        price = b;
        author = c;
        ptime = d;
    }

    void DisplayData() {
        System.out.println("\nBook Name:" + title + "\nPrice: " + price + "\nAuthor Name: " + author + "\nPlay Time: " + ptime);
    }
}

class Book {
    public static void main(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        Books b =new Books();
        Ebooks e = new Ebooks();
        String w, y;
        int x, z; 

        System.out.println("Vikas Sharma\n211020033\n");
        
        System.out.print("Enter title of book: ");
        w = br.readLine();
        System.out.print("Enter price of book: ");
        x = Integer.parseInt(br.readLine());
        System.out.print("Enter author of book: ");
        y = br.readLine();
        System.out.print("Enter page count of book: ");
        z = Integer.parseInt(br.readLine());

        b.GetData(w, x, y, z);

        System.out.print("\nEnter title of Ebook: ");
        w = br.readLine();
        System.out.print("Enter price of Ebook: ");
        x = Integer.parseInt(br.readLine());
        System.out.print("Enter author of Ebook: ");
        y = br.readLine();
        System.out.print("Enter play time of Ebook: ");
        z = Integer.parseInt(br.readLine());

        e.GetData(w, x, y, z);

        b.DisplayData();
        e.DisplayData();

        // sc.close();
    }
}