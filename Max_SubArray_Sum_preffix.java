import java.util.*;
public class Max_SubArray_Sum_preffix {
    public static void MaxSum(int arr[],int n){
        int maxsum=Integer.MIN_VALUE;

        int preffix[]=new int [n];
        preffix[0]=arr[0];
        for(int i=1;i<n;i++){
            preffix[i]=preffix[i-1]+arr[i];
        }
        for(int i=0;i<n;i++){
            int start=i;
            for(int j=0;j<n;j++){
                int end=j;
                int currsum=0;

                currsum= start==0 ?preffix[end]:preffix[end]-preffix[start-1];

                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("Maximum Sum = "+maxsum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.print("Enter the length of an array : ");
        int n=sc.nextInt();
        System.out.print("Enter the values in an array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        MaxSum(arr, n);
    }
    
}
