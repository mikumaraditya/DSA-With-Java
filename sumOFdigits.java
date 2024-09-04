import java.util.*;
public class sumOFdigits {
    public static int addnum(int n){
        int sum=0;
        int last_digit;
        while(n>0){

            last_digit=n%10;
            sum=sum+last_digit;
            n=n/10;
        }
        return sum;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value :");
        int num=sc.nextInt();

        System.out.println(" Sum Of Digits Of Entered Number = "+addnum(num));


        sc.close();

    }
    
}
