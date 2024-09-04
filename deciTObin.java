import java.util.*;
public class deciTObin {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=n;
        int bin=0;
        int rem=0;
        int pow=0;

        while(n>0){

            rem=n%2;
            bin=bin+rem*(int)Math.pow(10,pow);

            pow++;
            n=n/2;
        }
        System.out.println("Binary of "+num +" = "+bin);

        sc.close();
 } 
}
