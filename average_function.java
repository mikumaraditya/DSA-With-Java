import java.util.*;
public class average_function {
    public static int average(int a,int b,int c){

      int avg=(a+b+c)/3;

      return avg;

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        System.out.println("Enter c:");
        int c=sc.nextInt();

        int average=average(a,b,c);

        System.out.println("Average = "+average);


        sc.close();
    }
    
}
