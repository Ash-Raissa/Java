import java.sql.SQLOutput;
import java.util.Scanner; //bring the reading tool

public class Main {
    public static void main(String [] args){

        //we use print, println also for a new line. or \n
        System.out.print("I like Apple!\n");
        System.out.print("It's good.\n");
        System.out.print("Bring me Apples");



        //Variables
        //Integers
        int age = 28;
        //System.out.println(age);
        //with a string
        int year = 2026;
       // System.out.println("The year is " + year);

        //double
        double price = 199.23;
        double temperature = -12.23;

        //System.out.println(price);
        //System.out.println(temperature);

        //Char

        char grade = 'A';
        char currency = '$';
        //System.out.println(grade);

        //Booleans - true or false

        boolean isStudent = true;
        boolean forSale = false;
        //System.out.println(isStudent);
        //System.out.println(forSale);

        //String

        String name = "Raissa Bavurhe";
       // System.out.println("my name is " + name);
        System.out.println("The price is:" + currency + price);

        double price2 = 50000.10;
        String currency2 = "Ugx";
        //System.out.println("The price is:" + currency2 + price2);

        boolean isForSale = true;
        String car = "Range Rover";

        if(isForSale){
            System.out.println("The " + car + " is for sale");
        }else{
            System.out.println("The " + car + " is not for sale");
        };



        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What is your GPA : ");
        double gpa = scanner.nextDouble();


        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You're " + age+ " years old");
        System.out.println("Your GPA is " + gpa);
        System.out.println("Student: " + isStudent);

        if(isStudent){
            System.out.println("You are registered");

        }else{
            System.out.println("You're not registered");
        }



        System.out.println("Are you married? true/false :" );
        boolean isMarried = scanner.nextBoolean();

        if(isMarried){
            System.out.println("you are married");
        } else{
            System.out.println("You are not married");
        };

        System.out.println("How old are you? : ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("I am " + age + " years old");

        System.out.println("What do you do?:");
        String job = scanner.nextLine();
        System.out.println("I am a " + job);

        System.out.println("How much do you earn? : ");
        double price = scanner.nextDouble();
        System.out.println("in what currency?: ");
        String currency = scanner.next();

        System.out.println("I earn " + price + currency);



        //calculate area of rectangle

        double length = 0;
        double width = 0;
        double area = 0;

        System.out.println("Enter width: ");
        width = scanner.nextDouble();

        System.out.println("Enter length");
        length = scanner.nextDouble();

        area = width * length;
        System.out.println("The area is " + area + "squared cm");



        //SHOPPING CART PROGRAM

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.println("What item would you like to buy? : ");
        item = scanner.nextLine();
        System.out.println(item); //testing the code

        System.out.println("What is the price for each? :" );
        price = scanner.nextDouble();
        System.out.println(price); //testing

        System.out.println("How many would you want?" );
        quantity = scanner.nextInt();
        total = price * quantity;

        System.out.println(total);

        scanner.close();

















    }


}





