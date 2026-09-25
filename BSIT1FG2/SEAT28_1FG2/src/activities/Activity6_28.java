package activities;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Activity6_28 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat twodec = new DecimalFormat ("0.00");
        
        double circle, rectangle, triangle, radius, base, height, length, width;
        char choice;
        
        System.out.println("|-----------------|");
        System.out.println(" Area Computation");
        System.out.println(" [C] Circle");
        System.out.println(" [R] Rectangle");
        System.out.println(" [T] Triangle");
        System.out.println("|-----------------|");
        System.out.print("\nEnter the number for the\nshape of your choice: ");
        choice = scanner.next().charAt(0);
        choice = Character.toUpperCase(choice);
        System.out.println("\n|-----------------|");
        
        // SWITCH CASE
            
        switch (choice){
            case 'C':{
            System.out.println("\nYou chose circle!");
            System.out.print("What is the circle's radius?:  ");
            radius = scanner.nextDouble();

            circle = 3.14*radius*radius;

            System.out.println("\nThe area of your circle is "+ twodec.format (circle) +"!");
            }
            case 'R':{
            System.out.println("\nYou chose Rectangle!");
            System.out.print("\nWhat is the Rectangle's length? :  ");
            length = scanner.nextDouble();
            System.out.print("\nWhat is the Rectangle's width?  :  ");
            width = scanner.nextDouble();
            
            rectangle = length*width;
            
        System.out.println("\nThe area of your rectangle is "+ twodec.format (rectangle) +"!");
            }
        }
            
            
            
    
       /* if (choice==1){
        System.out.println("\nYou chose circle!");
        System.out.print("What is the circle's radius?:  ");
        radius = scanner.nextDouble();
        
        circle = 3.14*radius*radius;
        
        System.out.println("\nThe area of your circle is "+ twodec.format (circle) +"!");
        
    }
        else if (choice==2) {
            System.out.println("\nYou chose Rectangle!");
            System.out.print("\nWhat is the Rectangle's length? :  ");
            length = scanner.nextDouble();
            System.out.print("\nWhat is the Rectangle's width?  :  ");
            width = scanner.nextDouble();
            
            rectangle = length*width;
            
        System.out.println("\nThe area of your rectangle is "+ twodec.format (rectangle) +"!");
                
    }
        else if (choice==3) {
            System.out.println("\nYou chose Triangle!");
            System.out.print("\nWhat is the Triangle's Base? :  ");
            base = scanner.nextDouble();
            System.out.print("\nWhat is the Triangle's Height?  :  ");
            height = scanner.nextDouble();
            
            triangle = (base*height)/3;
            
        System.out.println("\nThe area of your rectangle is "+ twodec.format (triangle) +"!");
        }
        else {
            System.out.println("\nInvalid input, must be 1-3 :(");
        }
        
        System.out.println("\n|-----------------|");
        scanner.close(); */
    }
}