package TakeOut;

import java.util.Scanner;

public class TakeOut {


    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        char type ='0';
        int numOfTrays = 0;
        int feeds = 0;
        double price = 0.00;
        double subTotal = 0.00;
        double tax = 0.00;
        double tip = 0.00;
        double grandTotal = 0.00;
        double pricePerPerson = 0.00;
        int leftOvers =0;

        System.out.println("Enter the number of people ordering the food: ");
        int numOfPeople = input.nextInt();
        if(numOfPeople > 100 || numOfPeople < 10){
            System.out.println("Number of people you entered is not valid!");
            System.exit(0);
        }
        TakeOut.displayMenu();

        do{
            System.out.println("Enter the type of food...");
            type = input.next().charAt(0);
            type = Character.toUpperCase(type);

            switch (type){
                case 'I':   displayItalianFoodMenu();break;
                case 'C':   displayChineseFoodMenu(); break;
                case 'A':   displayAmericanFoodMenu();break;
                default:
                    System.out.println("Invalid input!"); break;

            }
            if(type =='I'||type=='C'||type=='A') break;

        }while(type !='I'||type!='C'||type!='A');

        System.out.println("\nEnter your choice in number : ");
            int choice = input.nextInt();
            if (type == 'I') {
                if (choice == 1) {
                    price = 17.99;
                    feeds = 5;
                    numOfTrays = determineTrays(numOfPeople, feeds);
                } else if (choice == 2) {
                    price = 15.99;
                    feeds = 7;
                    numOfTrays = determineTrays(numOfPeople, feeds);
                } else if (choice == 3) {
                    price = 12.99;
                    feeds = 4;
                    numOfTrays = determineTrays(numOfPeople, feeds);
                }
            } else if (type == 'C') {
                if (choice == 1) {
                    price = 18.99;
                    feeds = 7;
                    numOfTrays = determineTrays(numOfPeople, feeds);
                } else if (choice == 2) {
                    price = 18.99;
                    feeds = 7;
                    numOfTrays = determineTrays(numOfPeople, feeds);
                } else if (choice == 3) {
                    price = 10.99;
                    feeds = 5;
                    numOfTrays = determineTrays(numOfPeople, feeds);
                }

            } else if (type == 'A') {
                if (choice == 1) {
                    price = 21.99;
                    feeds = 8;
                    numOfTrays = determineTrays(numOfPeople, feeds);
                } else if (choice == 2) {
                    price = 22.99;
                    feeds = 5;
                    numOfTrays = determineTrays(numOfPeople, feeds);
                } else if (choice == 3) {
                    price = 26.99;
                    feeds = 10;
                    numOfTrays = determineTrays(numOfPeople, feeds);

                }
            }

        System.out.println("Number of trays : " + numOfTrays);
        subTotal = getSubtotal(price,numOfTrays);
        System.out.println("\nPrice before tax: "+subTotal);
        tax = getTax(subTotal,0.07);
        System.out.println("Tax: "+tax);
        tip = getTip(subTotal,0.15);
        System.out.println("Tip: "+tip);
        grandTotal = getGrandTotal(subTotal,tax,tip);
        System.out.println("Grand total is:"+grandTotal);
        pricePerPerson = pricePerPerson(grandTotal,numOfPeople);
        System.out.println("Price per person: "+pricePerPerson);
        leftOvers = determineLeftOvers(feeds,numOfTrays,numOfPeople);
        System.out.println("Leftover serving for the delivery person: "+leftOvers);


    }

    public static void displayMenu() {
        System.out.println("Choose Take Out Menu:\n" +
                "1.Italian\n" +
                "2.Chinese\n" +
                "3.American\n");
    }

    public static void displayItalianFoodMenu() {
        System.out.println("1. Lasagna Tray - Feeds 5 - 17.99\n" +
                "2. Pizza Pack - Feeds 7 - 15.99\n" +
                "3. Gazpacho Soup, salad and bread sticks pack - Feeds 4 - 12.99");

    }

    public static void displayChineseFoodMenu() {
        System.out.println("1. Chicken and Broccoli Tray (includes 7 wonton soups, 7 egg rolls) - feeds 7 - 18.99\n" +
                "2. Sweet and Sour Pork Tray (includes 7 hot and sour soups, 7 egg rolls) - feeds 7 - 18.99\n" +
                "3. Shrimp Fried Rice Tray (includes 10 egg rolls) - Feeds 5 - 10.99");

    }

    public static void displayAmericanFoodMenu() {
        System.out.println("1. Hamburger and Hot Dog Tray - includes buns and condiments - feeds 8 - 21.99\n" +
                "2. Grilled Chicken Sandwich and Mozzarella Sticks Tray - includes dipping sauces -Feeds 5 -\n" +
                "22.99\n" +
                "3. Barbeque Tray - includes buns and peach cobbler - Feeds 10 - 26.99");
    }
    public static int determineTrays(int people, int feeds){
    double tray = (double)people/(double)feeds;
    int numOfTrays = (int)Math.ceil(tray);
    return numOfTrays;

    }
    public static double getSubtotal(double price, int trays){
    return price*trays;
    }
    public static double getTax(double subtotal, double taxrate){
    return subtotal*taxrate;
    }
    public static double getTip(double subtotal, double tipRate){
    return subtotal*tipRate;
    }
    public static double getGrandTotal(double subtotal, double tax, double tip){
    return subtotal + tax + tip;
    }
    public static double pricePerPerson(double grandTotal, int people){
    return grandTotal/people;
    }
    public static int determineLeftOvers(int feeds, int trays, int people){
    return feeds* trays - people;
    }
}