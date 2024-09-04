import java.util.*;
public class palindrome {
    public static int reverse(int n){
        int rev=0;
        while(n>0){
        int last_digit=n%10;
        
        rev=rev*10+last_digit;
        n=n/10;
        }

        return rev;

    }
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int x=reverse(num);
        System.out.println(x);

        if(x==num){

            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not a Panlindrome Number");
        }

        sc.close();
    }
}
