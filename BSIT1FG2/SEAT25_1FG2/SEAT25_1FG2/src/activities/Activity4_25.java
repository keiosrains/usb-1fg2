package activities;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Activity4_25 {
    public static void main(String[]args){
    
    Scanner input = new Scanner(System.in);
    DecimalFormat twodec = new DecimalFormat("0.00");
   
    
    int quiz, act, proj, exam, cs;
    double fg;
    
    System.out.print("Quiz             :       ");
    quiz=input.nextInt();
    System.out.print("Activity         :       ");
    act=input.nextInt();
    System.out.print("Project          :       ");
    proj=input.nextInt();
    System.out.print("Exam             :       ");
    exam=input.nextInt();
    System.out.print("Class Standing   :       ");
    cs=input.nextInt();
    System.out.println("---------------------------------");
    fg=(quiz*0.2)+(act*0.15)+(proj*0.25)+(exam*0.3)+(cs*0.1);
    System.out.println("Final Grade      :       "+twodec.format(fg));
    
    if(fg>=75){
        System.out.println("Remarks          :       PASSED");
    }
    else{
        System.out.println("Remarks:         :       FAILED");
    }
    }
}

