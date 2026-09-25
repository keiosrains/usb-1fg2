
package activities;

import java.util.Scanner;
import java.text.DecimalFormat;
        
public class Activity3_28 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat twodec = new DecimalFormat ("0.00");
        
        double quiz, act, proj, exam, cs, fg;
        
        System.out.print("Quiz:            ");
        quiz = scanner.nextDouble();
                
        System.out.print("Activity:        ");
        act = scanner.nextDouble();
        
        System.out.print("Project:         ");
        proj = scanner.nextDouble();
        
        System.out.print("Exam:            ");
        exam = scanner.nextDouble();
        
        System.out.print("Class Standing:  ");
        cs = scanner.nextDouble();
        
        fg = (0.2*quiz)+(0.15*act)+(0.25*proj)+(0.3*exam)+(0.1*cs);
                
                System.out.println("------------------------");
                System.out.println("Final Grade:     "+ twodec.format (fg));
    }
}