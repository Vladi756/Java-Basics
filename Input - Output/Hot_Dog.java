package learning;

import java.util.Scanner;

public class Hot_Dog {
    public static void main(String[] args) {
        
       Scanner order = new Scanner(System.in);
       Scanner payment = new Scanner(System.in);
       
       System.out.println("Hello, how many hotdogs would you like to buy?");
       System.out.println("One hotdog costs $2.50.");
       int amount = order.nextInt();
       double cost = amount * 2.5;
       
       System.out.println("That costs: " + cost + " dollars.");
       float amounttoPay = payment.nextFloat();
       
       if(amounttoPay == cost) {
           System.out.print("You have purchased " + amount + " hotdog(s). Thank you for shopping with us.");
       } else if(amounttoPay < cost) {
           System.out.println("You're trying to con us. We don't deal with people like you - goodbye.");
           
       } else if(amounttoPay > cost) {
           float change = amounttoPay - (float)cost;
           System.out.println("Thank you for shopping with us, you change is " + change);
       }
    }
}
