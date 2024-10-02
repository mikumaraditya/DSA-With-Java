public class MultiInheritance {
    public static void main(String args[]){
        Aquetic A1=new Aquetic();
        A1.Bodyshape();
        A1.Gills();
    }
}
class Animal{
    void Adaptation(){
        System.out.println("Animals adapt to their environments.");
    }
    void Movement(){
        System.out.println("Every animal can move.");
    }
    void Composition(){
        System.out.println("All animals are composed of cells, tissues, and organs.");
    }
}
class Mammal extends Animal{       //MULTI LEVEL INHERITANCE BECAUSE MAMMAL CLASS INHERIT PROPERTIES FROM ANIMAL CLASS
        void FinsorFlippers(){
        System.out.println("They have fins and flippers.");
    }

    void Bodyshape(){
        System.out.println("Streamlined bodies that reduce drag while swimming.");
    }
}
class Aquetic extends Mammal{    // AQUETIC CLASS INHERIT PROPERTIES FROM MAMMAL CLASS  
    void Gills(){
        System.out.println("Aquetic animals  have gills for extrating oxygen from water.");
    }
    void Swimbladder(){
        System.out.println("Fish possess a swim bladder that helps them maintain buoyancy and statbility in water. ");
    }
}
