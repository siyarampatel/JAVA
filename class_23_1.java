// https://leetcode.com/problems/majority-element

class class_23_1{
    public static void main(String [] args){
        int [] arr={4,4,5,5,5,4,3,3};
        int [] freq = new int [5];
        for(int i=0; i<arr.length; i++){
            freq[arr[i]]++;
        }
        for(int x: freq){
            System.out.println(x);
        }
    }
}