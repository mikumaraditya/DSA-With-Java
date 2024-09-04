import java.util.*;
public class factorial {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        int fact=1;

        for(int i=1;i<=n;i++){
            fact=fact*i;

        }
        System.out.print("Factorial of given number :");
        System.out.println(fact);

        sc.close();

    }
    
}
