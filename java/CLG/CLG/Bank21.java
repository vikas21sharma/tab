import java.util.Scanner;

class Customer {
    String name;
    int accountNumber;
    int balance;
    String type;
    boolean checkBook;

    Scanner sc = new Scanner(System.in);

    Customer() {
        System.out.println("Enter details:");
        System.out.print("Name: ");
        name = sc.nextLine();

        System.out.print("Balance: ");
        balance = sc.nextInt();

        System.out.print("Select type:\n1.)Savings\n2.)Current\n> ");
        type = (sc.nextInt() == 1) ? ("Savings") : ("Current");

        accountNumber = 1;

        checkBook = (this.type == "Savings") ? (false) : (true);
    }

    void Display() {
        System.out.println("\nName: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Account Type: " + type);
        System.out.println("Checkbook Issued: " + checkBook);
    }

    void ShowBalace() {
        System.out.println("Balance is: " + balance);
    }

    void Deposit() {
        System.out.print("Enter amout to deposit: ");
        int amount = sc.nextInt();
        balance += amount;
    }

    void Intrest() {
        if(type == "Savings")
            System.out.println((balance * (1 + 0.06 * 1)));
        else
            System.out.println("Current account does not have intrest.");
    }

    void Withdrawl() {
        System.out.print("Enter amout to withdrawl: ");
        int amount = sc.nextInt();
        balance -= amount;
    }

    void Check() {
        if(balance < 2000) {
            System.out.println("Balace is below limit.\nBalance: " + balance);
            balance -= 150;
            System.out.println("Balace after penalty: " + balance);
        }
    }

    void Book() {
        System.out.println("Checkbook issued: " + checkBook);
    }
}

class Bank21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vikas Sharma\n211020033\n");
        
        Customer[] cus = new Customer[2];
        cus[0] = new Customer();
        cus[1] = new Customer();
        int choice = 0, index = 0;
        boolean flag = false;   
        while(choice <= 7) {
            if(!flag) {
                System.out.println("\nSelect User:");
                for(int i = 0; i < 2; i++) {
                    System.out.print((i + 1) + ".)" + cus[i].name + "\n");
                }
                System.out.println("\nEnter your choice: ");
                index = sc.nextInt() - 1;  
                flag = true;
            }

            System.out.print("\n_________________Bank_______________\n1.)Check Balance\n2.)Deposit\n3.)Check Intrest\n4.)Withdrawl\n5.)Penalty Check\n6.)Checkbook issued?\n7.)Change Customer\n8.)Exit\n\nEnter your choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                cus[index].ShowBalace();
                break;

                case 2:
                cus[index].Deposit();
                break;

                case 3:
                cus[index].Intrest();
                break;

                case 4:
                cus[index].Withdrawl();
                break;

                case 5:
                cus[index].Check();
                break;

                case 6:
                cus[index].Book();
                break;

                case 7:
                flag = false;

                default:
                System.out.println("Wrong Input.");
            }
        }

        sc.close();
    }
}