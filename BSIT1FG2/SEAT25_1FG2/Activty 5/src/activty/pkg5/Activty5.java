package activty.pkg5;



import java.util.Scanner;
import java.text.DecimalFormat;


public class Activty5 {
   static String RED = "\u001B[31m";
   static String GREEN = "\u001B[32m";
   static String BLUE = "\u001B[34m";
   static String CYAN = "\u001B[36m";
   static String WHITE = "\u001B[37m";
   static String YELLOW = "\u001B[33m";
   static String RESET = "\u001B[0m";
   
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        DecimalFormat twodec = new DecimalFormat("0.00");
        
        double radius, length, width, heigth, base, C ;
        area = 0;
        
        while (true){
            
        
        System.out.println("AREA COMPUTATION");
        System.out.println(CYAN + "[1] " + BLUE + "Circle" + RESET);
        System.out.println(CYAN +"[2] " + GREEN + "Rectangle" + RESET);
        System.out.println(CYAN +"[3] " + RED + "Triangle" + RESET);
        System.out.println(CYAN +"[4] " + WHITE + "Exit" + RESET);
        System.out.println("-----------------------------------------------");
        System.out.print("Select the Shape   : ");
        C = input.nextDouble();
        
       
           
        
        if (C==1){
            System.out.print("Radius             : ");
            radius = input.nextDouble();
            area = (3.14 * radius * radius);
            System.out.println("Area of Circle     : " + twodec.format(area));
            System.out.println("==========================================");
            System.out.println("");
            System.out.println("");
        }
   
        else if (C==2){
            System.out.print("Length             : ");
            length = input.nextDouble();
            System.out.print("Width              : ");
            width = input.nextDouble();
            area = length * width;
            System.out.println("Area of Rectangle  : " + twodec.format(area));
            System.out.println("==========================================");
            System.out.println("");
            System.out.println("");
        }
   
       else if (C==3){
            System.out.print("Base               : ");
            base = input.nextDouble();
            System.out.print("Heigth             : ");
            heigth = input.nextDouble();
            area = base * heigth;
            System.out.println("Area of Rectangle  : " + twodec.format(area));
            System.out.println("==========================================");
            System.out.println("");
            System.out.println("");
    
       }
       
       if (C==4){
               System.out.println("");
               System.out.println("DONE NA INAMO");
               break;
           }
       
       else if (C>=4) {
          
           System.out.println(YELLOW + "==========================================");
           System.err.println("INVALID");
           System.out.println("");
           System.out.println("");
           
           
}
}
    }
}