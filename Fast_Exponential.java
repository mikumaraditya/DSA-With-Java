public class Fast_Exponential {
    public static int Fast_Expo(int b,int p){
        int ans=1;
        while(p>0){
            
        if(p%2==0){
            p=p/2;
            b=b*b;
        }
        else{
            p=p-1;
            ans=ans*b;
        }
    }
    return ans;
    }
    public static void main(String args[]){

        System.out.println(Fast_Expo(2, 10));
    }  
}
