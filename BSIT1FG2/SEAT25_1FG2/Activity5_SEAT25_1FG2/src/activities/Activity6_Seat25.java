package activities;

import java.util.Scanner;

public class Activity6_Seat25 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
      char choice;
      double r, l, w, b, h, a;
      
      System.out.println("Area Computation");
      System.out.println("[C]Circle");
      System.out.println("[R]Rectangle");
      System.out.println("[T]Triangle");
      System.out.print("Please enter your choice: ");
      choice = input.next().charAt(0);
      choice = Character.toUpperCase(choice);
       
       System.out.println();
       System.out.println("------------------------------------");
       
       
       switch (choice){
           
           case 'C' :{
               System.out.print("Enter radius: ");
               r = input.nextDouble();
           
               a = 3.14*r*r;
               System.out.println("Area of Circle: "+a);
               break;
           }
           case 'R'  :{
               System.out.print("Enter length: ");
               l = input.nextDouble();
           
               System.out.print("Enter width: ");
               w = input.nextDouble();
           
               a = l*w;
               System.out.println("Area of Rectangle: "+a);
               break;
           }
           case 'T'  :{
               System.out.print("Enter base: ");
               b = input.nextDouble();

               System.out.print("Enter height: ");
               h = input.nextDouble();

               a = 0.5*b*h;
               System.out.println("Area of Triangle: "+a);
               break;
           }
           default:{
               System.out.println("You have entered an invalid choice!");
               break;
           }
               
       }
    }
    
}
