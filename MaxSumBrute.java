import java.util.*;
public class MaxSumBrute {
    public static void MaxSum(int arr[],int n){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                currsum=0;
                for(int k=i;k<=j;k++){
                    // System.out.print(arr[k]+" ");
                    currsum=currsum+arr[k];
                }
                System.out.println();
                // System.out.println("Current sum : "+currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }

            }
            System.out.println();
        }
        System.out.println("Maximum Sum : "+maxsum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int [10];
        System.out.print("Enter the length of an array : ");
        int n=sc.nextInt();
        System.out.print("Enter the values in an array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        MaxSum(arr, n);
    }
    
}
