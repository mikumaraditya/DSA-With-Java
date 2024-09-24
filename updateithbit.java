public class updateithbit {
    public static int SetIthBit(int n,int i){

        int bitMask=(1<<i);
        return n|bitMask;
    }
    public static int ClearIthBit(int n,int i){

        int bitMask=~(i<<i);
        return n&bitMask;
    }
    public static int UpdateIthBit(int n,int i,int newBit){
        if(newBit==0){
           return ClearIthBit(n, i);
        }
        else{
            return SetIthBit(n, i);
        }
    }
    public static void main(String args[]){
        System.out.println(UpdateIthBit(10, 1, 1));
    }
}
