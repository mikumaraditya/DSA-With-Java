import java.util.*;
public class function_four {
    public static boolean isPrime(int n){
        boolean isPrime=true;
        for(int i=2;i<n;i++){

            if(n%i==0){
                isPrime=false;
                break;
            }
        }

        return isPrime;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();

        // System.out.println(isPrime(n));

        if(isPrime(n)==true){
            System.out.println("Given number is Prime");

        }
        else{
            System.out.println("Given number is Not Prime");
        }

        sc.close();

    }
}
