import java.util.*;
public class bill {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter price of pencil : ");
        float pencil=sc.nextFloat();
        System.out.println("Enter the price of pen : ");
        float pen=sc.nextFloat();
        System.out.println("Enter the price of eraser : ");
        float eraser=sc.nextFloat();

        float total=(pencil+pen+eraser);

        System.out.println("Bill without GST : "+ total);

        float total_gst=0.18f*total;

        System.out.print("Bill with GST : "+(total+total_gst));

        sc.close();
    }

    
}
