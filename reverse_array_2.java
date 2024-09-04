public class reverse_array_2 {
    public static void reverse(int num[]){

        int start=0;
        int last=num.length-1;

        while(start<=last){

            System.out.print(num[last]+" ");
            last--;
        }
    }
    public static void main(String args[]){

        int num[]={2,4,6,8,10,12,14,16,18,20};

        reverse(num);
    }
    
}
