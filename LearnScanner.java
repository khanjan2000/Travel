//This line imports scanner utility.
import java.util.Scanner;

public class LearnScanner{

    public static void main(String[] args) {
        System.out.println("Hello W");
        System.out.println("1 is intro");
        System.out.println("2 is budget");
        System.out.println("3 is CheckList");
        System.out.println("4 is Insurance");
        System.out.println("5 is CarPayment");
        System.out.println("6 is the no of partners");
        Scanner input = new Scanner(System.in);


        int s1 = input.nextInt();
        switch (s1) {
            case 1:

                intro();
                break;
            case 2:
                budget();
                break;
            case 3:
                CheckList();
                break;
            case 4:
                Insurance();
                break;
            case 5:
                CarPayment();
                break;
            case 6:
                noofpartner();
            case 7:
                nameofpartner();
                break;
                default:
                    System.out.println("Invalid input");
        }
    }



        public static void intro() {
            Scanner input = new Scanner(System.in);
            System.out.println("Welocme to vacation planner");
            System.out.println("Name?");
            String name = input.nextLine();
            System.out.println("Welcome " + name);
            System.out.println("Where are you going");
            String place = input.next();
            System.out.println("good destination is " + place);
        }
        public static void budget(){
            Scanner input = new Scanner(System.in);
            System.out.println("whats your budget");
            double budget = input.nextDouble();
            System.out.println("budget is "+ budget);
        }
        public static void CheckList(){
        Scanner input = new Scanner(System.in);
        System.out.println("Things to carry");
        String CheckList = input.nextLine();
        System.out.println("Materials to carry"+ CheckList);
        }
        public static void Insurance(){
        Scanner input = new Scanner(System.in);
        System.out.println("Company for insurancee");
        String Insurance = input.next();
        System.out.println("Name of insurance company is "+ Insurance);
        }
        public static void CarPayment(){
        Scanner input = new Scanner(System.in);
        System.out.println("Payment for car ");
        int CarPayment = input.nextInt();
        System.out.println("Payment for car = "+ CarPayment);
        String Carname = input.nextLine();
        System.out.println("You have a very good car "+ Carname);
        }
        public static void Days() {
        Scanner input = new Scanner(System.in);
        System.out.println("Number of days");
        String Days = input.nextLine();
        System.out.println("Number of days" +Days);
        }
        public static void noofpartner(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter no of partners");
        int noofpartner = input.nextInt();
        System.out.println("no of partners = " + noofpartner);
        }
        public static void nameofpartner(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the name of partners");
        String nameofpartner = input.nextLine();
        System.out.println("name of partners =" + nameofpartner);
        }
}




