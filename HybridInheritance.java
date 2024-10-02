public class HybridInheritance {
    public static void main(String args[]){
        Birds B1=new Birds();
        B1.Adaptation();
        B1.Wings();
    }
}
class Animal{
    void Adaptation(){       //     HYBRID INHERITANCE
        System.out.println("Animals adapt to their environments.");
    }
    void Movement(){
        System.out.println("Every animal can move.");
    }
    void Composition(){
        System.out.println("All animals are composed of cells, tissues, and organs.");
    }
}
class Mammal extends Animal{       //     MAMMAL CLASS INHERIT PROPERTIES FROM ANIMAL CLASS
        void FinsorFlippers(){
        System.out.println("They have fins and flippers.");
    }
    void Bodyshape(){
        System.out.println("Streamlined bodies that reduce drag while swimming.");
    }
}
class Aquetic extends Mammal{    //    AQUETIC CLASS ALSO INHERIT PROPERTIES FROM MAMMAL CLASS  
    void Gills(){
        System.out.println("Aquetic animals  have gills for extrating oxygen from water.");
    }
    void Swimbladder(){
        System.out.println("Fish possess a swim bladder that helps them maintain buoyancy and statbility in water. ");
    }
}
class Birds extends Animal{       // BIRDS CLASS INHERIT PROPERTIES FROM ANIMAL CLASS
    void Wings(){
        System.out.println("They wings to fly");
    }
    void Beak(){
        System.out.println("Birds have beaks instead of teeth");
    }

}
