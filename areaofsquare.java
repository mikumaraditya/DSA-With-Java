import java.util.*;
public class areaofsquare {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side of square:");
        float s=sc.nextFloat();

        float area=s*s;

        System.out.println(area);

        sc.close();
    }

    
}
