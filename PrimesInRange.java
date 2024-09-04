import java.util.*;
 public class PrimesInRange {
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
     public static void PrimeInRange(int n){
        for(int i=2;i<=n;i++){
           
            if(isPrime(i)==true){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
        PrimeInRange(n);


        sc.close();
    }
}
