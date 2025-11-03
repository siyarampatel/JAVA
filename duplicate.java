public class duplicate{
    public static void main(String [] args){
      int arr [] = {1,3,4,5,2,2};
      findduplicate(arr);
      System.out.println(Arrays.toString(arr));
    }
        public static int findduplicate(int [] arr ){
            int i=0;
            while(i<arr.length){
                if(arr[i]!=i+1){
                    int correct = arr[i]-1;
                    if(arr[i]!=arr[correct]){
                        swap(arr,i,correcct);
                    }else{
                        return arr[i];
                    }
                }
            }else{
                i++;
            }
        }
        return -1;

         static void swap(int[]arr,int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}