public class SingleInheritance {
    public static void main(String args[]){
        Mammal M1=new Mammal();

        M1.Movement();
        M1.HairorFur();
    }
}
class Animal{
    void Adaptation(){
        System.out.println("Animals adapt to their environments");
    }

    void Movement(){
        System.out.println("Every animal can move");
    }

    void Composition(){
        System.out.println("All animals are composed of cells, tissues, and organs");
    }
}

class Mammal extends Animal{         // SINGLE LEVEL INHERITANCE

    void HairorFur(){
        System.out.println("Only mammals have hair or fur, providing insulation and protection");
    }
    void Endothermy(){
        System.out.println("Most mammals are warm-blooded maintaing a constant body temprature");
    }


}