public class abstractclass {
    public static void main(String args[]){
        Horse h1=new Horse();
        h1.eat();
        h1.walk();
        Chicken c1=new Chicken();
        c1.eat();
        c1.walk();
        // Animal a1=new Animal();  CANNOT CREATE OBJECT OF ABSTRACT CLASS

    }
    
}
abstract class Animal{
    void eat(){     //Non abstract method
        System.out.println("Animal Eats");
    }
    
    abstract void walk();    //Abstract method

}
class Horse extends Animal{
    void walk(){
        System.out.println("Horse walks on four legs");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("Chicken walk on two legs");
    }
}

