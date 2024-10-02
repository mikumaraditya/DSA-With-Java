public class adi{
    public static void main(String args[]){
        calculator c1=new calculator();
        System.out.println(c1.sum(2,3));
        System.out.println(c1.sum(2, 3, 5));
        System.out.println(c1.sum(3.3f, 5.5f));
    }
}
class calculator{           //METHOD OVERLOADING

    int sum(int a,int b){
        return a+b;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    }

    float sum(float a,float b){
        return a+b;
    }
}