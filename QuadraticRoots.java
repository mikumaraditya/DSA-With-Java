import java.util.*;
public class QuadraticRoots{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        float d=(b*b)-4*a*c;
        float D=(float)Math.sqrt(d);

        float r1 =((-b)+D)/2*a;

        float r2 =((-b)-D)/2*a;

        System.out.println(r1+"  "+r2);

        sc.close();
    }
}

 


 