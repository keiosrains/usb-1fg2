package activities;
import java.util.Scanner;

public class Activity5_Seat25{
    public static void main(String[] args){
        
      Scanner input = new Scanner(System.in);
      
      int choice;
      double r, l, w, b, h, a;
      
      System.out.println("Area Computation");
      System.out.println("[1]Circle");
      System.out.println("[2]Rectangle");
      System.out.println("[3]Triangle");
      System.out.print("Please enter your choice: ");
      choice = input.nextInt();
      
      if (choice==1){
           System.out.print("Enter radius: ");
           r = input.nextDouble();
           
           a = 3.14*r*r;
           System.out.println("Area of Circle: "+a);
      }
      else if(choice==2){
           System.out.print("Enter length: ");
           l = input.nextDouble();
           
           System.out.print("Enter width: ");
           w = input.nextDouble();
           
           a = l*w;
           System.out.println("Area of Rectangle: "+a);

      }
      else if(choice==3){
           System.out.print("Enter base: ");
           b = input.nextDouble();
           
           System.out.print("Enter height: ");
           h = input.nextDouble();
           
           a = 0.5*b*h;
           System.out.println("Area of Triangle: "+a);

      }
      else{
          System.out.println("You have entered an invalid choice!");
      }
    }        
            
            
            
}

