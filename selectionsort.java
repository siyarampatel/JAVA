import java.util.*;
public class you{
    public static void main(String [] args){
        int arr[]={4,2,5,7,1,9,0,3,};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
     public static void sort(int[] arr){
            int n;

        for(int i=0; i<arr.length-1; i++){
            int min =i;
            
        for(int j=i+1; j<arr.length-1; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int t = arr[min];
            arr[min]=arr[i];
            arr[i]=t;
        }
     }
}