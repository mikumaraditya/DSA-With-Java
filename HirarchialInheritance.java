public class HirarchialInheritance {
    public static  void main(String args[]){
        Aquetic A1=new Aquetic();
        A1.Adaptation();
        A1.Swimbladder();
    }
}
class Animal{
    void Adaptation(){       //     HIERARCHIAL INHERITANCE
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
class Aquetic extends Animal{    //    AQUETIC CLASS ALSO INHERIT PROPERTIES FROM ANIMAL CLASS  
    void Gills(){
        System.out.println("Aquetic animals  have gills for extrating oxygen from water.");
    }
    void Swimbladder(){
        System.out.println("Fish possess a swim bladder that helps them maintain buoyancy and statbility in water. ");
    }
}
