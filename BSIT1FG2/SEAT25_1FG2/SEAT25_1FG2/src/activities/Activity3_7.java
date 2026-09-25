
package activities;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Activity3_7 {
    public static void main(String[]args){
Scanner input = new Scanner(System.in);
 double Quiz=0, Activity=0, Project=0, Exam=0, ClassStanding=0, finalGrade=0;
 DecimalFormat format = new DecimalFormat("0.00");
    System.out.print ("Quiz             :");
    Quiz = input.nextInt ();
    System.out.print ("Activity         :");
    Activity = input.nextInt ();
    System.out.print ("Project          :");
    Project = input.nextInt ();
    System.out.print ("Exam             :");
    Exam = input.nextInt ();
    System.out.print ("Class Standing   :");
    ClassStanding = input.nextInt ();
    System.out.println("------------------------------------");
    finalGrade=(Quiz*0.20)+(Activity*0.15)+(Project*0.25)+(Exam*0.30)+(ClassStanding*0.10);
    System.out.println ("Final grade      :" + format.format(finalGrade));
    

    }
    }
