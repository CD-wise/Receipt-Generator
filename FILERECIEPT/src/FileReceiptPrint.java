import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileReceiptPrint {
    public static void main(String[] args) {
        //declaring variables
        double priceOfOneshirt, priceAPairOfPants, priceOfOneDress;
        int numberOfShirt,numberOfPants,numberOfDress;
        int totalNumberOfItems;
        double totalOrder;
        String CustomerName, HomePhone;
        double subtotalShirts,subtotalPants,subtotalDresses;
        short OrderMonth, OrderDay, OrderYear;

        final double discountRate = 0.015;


        Scanner scanner = new Scanner(System.in);

        //Input customer details
        System.out.println("Welcome to AMA JESSICA VENTURES");
        System.out.println("Please enter customer's name ");
       CustomerName = scanner.nextLine();
        System.out.println("Enter customer's telephone");
       HomePhone = scanner.next();

       //input price details
        System.out.println("Enter the price of one shirt");
        priceOfOneshirt = scanner.nextDouble();
        System.out.println("Enter the price of a pair of pant");
        priceAPairOfPants = scanner.nextDouble();
        System.out.println("Enter the price of one dress");
        priceOfOneDress = scanner.nextDouble();

        //Input number of items bought
        System.out.println("Enter number of shirt bought ");
        numberOfShirt = scanner.nextInt();
        System.out.println("Enter number of pants bought");
        numberOfPants = scanner.nextInt();
        System.out.println("Enter number of dresses bought");
        numberOfDress = scanner.nextInt();

        //Input Calender details
        System.out.println("\n Enter details of transaction");
        System.out.println("**********************************");
        System.out.println("Enter day number");
        OrderDay = scanner.nextShort();
        System.out.println("Enter the month number");
        OrderMonth =scanner.nextShort();
        System.out.println("Enter the year number");
        OrderYear = scanner.nextShort();

        //Perform calculations
        totalNumberOfItems = numberOfDress + numberOfPants + numberOfShirt;
        subtotalDresses = numberOfDress * priceOfOneDress;
        subtotalPants = numberOfPants * priceAPairOfPants;
        subtotalShirts = numberOfShirt * priceOfOneshirt;
        totalOrder = subtotalDresses + subtotalPants + subtotalShirts;

        //Display Receipt
        try {
            FileWriter fileWriter = new FileWriter("Buyers Receipt.txt");
            PrintWriter writer = new PrintWriter(fileWriter);

            writer.println("AMA JESSICA'S VENTURES (AJV)");
            writer.println("******************************");
            writer.println("Customer:"+CustomerName);
            writer.println("Telephone:"+HomePhone);
            writer.println("Order-Date:"+OrderDay+"/"+OrderMonth+"/"+OrderYear);
            writer.println("_______________________________");
            writer.println("Items\t Qty\tUnit-Price\tSub-total");
            writer.println("shirts:\t  "+numberOfShirt+"\t  "+priceOfOneshirt+"\t          "+subtotalShirts);
            writer.println("Pants: \t  "+numberOfPants+"\t  "+priceAPairOfPants+"\t          "+subtotalPants);
            writer.println("dress: \t  "+numberOfDress+"\t  "+priceOfOneDress+"\t          "+subtotalDresses);
            writer.println("_____________________________________________________________");
            writer.println("Number of items:"+totalNumberOfItems);
            writer.println("Total Order:GHc"+totalOrder);
            writer.println("Total Discount:Ghc"+totalOrder*discountRate);
            writer.println("============================================================");
            writer.println("Created by Benjamin Abakah");
            writer.println("01200644D\n"+"Cps 2C");
            writer.close();
        }catch (IOException e){
            System.out.println("Error");
        }

    }
}
