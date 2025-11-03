public class binarysearch{
    public static void main(String[]args){
        int arr[]={5,7,2,7,2,6,9,2,5,7};
        int target = 9;
     int a = binary(arr,target);
        System.out.println(a);
    }
    public static int binary(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        while(start<=end){
            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}