import java.util.Scanner;

public class labb5 {
        public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          String msg;
          int choice;
          do {
            System.out.println("1. Encrypt message");
            System.out.println("2. Decrypt message");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
              case 1:
                System.out.print("Enter message to encrypt: ");
                msg = scan.nextLine();
                System.out.println("Encrypted message: " + encrypt(msg));
                break;
              case 2:
                System.out.print("Enter message to decrypt: ");
                msg = scan.nextLine();
                System.out.println("Decrypted message: " + decrypt(msg));
                break;
              case 0:
                System.out.println("Goodbye!");
                break;
              default:
                System.out.println("Invalid choice. Please try again.");
                break;
            }
          } while (choice != 0);
          scan.close();
        }
      
        public static String encrypt(String message) {
          String result = "";
          for (char c : message.toUpperCase().toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
              int index = c - 'A';
              result += "XYZABCDEFGHIJKLMNOPQRSTUVW".charAt(index);
            } else {
              result += c;
            }
          }
          return result;
        }
      
        public static String decrypt(String message) {
          String result = "";
          for (char c : message.toUpperCase().toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
              int index = "XYZABCDEFGHIJKLMNOPQRSTUVW".indexOf(c);
              result += (char) ('A' + index);
            } else {
              result += c;
            }
          }
          return result;
        }
      }

