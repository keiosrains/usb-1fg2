
package activities;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ACTIVITY5_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        DecimalFormat TD = new DecimalFormat ("0.00");
        int choice; 
        double radius = 0, circleSolve = 0, length = 0, width = 0, rectangleSolve = 0, base = 0, height = 0, triangleSolve = 0;
        System.out.println ("-------------------------------------------------------------------------------------------");
        System.out.println ("AREA COMPUTATION\n(1)Circle\n(2)Rectangle\n(3)Triangle"); 
        System.out.println ("-------------------------------------------------------------------------------------------");
        System.out.print ("Choice                  :");
                choice = input.nextInt ();
                System.out.println ("-------------------------------------------------------------------------------------------");
                if (choice == 1)
                {
                    System.out.println ("Area Of Circle Computation");
                    
                    System.out.print ("Radius       :");
                    radius = input.nextDouble();
                    
                    circleSolve = 3.14 * radius * radius;
                    System.out.println ("Area of      :" + TD.format (circleSolve));
                     System.out.println ("-------------------------------------------------------------------------------------------");
 
                }else if (choice == 2){
                System.out.println ("Area of Rectangle Computation");
                System.out.println ("Length           :");
                length = input.nextDouble();
                System.out.println ("Width            :");
                width = input.nextDouble();
                rectangleSolve = length * width;
                System.out.println ("Area of rectangle         :" + TD.format(rectangleSolve));
                 System.out.println ("-------------------------------------------------------------------------------------------");}
                else if (choice == 3){
                    System.out.println("Area of Triangle Compuation");
                    System.out.print ("Base            :");
                            base = input.nextDouble();
                            System.out.println("Height          :");
                            input.nextDouble();
                            triangleSolve = 0.5 * base * height;
                            System.out.println("Area" + TD.format (triangleSolve));
                              System.out.println ("-------------------------------------------------------------------------------------------");
 
                }
                else{
                    System.out.println ("Please choose between the number selection above.");
                }
    
    }
    
    
   
}


