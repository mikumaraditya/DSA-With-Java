import java.util.*;
public class spiralmatrix{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};


        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;

        while(startcol<=endcol && startrow<=endrow){

        
        for(int j=startcol;j<=endcol;j++){
            System.out.print(matrix [startrow][j]+" ");
        }
        for(int i=startrow+1;i<=endrow;i++){
            System.out.print(matrix[i][endcol]+" ");
        }
        for(int j=endcol-1;j>=startcol;j--){
            if(startrow==endrow){
                break;
            }
            System.out.print(matrix[endrow][j]+" ");
        }
        for(int i=endrow-1;i>=startrow+1;i--){
            if(startcol==endcol){
                break;
            }
            System.out.print(matrix[i][startcol]+" ");
        }

        startrow++;
        startcol++;
        endrow--;
        endcol--;
    }
        
    }
}
