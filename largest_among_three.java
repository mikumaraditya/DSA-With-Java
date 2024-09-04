import java.util.*;
public class largest_among_three {
    public static void main (String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value a :");
        int a=sc.nextInt();
        System.out.println("Enter the value b :");
        int b=sc.nextInt();
        System.out.println("Enter the value c :");
        int c=sc.nextInt();

        if(a>b && a>c){
            System.out.println("a is largest");
        }
        else if(b>a && b>c){
            System.out.println("b is largest");
        }
        else{
            System.out.println("c ia largest");
        }
        sc.close();
    }

    
    
}
