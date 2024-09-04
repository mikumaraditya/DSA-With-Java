public class largest_array {
    public static int getlargest(int number[]){

                                                
       int smallest=Integer.MAX_VALUE;          /*


        int largest= Integer.MIN_VALUE;

        for(int i=0;i<number.length;i++){
        
            if(largest<number[i]){

            largest=number[i];
              
            }
        }
       
       */

       for(int i=0;i<number.length;i++){

        if(smallest>number[i]){

            smallest=number[i];
        }

       }
       return smallest;


    }
    public static void main(String args[]){

        int number[]={3,2,83,39,44,54,95,17,34,8,80,92,94,38,77,1};

        System.out.println(getlargest(number));
    }
    
}
