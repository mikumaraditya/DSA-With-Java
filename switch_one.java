import java.util.*;
public class switch_one {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the charater :");
        int ch=sc.next().charAt(0);

        switch(ch){

            case 'A': System.out.println("Outstanding");
            break;

            case 'B': System.out.println("Excellent");
            break;

            case 'C': System.out.println("Very Good");
            break;

            case 'D': System.out.println("Good");
            break;

            case 'F': System.out.println("Fail");
            break;

            default: System.out.println("Invalid Character");
        }


        sc.close();
    }
    
}
