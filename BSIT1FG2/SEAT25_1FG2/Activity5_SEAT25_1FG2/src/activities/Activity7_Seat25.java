package activities;

import java.util.Scanner;
        
public class Activity7_Seat25 {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        
      char choice;
      double pc, qty, ad;
      
      System.out.print("Product Code  :   ");
      choice = input.next().charAt(0);
      choice = Character.toUpperCase(choice);
            
      if(choice=='A'){
         System.out.print("Quantity      :   ");
         qty = input.nextInt();
         System.out.println("-------------------------------");
         
         if(qty<0){
             System.out.print("Invalid Quantity");
         }
         else if(qty>20){
             System.out.print("Stocks not sufficient");
         }
         else ((qty>0)&&(qty<=20)){
             System.out.println("Unit Price :  120.00");
             
             ad = qty*120;
             System.out.println("Amount Due :  "+ad); 
         }
      }
      else if(choice=='B'){
         System.out.print("Quantity      :   ");
         qty = input.nextInt();
         System.out.println("-------------------------------");
         
         if(qty<0){
             System.out.print("Invalid Quantity");
         }
         else if(qty>30){
             System.out.print("Stocks not sufficient");
         }
         else((qty>0)&&(qty<=30)){
             System.out.println("Unit Price :  100.00");
             
             ad = qty*100;
             System.out.println("Amount Due :  "+ad); 

    }
         else{
                 System.out.println("Product not available");
                 }
    
}
