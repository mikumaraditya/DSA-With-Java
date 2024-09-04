import java.util.*;
public class array_fun {
    public static void update(int marks[]){

        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;

        }
        


    }
    public static void main(String args[]){

        int marks[]={78,96,85};
        update(marks);
       
        // for(int i=0;i<marks.length;i++){
            
        //     System.out.println(marks[i]);

        // }
        System.out.println(marks[0]);

        System.out.println(marks[1]);

        System.out.println(marks[2]);


    

    }
}
