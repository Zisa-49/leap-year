
package practice2;
 import java.util.Scanner;
public class Leap_year {
    public static void main(String[]ags){
       
        System.out.print("Enter the checking year:");
         Scanner input=new Scanner(System.in);
         int year=input.nextInt();
         
          if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.print(year+"is a leap year.");
         else
             System.out.print(year+"is not leap year.");
         
        
    }
    
}
