import java.util.Scanner;

class BankAccount{
    String name;
    int accNo;
    private double balance;

    //constructor
    public BankAccount(String name, int accNo,double balance){
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }
    
    public void deposit(double amount){
        balance += amount;
        System.out.println("DEPOSITED:" + amount);
    }
    
    public void withdraw(double amount){
        if(amount<=balance){
            balance -= amount;
            System.out.println("WITHDRAWN:" + amount);
        }else{
            System.out.println("**Insufficient balance**");
        }
    }

    public void showBalance(){
        System.out.println("CURRENT BALANCE:" + balance);
    }
}

public class BankManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.println("Enter your intial Balance:" );
        double balance = sc.nextDouble();
        BankAccount account = new BankAccount(name,accNo,balance);

        int choice = 0;
        System.out.println("$$WELCOME TO ONLINE ATM$$");
        while (choice!=4) { 
            System.out.println("**ATM MENU**");
            System.out.println("1. DEPOSIT");
            System.out.println("2. WITHDRAW");
            System.out.println("3. BALANCE");
            System.out.println("4. EXIT");
            System.out.println(" ** ENTER YOUR CHOICES:  ** ");
            choice = sc.nextInt();
            
            switch(choice){
                case 1:
                System.out.println("Enter amount to be deposited:");
                double depositamount = sc.nextDouble();
                account.deposit(depositamount);
                account.showBalance();
                break;

                case 2:
                System.out.println("Enter amount to be withdrawn:");
                double withdrawAmount = sc.nextDouble();
                account.withdraw(withdrawAmount);
                account.showBalance();
                break;
                
                case 3:
                account.showBalance();
                break;
                
                case 4:
                System.out.println("Exiting....");
                break;

                default:
                System.out.println("**invalid choice**");
                
            }
        }


    }

}
    

