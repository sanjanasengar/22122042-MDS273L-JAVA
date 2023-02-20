import java.util.Scanner;

public class BankAccount {
  

    // Global variables
    static int accNumber;
    static String accHolderName;
    static double accBal;
    static String[] transactions = new String[100];
    static int transactionCount = 0;

   
    // Function to initialize the customer
    public static void create() {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter account number: ");
        accNumber = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter account holder name: ");
        accHolderName = scan.nextLine();
        System.out.print("Enter initial account balance: ");
        accBal = scan.nextDouble();
        System.out.println("Customer initialized successfully!");
    }

    // Function to deposit money
    public static void deposit() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        double amount = scan.nextDouble();
        accBal += amount;
        transactions[transactionCount] = "Deposited " + amount;
        transactionCount++;
        System.out.println("Deposit successful!");
    }

    // Function to withdraw money
    public static void withdraw() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        double amount = scan.nextDouble();
        if (accBal < amount) {
            System.out.println("Insufficient balance!");
        } else {
            accBal -= amount;
            transactions[transactionCount] = "Withdrawn " + amount;
            transactionCount++;
            System.out.println("Withdrawal successful!");
        }
    }

    // Function to print the transactions
    
    public static void Transactions() {
        System.out.println("Transaction history:");
        for (int i = 0; i < transactionCount; i++) {
            System.out.println(transactions[i]);
        }
    }

    // Function to print account summary
    public static void printSummary() {
        System.out.println("Account summary:");
        System.out.println("Account number: " + accNumber);
        System.out.println("Account holder name: " + accHolderName);
        System.out.println("Account balance: " + accBal);
    }

    // Main function to handle menu operations
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        create();
        int choice = 0;
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Print transactions");
            System.out.println("4. Print account summary");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    Transactions();
                    break;
                case 4:
                    printSummary();
                    break;
                case 5:
                    System.out.println("Tata Tata");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
