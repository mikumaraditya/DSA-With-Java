import java.util.*;
public class fail_pass {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks :");
        float marks=sc.nextFloat();

        if(marks>=33){
            System.out.println("You are passed");
        }
        else{
            System.out.println("You are failed");
        }

        sc.close();
    }
    
}
