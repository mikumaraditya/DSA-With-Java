public class ClearTbits {
    public static int ClearIBits(int n,int  i){

        int bitMask=(~0)<<i;

        return n&bitMask;
    }
    public static void main(String args[]){

        System.out.println(ClearIBits(15, 2));

    }
    
}
