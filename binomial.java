import java.util.*;
public class binomial {
    public static int fact(int x){
        int fact=1;
        for(int i=1;i<=x;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
       

        int a=fact(n1);
        int b=fact(n2);
        int c=fact(n1-n2);

        int binom=a/(b*(c));

        System.out.println(binom);


        sc.close();



    }
    
}
