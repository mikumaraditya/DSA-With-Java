public class Binary_Search_2D_Array {
    public static void main(String args[]){

        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};

        int key =33;

        int row =0,col =matrix[0].length-1;

        while(row<matrix.length && col>=0){

            if(matrix[row][col]==key){
                System.out.print("Key is found at ("+row+","+col+")");
                break;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else if(key>matrix[row][col]){
                row++;
            }
            else{
                System.out.println("Key is not found");
            }
        }
    }
    
}
