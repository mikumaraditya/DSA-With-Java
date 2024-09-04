import java.util.*;
public class binaryTOdeci {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Binary number:");
        int n=sc.nextInt();
        int num=n;
        int ld=0;
        int deci=0;
        int pow=0;

        while (n>0) {
            ld=n%10;
            deci=deci+ld*(int)Math.pow(2, pow);
            pow++;
            n=n/10;
        }
        System.out.println("Decimal value of "+ num+" = "+deci);

        sc.close();
    }
}
