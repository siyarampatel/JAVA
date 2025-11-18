//2d arrays
import java.util.*;
class class9_10array2d{
 
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of columns");
        int column = sc.nextInt();
        System.out.println("Enter no. of rows");
        int rows = sc.nextInt();
        int  [][] arr= new int [rows][column];
        System.out.println("Enter elements in 2d array: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<column; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<rows; i++){
            for(int j=0; j<column; j++){
                System.out.print(" "+arr[i][j]);
            }
            System.out.println("\n");
        }
        
    }
}