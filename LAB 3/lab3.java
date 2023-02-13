import java.util.Scanner;

public class lab3 {
    static String[][] details = new String[100][5]; // 2-dimensional array to store the details of up to 100 students
    static String[] stuname = new String[100]; // static array to store the names that the user has entered
    static int count = 0; // to keep track of the number of students entered

    // function to collect the details of the student
    static void collectDetails() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        int index = searchDetails(name);
        if (index == -1) { // if the details of the student is not already entered
            stuname[count] = name;
            System.out.print("Enter  Register Number: ");
            details[count][0] = sc.nextLine();
            System.out.print("Enter Email of student: ");
            details[count][1] = sc.nextLine();
            System.out.print("Enter the Class: ");
            details[count][2] = sc.nextLine();
            System.out.print("Enter the Department: ");
            details[count][3] = sc.nextLine();
            count++;
            System.out.println("Details successfully entered!");
        } else {
            System.out.println("Details already entered! Enter new details.");
        }
    }

    // function to display the details of the student
    static void displayDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of student: ");
        String name = sc.nextLine();
        int index = searchDetails(name);
        if (index == -1) { // if the name is not found
            System.out.println("Details not found!");
        } else {
            System.out.println("Name: " + stuname[index]);
            System.out.println("Register Number: " + details[index][0]);
            System.out.println("Email: " + details[index][1]);
            System.out.println("Class: " + details[index][2]);
            System.out.println("Department: " + details[index][3]);
        }
    }

    // function to search the details of the student
    static int searchDetails(String name) {
        for (int i = 0; i < count; i++) {
            if (stuname[i].equals(name)) {
                return i; // returns the index of the student in the 2-dimensional array
            }
        }
        return -1; // returns -1 if the name is not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Collect Details");
            System.out.println("2. Display Details");
            System.out.println("3. Search Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    collectDetails();
                case 2:
                    displayDetails();
                case 3:
                    searchDetails(null)
                case 4:
                    System.exit(choice);
                default:
                    System.out.println("Invalid Choice ! ! !");
            }
        }
    }
}
    

