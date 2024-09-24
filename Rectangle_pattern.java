import java.util.*;
public class Rectangle_pattern {
    public static void hollow_rectangle(int Trows,int Tcols){
        for(int i=1;i<=Trows;i++){
            for(int j=1;j<=Tcols;j++){
                if(i==1 || i==Trows || j==1 || j==Tcols){

                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total number of rows : ");
        int Trows=sc.nextInt();
        System.out.print("Enter the total number of columns : ");
        int Tcols=sc.nextInt();
        hollow_rectangle(Trows, Tcols);
    }
}
