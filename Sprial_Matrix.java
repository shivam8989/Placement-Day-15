package TwoDarray;
import java.util.*;
public class Sprial_Matrix {
    public static void print(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void Spiral(int arr[][]){
        int startrow = 0;
        int startcol = 0;
        int endrow = arr.length-1;
        int endcol = arr[0].length-1;
        while(startrow<=endcol && startcol<=endcol){
            // top
            for(int j = startcol; j<=endcol; j++){
                System.out.print(arr[startrow][j]+" ");
            }
            // right
            for(int i = startrow+1; i<=endrow; i++){
                System.out.print(arr[i][endcol]+" ");

            }
            // bottom
            for(int j = endcol-1; j>=startcol; j--){
                if(startrow==endrow){
                    break;
                }
                System.out.print(arr[endrow][j]+" ");
            }
            // left
            for(int i = endrow-1; i>=startrow; i--){
                if(startcol==endcol){
                    break;
                }
                System.out.print(arr[i][startcol]+" ");
            }

            startcol++;
            startrow++;

            endcol--;
            endrow--;

        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int [3][5];
        System.out.println("Enter the elements in array");
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        print(arr);
        Spiral(arr);
       //
        // print(arr);
    }
}
