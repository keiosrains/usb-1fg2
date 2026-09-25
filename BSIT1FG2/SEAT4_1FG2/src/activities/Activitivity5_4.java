package activities;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Activitivity5_4 {
    public static void main(String [] args){
        
        Scanner input= new Scanner(System.in);
        DecimalFormat twodec= new DecimalFormat("0.00");
         
        int choice;
        
        double radius,length,width,base,height,AOC,AOR,AOT;
        
        System.out.println("Choose a method to solve for area!\n");
        System.out.println("----------------------------");
        
        System.out.println("AREA COMPUTATION ");
        System.out.println("[1] CIRCLE ");
        System.out.println("[2] RECTANGLE ");
        System.out.println("[3] TRIANGLE ");
        System.out.println("----------------------------");
        System.out.print("Enter your choice     : ");
        choice=input.nextInt();
        System.out.println("----------------------------");
        
        if(choice==1){
           System.out.print("Insert radius         : ");
           radius=input.nextDouble();
           AOC= 3.14*radius*radius;
           System.out.println("AOC:   "+ twodec.format(AOC));
        }
        
         else if (choice==2){
           System.out.print("Insert length         : ");
           length=input.nextDouble();
           System.out.print("Insert width          : ");   
           width=input.nextDouble();
           AOR= length*width;
           System.out.println("AOR:   "+ twodec.format(AOR));

        }
        else if (choice==3){
           System.out.print("Insert base           : ");
           base=input.nextDouble();
           System.out.print("Insert heigth         : ");   
           height=input.nextDouble();
           AOT= 0.5*base*height;
           System.out.println("AOT:   "+ twodec.format(AOT));
           }
           else {
           System.out.println("Inputed invalid choice");
           }
           System.out.println("----------------------------");
   
          }
    
}
