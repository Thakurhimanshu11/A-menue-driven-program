/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int input ;
        do{
            int marks = sc.nextInt();
            if(marks>90 && marks<100){
                System.out.println("best");
            }
            else if(marks>=60 && marks<90){
                System.out.println("this is good");
            }        
            else if(marks>0 && marks<=59){
                System.out.println("this is also good");
            }
            else{
                System.out.println("invalid");
            }
            System.out.println("wants to continue ? yes(1) or no(0)");
        
            input = sc.nextInt();
        }while(input==1);
    }
}