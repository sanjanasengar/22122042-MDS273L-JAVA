// package 22122042-MDS273L-JAVA;
import java.util.Scanner;

public class emp {

    public static void  main(String[]args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter employee Name  :");
        String Name=sc.nextLine();
        
        System.out.println("enter the age");
        int Age=sc.nextInt();

        System.out.println("Companies :");
        String company = sc.next();
        
        System.out.println("Enter sex: M/F :");
		int sex = sc.next().charAt(0);

        System.out.println("Enter States: ");
        String States=sc.next();
        
        if(sex == 'F') {
			System.out.println("FEMALE ");
        }else{
            System.out.println("MALE");
        }


        

       switch (States){
            case "Andra Pradesh":
                System.out.println("The Employee is from the southern states of India ,Preferable work location is in Andra Pradesh");
               break;
            case "Haryana":
                System.out.println("The Employee is from the northern  states of India ,Preferable work location is in Haryana");
                break;
            case "Manipur":
                System.out.println("The Employee is from the central states of India ,Preferable work location is in Manipur");
                break;
            case "Sikkim":
                System.out.println("The Employee is from the eastern states of India ,Preferable work location is in Sikkim");
                break;
            case "UP":
                System.out.println("The Employee is from the northern states of India ,Preferable work location is in UP");
                break;
            case "Tripura":
                System.out.println("The Employee is from the western states of India ,Preferable work location is in Tripura");
                break;
            case "Telangan":
                System.out.println("The Employee is from the southern states of India ,Preferable work location is in Telangan");
                break;
            case "TamilNadu":
                System.out.println("The Employee is from the southern states of India ,Preferable work location is in TamilNadu");
                break;
            case "Goa":
                System.out.println("The Employee is from the western states of India ,Preferable work location is in Goa");
                break;
            case "Gujrat":
                System.out.println("The Employee is from the western states of India ,Preferable work location is in Gujrat");
                break;
             case "Chattisgarh":
                System.out.println("The Employee is from the western states of India ,Preferable work location is in Chattisgarh");
                break;
            case "Kerala":
                System.out.println("The Employee is from the southern states of India ,Preferable work location is in Kerala");
                break;
            case "Meghalaya":
                System.out.println("The Employee is from the northern  states of India ,Preferable work location is in Meghalaya");
                break;
            case "Karnataka":
                System.out.println("The Employee is from the southern states of India ,Preferable work location is in Karnataka");
                break;
            case "HimachalPradesh":
                System.out.println("The Employee is from the northern  states of India ,Preferable work location is in HimachalPradesh");
                break;
            case "Jharkhand":
                System.out.println("The Employee is from the western states of India ,Preferable work location is in Jharkhand");
                break;
            case "Bihar":
                System.out.println("The Employee is from the eastern states of India ,Preferable work location is in Bihar");
                break;
            case "Maharastra":
                System.out.println("The Employee is from the western states of India ,Preferable work location is in Maharastra");
                break;
            case "Rajasthan":
                System.out.println("The Employee is from the northern  states of India ,Preferable work location is in Rajasthan");
                break;
            case "WestBengal":
                System.out.println("The Employee is from the eastern states of India ,Preferable work location is in WestBengal");
                break;
            case "Nagaland":
                System.out.println("The Employee is from the eastern states of India ,Preferable work location is in Nagaland");
                break;
            case "Punjab":
                System.out.println("The Employee is from the northern states of India ,Preferable work location is in Punjab");
                break;
            case "Odissa":
                System.out.println("The Employee is from the eastern states of India ,Preferable work location is in Odissa");
                break;
            default:
                System.out.println("Bye.");
                break;

       }

            

        
        if (company.equalsIgnoreCase("Facebook") || company.equalsIgnoreCase("Google") || company.equalsIgnoreCase("Amazon") || company.equalsIgnoreCase("Facebook") || company.equalsIgnoreCase("IBM") || company.equalsIgnoreCase("Microsoft") || company.equalsIgnoreCase("Apple")){
            System.out.println("The employee is working in Top MNC Companies");
        }

        




        

    }
    
}
