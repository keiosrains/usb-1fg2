package activities;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Activity4_4 {
    public static void main(String[] args){
        
    DecimalFormat twodec= new DecimalFormat("0.00");
    Scanner input= new Scanner(System.in);
    
    double quiz,activity,project,exam,cs,fg;
    
    
    System.out.print("Quiz           : ");
    quiz=input.nextDouble();
    System.out.print("Activity       : ");
    activity=input.nextDouble();
    System.out.print("Project        : ");
    project=input.nextDouble();
    System.out.print("Exam           : ");
    exam=input.nextDouble();
    System.out.print("Class Standing : ");
    cs=input.nextDouble();
    fg=(quiz)*0.20+(activity)*0.15+(project)*0.25+(exam)*0.30+(cs)*0.10;
            
    System.out.println("-------------------------------------------");
    System.out.println("Final Grade    : " + twodec.format(fg));
        
    if(fg>=75){
        System.out.println("Remarks        : Passed");
    }
    
    else{
        System.out.println("Remarks        : Failed");
    }
    
    }
}