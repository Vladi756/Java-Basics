package learning;

import java.util.Scanner;                                                           // Importing so I can use the scanner function

public class Hot_Dog {
    public static void main(String[] args) {
        
       Scanner order = new Scanner(System.in);
       Scanner payment = new Scanner(System.in);                                    // Initializing two new scanners 
       
       System.out.println("Hello, how many hotdogs would you like to buy?");
       System.out.println("One hotdog costs $2.50.");
       int amount = order.nextInt();                                                // Asks the user to input an integer - integet is asigned to amount
       double cost = amount * 2.5;                                                  // One hotdog is 2.50 - so total cost is therefore amount * 2.50
       
       System.out.println("That costs: " + cost + " dollars.");
       float amounttoPay = payment.nextFloat();
       
       if(amounttoPay == cost) {                                                                                    // Self explanatory if statement to determine whether 
           System.out.print("You have purchased " + amount + " hotdog(s). Thank you for shopping with us.");        // the customer pays the correct amount, a surplus, or
       } else if(amounttoPay < cost) {                                                                              // if the customer is a conman.
           System.out.println("You're trying to con us. We don't deal with people like you - goodbye.");
           
       } else if(amounttoPay > cost) {
           float change = amounttoPay - (float)cost;
           System.out.println("Thank you for shopping with us, you change is " + change);
       }
    }
}
