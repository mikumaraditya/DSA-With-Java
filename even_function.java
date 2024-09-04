import java.util.*;
public class even_function {
    public static boolean even(int n){

        boolean isEven=true;

        if(n%2!=0){
            
            isEven=false;
        }
        return isEven;
    }
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number:");
        int num=sc.nextInt();

        System.out.println(even(num));

        sc.close();
    }
    
}
