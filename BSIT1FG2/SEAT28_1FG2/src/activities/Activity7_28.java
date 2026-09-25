
package activities;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Activity7_28 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat twodec = new DecimalFormat ("0.00");
    
    char product;
    int quantity;
    double amount;
    
    System.out.print("Product Code  :    ");
    product = scanner.next().charAt(0);
    product = Character.toUpperCase(product);
    
    if (product=='A'){
        System.out.print("Quantity      :    ");
        quantity = scanner.nextInt();
        System.out.println("-----------------");
        if (quantity<=0){
            System.out.println("Invalid Quantity");
        }
        else if (quantity>20) {
            System.out.println("Insufficient Stock");
        }
        else {
            amount = 120*quantity;
            
            System.out.println("Unit Price   :   120.00");
            System.out.println("Amount Due   :   " + twodec.format (amount));
        }
            }
        else if (product=='B') {
        System.out.print("Quantity      :    ");
        quantity = scanner.nextInt();
        System.out.println("-----------------");
        if (quantity<=0){
            System.out.println("Invalid Quantity");
        }
        else if (quantity>30) {
            System.out.println("Insufficient Stock");
        }
        else {
            amount = 100*quantity;
            
            System.out.println("Unit Price   :   100.00");
            System.out.println("Amount Due   :   " + twodec.format (amount));
        }
        }
        else {
        System.out.println("-----------------");
        System.out.println("Product Not Available");
        }     
}    
}
