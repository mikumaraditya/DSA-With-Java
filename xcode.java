import java.util.*;
public class xcode{
    
    public static void linearSearch(char arr[],char key){
        
        for(int i=0;i<arr.length;i++){
            
            if(arr[i] == key){
                
                System.out.print(i);
                
            }
            
        }
        
        
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        char arr[]=new char[26];
        char ch='A';
        
        for(int i=0;i<arr.length;i++){
            
            arr[i]=ch;
            ch++;
            System.out.print(arr[i]+" ");
        }
        char key='K';
        System.out.println();
        linearSearch(arr,key);
    }
}  

