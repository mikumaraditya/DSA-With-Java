import java.util.*;
public class average {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        float a=sc.nextFloat();
        System.out.println("Enter second number:");
        float b=sc.nextFloat();
        System.out.println("Enter third number:");
        float c=sc.nextFloat();
        System.out.print("Average of three number is : ");
        float avg=(a+b+c)/3;

        System.out.println(avg);


        sc.close();
    }
    
}
