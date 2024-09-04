import java.util.*;
public class pattern_one {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.print("****");
            System.out.println();
        }
        

        sc.close();
    }
    
}
