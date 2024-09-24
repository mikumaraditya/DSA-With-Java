public class bitmanipulation_even_odd {
    public static void oddOReven(int n){

        int bitMask=1;

        if((n&bitMask)==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }

    }
    public static void main(String[] args) {

        oddOReven(7);
        oddOReven(4);
        
    }
    
}
