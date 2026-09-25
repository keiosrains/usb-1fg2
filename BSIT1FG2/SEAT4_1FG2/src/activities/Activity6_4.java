package activities;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Activity6_4 {
    
    public static void main(String [] args){
        
        Scanner input= new Scanner(System.in);
        DecimalFormat twodec= new DecimalFormat("0.00");
         
        int choice;
        
        double radius,length,width,base,height,AOC,AOR,AOT;
        
        System.out.println("Choose a method to solve for area!\n");
        System.out.println("----------------------------");
        
        System.out.println("AREA COMPUTATION ");
        System.out.println("[C] CIRCLE ");
        System.out.println("[R] RECTANGLE ");
        System.out.println("[T] TRIANGLE ");
        System.out.println("----------------------------");
        System.out.print("Enter your choice     : ");
        choice=input.next().charAt(0);
        choice=Character.toUpperCase(choice);
        System.out.println("----------------------------");
        
        switch (choice){
            
           case 'C' : {
           System.out.print("Insert radius         : ");
           radius=input.nextDouble();
           AOC= 3.14*radius*radius;
           System.out.println("AOC:   "+ twodec.format(AOC));
           break;
                
        }
        
           case 'R' : {
           System.out.print("Insert length         : ");
           length=input.nextDouble();
           System.out.print("Insert width          : ");   
           width=input.nextDouble();
           AOR= length*width;
           System.out.println("AOR:   "+ twodec.format(AOR));
           break;
        }
           case 'T' : {
           System.out.print("Insert base           : ");
           base=input.nextDouble();
           System.out.print("Insert heigth         : ");   
           height=input.nextDouble();
           AOT= 0.5*base*height;
           System.out.println("AOT:   "+ twodec.format(AOT));
           break;
           }
           
           default : {
           System.out.println("Inputed invalid choice");
           break;
           }
           System.out.println("----------------------------");
   
          }
    }
}

