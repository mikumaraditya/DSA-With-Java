public class linearsearch {
    public static int linearsearch(String menu[],String key){

        for(int i=0;i<menu.length;i++){

            if(menu[i]==key){

                return i;
                
            }

        }
        return -1;

    }
    public static void main(String args[]){
        String menu[]={"Dosa","Chole Bhature","Samosa","Sandwich","Frooti","Coke"};

        String key="Dosa";
        int index= linearsearch(menu, key);

        System.out.println(index);
    }
    
}
