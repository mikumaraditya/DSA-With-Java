public class MethodOverriding {
    public static void main(String args[]){
        Animal a1=new Animal();
        a1.speak();
        Dog d1=new Dog();
        d1.speak();
        Cat c1=new Cat();
        c1.speak();
    }
}
class Animal{
    void speak(){
        System.out.println("Some sound");
    }
}
class Dog extends Animal{
    void speak(){
        System.out.println("Bark");
    }
}
class Cat extends Animal{
    void speak(){
        System.out.println("Meow");
    }
}
