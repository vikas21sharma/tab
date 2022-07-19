import java.util.Scanner;
class Customer {
    String name;
    int accountNumber;
    int balance;
    String type;
    boolean checkBook;
    Scanner sc = new Scanner(System.in); 
    Customer()
    {
        System.out.println("Enter details:");
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Balance: "); 
        balance = sc.nextInt();
        System.out.print("Select type:\n1.)Savings\n2.)Current\n> "); 
        type = (sc.nextInt() == 1) ? ("Savings") : ("Current");
        accountNumber = 1;
    }
    void Display()
    {
        System.out.println("\nName: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Account Type: " + type);
        System.out.println("Checkbook Issued: " + checkBook); 
    }
    void ShowBalace() 
    {
        System.out.println("Balance is: " + balance);
    }
    void Deposit() 
    {
        System.out.print("Enter amout to deposit: ");
        int amount = sc.nextInt();
        balance += amount;
    }
    void Intrest()
    {
        if(type == "Savings")
        System.out.println((balance * (1 + 0.06 * 1))); 
        else
        System.out.println("Current account does not have intrest.");
    }
    void Withdrawl()
    {
        System.out.print("Enter amout to withdrawl: "); 
        int amount = sc.nextInt();
        balance -= amount;
    }
    void Check() 
    {
        if(balance < 2000)
        {
            System.out.println("Balace is below limit.\nBalance: " + balance); 
            balance -= 150;
        }
        else
        System.out.println("Balace after penalty: " +balance);
    }
 }
class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Name:- Vikas Sharma \n Reg No:- 211020033");
        Customer cus = new Customer(); 
        int choice = 0;
        while(choice <=5) 
        {
            System.out.print("\n______Bank______\n1.)CheckBalance\n2.)Deposit\n3.)Check Intrest\n4.)Withdrawl\n5.)Penalty Check\n6.)Exit\n\nEnter your choice: ");
            choice = sc.nextInt();
            switch(choice) {
            case 1:
                cus.ShowBalace();
                break;
            case 2:
                cus.Deposit();
                break;
            case 3:
                cus.Intrest();
                break;
            case 4:
                cus.Withdrawl();
                break;
            case 5:
                cus.Check();
                break;
            default:
                System.out.println("Wrong Input."); }
        }
        sc.close();
    }
}